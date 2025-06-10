package helpers;

import org.aeonbits.owner.Config;

/**
 * Интерфейс {@code TestsProperties} предназначен для определения конфигурационных параметров,
 * используемых в тестах.
 *
 * @author Наливайко Дмитрий
 */
@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({"system:properties",
        "system:env",
        "file:src/main/resources/tests.properties"
})
public interface TestsProperties extends Config{

    /**
     * Возвращает URL для страницы сайта reqres.in.
     *
     * @return URL сайта reqres.in
     */
    @Config.Key("reqres.url")
    String reqresUrl();

    /**
     * Этот URL используется для получения списка пользователей на 2 странице API Reqres
     *
     * @return URL для страницы пользователей
     */
    @Config.Key("reqresAPIUsersPage.url")
    String reqresUsersPage();

    /**
     * Возвращает URL для выполнения запроса на вход в систему через API Reqres.
     *
     * @return URL для логина в систему через API Reqres.
     */
    @Config.Key("reqresAPI.login")
    String reqresLogin();

    /**
     * Возвращает URL для списка Pantone сайта reqres.in.
     *
     * @return URL для страницы пользователей
     */
    @Config.Key("reqresAPIResourse.list")
    String reqresResList();

    /**
     * Возвращает URL для страницы сайта gateway.autodns.com.
     *
     * @return URL сайта gateway.autodns.com
     */
    @Config.Key("gateway.url")
    String gatewayUrl();

    /**
     * Возвращает contentType для установки спецификации файлов json.
     *
     * @return contentType для json
     */
    @Config.Key("contentType.json")
    String contentTypeJson();

    /**
     * Возвращает contentType для установки спецификации файлов xml.
     *
     * @return contentType для xml
     */
    @Config.Key("contentType.xml")
    String contentTypeXML();


}