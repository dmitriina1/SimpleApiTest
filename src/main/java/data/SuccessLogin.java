package data;

/**
 * Класс {@code SuccessLogin} представляет ответ при успешной попытке входа.
 * Содержит информацию о токене, который возвращается после успешной аутентификации.
 *
 * @author Наливайко Дмитрий
 */
public class SuccessLogin {

    /**
     * Токен, возвращаемый при успешном входе
     */
    private String token;

    /**
     * Конструктор {@code SuccessLogin} по умолчанию.
     */
    public SuccessLogin(){super();}

    /**
     * Конструктор {@code SuccessLogin} с параметром токена.
     *
     * @param token токен, возвращаемый при успешном входе
     */
    public SuccessLogin(String token) {
        this.token = token;
    }

    /**
     * Метод {@code getToken} возвращает токен, полученный при успешной аутентификации.
     *
     * @return токен
     */
    public String getToken() {
        return token;
    }
}
