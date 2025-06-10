package data;

/**
 * Класс {@code Login} представляет модель данных для авторизации,
 * содержащую электронную почту и пароль пользователя.
 *
 * @author Наливайко Дмитрий
 */
public class Login {

    private String email;
    private String password;

    /**
     * Метод {@code Login} конструктор по умолчанию.
     */
    public Login(){super();}

    /**
     * Метод {@code Login} создает объект с полным набором авторизационных данных.
     *
     * @param email почта пользователя
     * @param password пароль пользователя
     */
    public Login(String email, String password) {
        this.email = email;
        this.password = password;
    }

    /**
     * Метод {@code Login} создает объект с частичными данными (без пароля).
     *
     * @param email почта пользователя
     */
    public Login(String email) {
        this.email = email;
    }

    /**
     * Метод {@code getEmail} возвращает почту пользователя.
     *
     * @return строка с почтой
     */
    public String getEmail() {
        return email;
    }

    /**
     * Метод {@code getPassword} возвращает пароль пользователя.
     *
     * @return строка с паролем
     */
    public String getPassword() {
        return password;
    }
}
