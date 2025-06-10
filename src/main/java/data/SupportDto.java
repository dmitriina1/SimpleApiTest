package data;

/**
 * Класс {@code SupportDto} представляет объект передачи данных (DTO) для дополнительной информации.
 *
 * @author Наливайко Дмитрий
 */
public class SupportDto {

    /**
     * URL-адрес ресурса поддержки
     */
    private String url;

    /**
     * Текстовое описание поддержки
     */
    private String text;

    /**
     * Конструктор {@code SupportDto} по умолчанию.
     */
    public SupportDto() {
        super();
    }

    /**
     * Конструктор {@code SupportDto} с параметрами.
     *
     * @param url URL-адрес поддержки
     * @param text текстовое описание поддержки
     */
    public SupportDto(String url, String text) {
        this.url = url;
        this.text = text;
    }

    /**
     * Метод {@code getUrl} возвращает текущий URL поддержки.
     *
     * @return текущее значение URL-адреса
     */
    public String getUrl() {
        return url;
    }

    /**
     * Метод {@code setUrl} устанавливает новое значение URL.
     *
     * @param url новый URL-адрес поддержки
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * Метод {@code getText} возвращает текущий текст поддержки.
     *
     * @return текущее текстовое описание
     */
    public String getText() {
        return text;
    }

    /**
     * Метод {@code setText} устанавливает новое текстовое описание.
     *
     * @param text новый текст поддержки
     */
    public void setText(String text) {
        this.text = text;
    }
}
