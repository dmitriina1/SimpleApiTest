package ru.reqres;

import data.*;
import helpers.DPclass;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import static helpers.Properties.testsProperties;
import static org.jsoup.parser.Parser.xmlParser;
import java.util.List;
import java.util.stream.Collectors;

import static io.restassured.RestAssured.given;
import static specification.Specification.*;

/**
 * Класс {@code Tests} содержит тесты для проверки работы API и функциональности различных эндпоинтов.
 * Включает тесты для проверки пользователей, логинов, данных, и XML-ответов.
 *
 * @author Наливайко Дмитрий
 */
public class Tests {

    /**
     * Тест {@code takeUsersAndCheckAvatarsTest} проверяет, что имена файлов аватаров пользователей уникальны.
     * Этот тест получает список пользователей со второй страницы и проверяет, что имена файлов аватаров не повторяются.
     */
    @Test
    public void takeUsersAndCheckAvatarsTest() {
        installSpec(requestSpec(testsProperties.reqresUrl()), responseSpec200());
        List<DataUserDto> users = given()
                .get(testsProperties.reqresUsersPage())
                .then()
                .log().all()
                .extract().body().jsonPath().getList("data", DataUserDto.class);

        Assert.assertNotNull(users);
        Assert.assertEquals(users.size(), users.stream()
                .map(user -> user.getAvatar().substring(user.getAvatar().lastIndexOf('/') + 1))
                .collect(Collectors.toSet())
                .size());
    }

    /**
     * Тест {@code successLoginTest} проверяет успешный логин пользователя.
     * Этот тест отправляет запрос на вход с предоставленными email и паролем,
     * и проверяет, что токен в ответе соответствует ожидаемому.
     *
     * @param email    электронная почта пользователя
     * @param password пароль пользователя
     * @param token    ожидаемый токен
     */
    @Test(dataProvider = "providerSuccessLogin", dataProviderClass = DPclass.class)
    public void successLoginTest(String email, String password, String token) {
        installSpec(requestSpec(testsProperties.reqresUrl()), responseSpec200());
        SuccessLogin expectedLogin = new SuccessLogin(token);
        Login user = new Login(email, password);
        SuccessLogin successLogin = given()
                .body(user)
                .post(testsProperties.reqresLogin())
                .then()
                .log().body()
                .extract().body().as(SuccessLogin.class);
        Assert.assertNotNull(successLogin.getToken());
        Assert.assertEquals(successLogin.getToken(), expectedLogin.getToken());
    }

    /**
     * Тест {@code unSuccessLoginTest} проверяет неудачный логин пользователя.
     * Этот тест отправляет запрос на вход с некорректными данными (например, без пароля)
     * и проверяет, что в ответе присутствует сообщение об ошибке.
     *
     * @param email электронная почта пользователя
     * @param error ожидаемое сообщение об ошибке
     */
    @Test(dataProvider = "provideUnSuccessLogin", dataProviderClass = DPclass.class)
    public void unSuccessLoginTest(String email, String error) {
        installSpec(requestSpec(testsProperties.reqresUrl()), responseSpec400());
        unSuccessLogin expectedLogin = new unSuccessLogin(error);
        Login user = new Login(email);
        unSuccessLogin successLogin = given()
                .body(user)
                .post(testsProperties.reqresLogin())
                .then()
                .log().body()
                .extract().body().as(unSuccessLogin.class);
        Assert.assertNotNull(successLogin.getError());
        Assert.assertEquals(successLogin.getError(), expectedLogin.getError());
    }

    /**
     * Тест {@code sortedYearsTest} проверяет, что данные о Pantone отсортированы по годам.
     * Этот тест получает список данных Pantone и проверяет, что список годов в ответе отсортирован по возрастанию.
     */
    @Test
    public void sortedYearsTest(){
        installSpec(requestSpec(testsProperties.reqresUrl()), responseSpec200());
        List<PantoneData> pantoneDataList = given()
                .get(testsProperties.reqresResList())
                .then()
                .log().all()
                .extract().body().jsonPath().getList("data", PantoneData.class);

        Assert.assertNotNull(pantoneDataList);
        List<Integer> years = pantoneDataList.stream()
                .map(PantoneData::getYear)
                .collect(Collectors.toList());

        List<Integer> sortedYears = years.stream()
                .sorted()
                .collect(Collectors.toList());

        Assert.assertEquals(years, sortedYears);
    }

    /**
     * Тест {@code tagCountTest} проверяет количество тегов в XML-ответе от сервиса.
     * Этот тест отправляет запрос и проверяет, что в ответе содержится ровно 15 тегов.
     */
    @Test
    public void tagCountTest(){
        installSpec(requestSpec(testsProperties.gatewayUrl(), testsProperties.contentTypeXML()), responseSpec200());
        String response = given()
                .get(testsProperties.gatewayUrl())
                .then()
                .log().body()
                .extract().body().asString();

        Assert.assertNotNull(response);
        Document doc = Jsoup.parse(response, "" ,xmlParser());
        int tagCount = doc.getAllElements().size();
        Assert.assertEquals(tagCount, 15, "Количество тегов в ответе должно быть равно " + 15);
    }
}