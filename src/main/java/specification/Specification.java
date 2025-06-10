package specification;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

import static helpers.Properties.testsProperties;

/**
 * Класс {@code Specification} для работы со спецификациями запросов и ответов API.
 * Предоставляет методы для создания и управления спецификациями,
 * а также их установки в RestAssured.
 *
 * @author Наливайко Дмитрий
 */
public class Specification {

    /**
     * Метод {@code requestSpec} создает спецификацию запроса с базовым URL и JSON-типом контента.
     *
     * @param url базовый URL для запроса
     *
     * @return спецификация запроса с настройками:
     *         - Базовый URL
     *         - ContentType = application/json (из Properties)
     */
    public static RequestSpecification requestSpec(String url){
        return new RequestSpecBuilder()
            .setBaseUri(url)
                .setContentType(testsProperties.contentTypeJson())
                .build();
    }

    /**
     * Метод {@code requestSpec} создает спецификацию запроса с кастомным типом контента.
     *
     * @param url базовый URL
     * @param contentType тип контента (например, application/xml)
     *
     * @return спецификация запроса с настройками:
     *         - Базовый URL
     *         - Указанный ContentType
     */
    public static RequestSpecification requestSpec(String url, String contentType){
        return new RequestSpecBuilder()
                .setBaseUri(url)
                .setContentType(contentType)
                .build();
    }

    /**
     * Метод {@code responseSpec200} создает спецификацию ответа с ожиданием статуса 200 OK.
     *
     * @return спецификация ответа с проверкой:
     *         - StatusCode = 200
     */
    public static ResponseSpecification responseSpec200(){
        return new ResponseSpecBuilder()
                .expectStatusCode(200)
                .build();
    }

    /**
     * Метод {@code responseSpec400} создает спецификацию ответа с ожиданием статуса 400 Bad Request.
     *
     * @return спецификация ответа с проверкой:
     *         - StatusCode = 400
     */
    public static ResponseSpecification responseSpec400(){
        return new ResponseSpecBuilder()
                .expectStatusCode(400)
                .build();
    }

    /**
     * Метод {@code installSpec} устанавливает спецификацию ответа в RestAssured.
     *
     * @param response спецификация ответа для установки
     */
    public static void installSpec(ResponseSpecification response) {
        RestAssured.responseSpecification = response;
    }

    /**
     * Метод {@code installSpec} устанавливает спецификацию запроса в RestAssured.
     *
     * @param request спецификация запроса для установки
     */
    public static void installSpec(RequestSpecification request) {
        RestAssured.requestSpecification = request;
    }

    /**
     * Метод {@code installSpec} устанавливает обе спецификации (запроса и ответа) в RestAssured.
     *
     * @param request спецификация запроса
     * @param response спецификация ответа
     */
    public static void installSpec(RequestSpecification request,
                                   ResponseSpecification response) {
        RestAssured.requestSpecification = request;
        RestAssured.responseSpecification = response;
    }

    /**
     * Метод {@code deleteSpec} сбрасывает установленные спецификации в RestAssured.
     * Используется для очистки контекста между тестами.
     */
    public static void deleteSpec() {
        RestAssured.requestSpecification = null;
        RestAssured.responseSpecification = null;
    }

}
