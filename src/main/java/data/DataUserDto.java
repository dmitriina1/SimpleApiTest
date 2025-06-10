package data;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Класс {@code DataUserDto} представляет объект передачи данных (DTO) для информации о пользователе.
 *
 * @author Наливайко Дмитрий
 */
public class DataUserDto {

    /**
     * Уникальный идентификатор пользователя
     */
    private String id;

    /**
     * Адрес электронной почты пользователя
     */
    private String email;

    /**
     Имя пользователя
     */
    @JsonProperty("first_name")
    private String firstName;

    /**
     Фамилия пользователя
     */
    @JsonProperty("last_name")
    private String lastName;

    /**
     * URL аватара пользователя
     */
    private String avatar;

    /**
     * Конструктор {@code DataUserDto} по умолчанию.
     */
    public DataUserDto() {
        super();
    }

    /**
     * Конструктор {@code DataUserDto} с параметрами.
     *
     * @param id идентификатор пользователя
     * @param email адрес электронной почты
     * @param firstName имя пользователя
     * @param lastName фамилия пользователя
     * @param avatar URL аватара
     */
    public DataUserDto(String id, String email, String firstName, String lastName, String avatar) {
        this.id = id;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.avatar = avatar;
    }

    /**
     * Метод {@code getId} возвращает идентификатор пользователя.
     *
     * @return текущий идентификатор
     */
    public String getId() {
        return id;
    }

    /**
     * Метод {@code getEmail} возвращает адрес электронной почты.
     *
     * @return текущий email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Метод {@code getFirstName} возвращает имя пользователя.
     *
     * @return текущее имя
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Метод {@code getLastName} возвращает фамилию пользователя.
     *
     * @return текущая фамилия
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Метод {@code getAvatar} возвращает URL аватара.
     *
     * @return текущий URL аватара
     */
    public String getAvatar() {
        return avatar;
    }

    /**
     * Метод {@code setId} устанавливает новый идентификатор.
     *
     * @param id новый идентификатор пользователя
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Метод {@code setEmail} устанавливает новый email.
     *
     * @param email новый адрес электронной почты
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Метод {@code setFirstName} устанавливает новое имя.
     *
     * @param firstName новое имя пользователя
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Метод {@code setLastName} устанавливает новую фамилию.
     *
     * @param lastName новая фамилия пользователя
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Метод {@code setAvatar} устанавливает новый URL аватара.
     *
     * @param avatar новый URL аватара
     */
    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }
}
