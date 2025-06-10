package data;

/**
 * Класс {@code unSuccessLogin} представляет ответ при неудачной попытке входа.
 * Содержит информацию об ошибке аутентификации.
 *
 * @author Наливайко Дмитрий
 */
public class unSuccessLogin {

    /** Сообщение об ошибке */
    private String error;

    /**
     * Конструктор {@code unSuccessLogin} по умолчанию.
     */
    public unSuccessLogin(){super();}

    /**
     * Метод {@code getError} возвращает сообщение об ошибке.
     *
     * @return текст ошибки входа
     */
    public String getError() {
        return error;
    }

    /**
     * Конструктор {@code unSuccessLogin} с параметром ошибки.
     *
     * @param error сообщение об ошибке аутентификации
     */
    public unSuccessLogin(String error) {
        this.error = error;
    }

}
