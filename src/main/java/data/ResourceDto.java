package data;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Класс {@code ResourceDto} представляет ответ API с данными.
 *
 * @author Наливайко Дмитрий
 */
public class ResourceDto {

    /**
     * Текущая страница выборки
     */
    private String page;

    /**
     * Количество элементов на странице
     */
    @JsonProperty("per_page")
    private String perPage;

    /**
     * Общее количество элементов
     */
    private String total;

    /**
     * Всего страниц
     */
    @JsonProperty("total_pages")
    private String totalPages;

    /**
     * Список пользователей на текущей странице
     */
    private List<DataUserDto> data;

    /**
     * Дополнительная информация
     */
    private SupportDto support;

    /**
     * Конструктор {@code ResourceDto} по умолчанию.
     */
    public ResourceDto() {
        super();
    }

    /**
     * Конструктор {@code ResourceDto} с полной инициализацией полей.
     *
     * @param page текущая страница
     * @param perPage элементов на странице
     * @param total общее количество элементов
     * @param totalPages всего страниц
     * @param data список пользователей
     * @param support дополнительная информация
     */
    public ResourceDto(String page, String perPage, String total, String totalPages, List<DataUserDto> data, SupportDto support) {
        this.page = page;
        this.perPage = perPage;
        this.total = total;
        this.totalPages = totalPages;
        this.data = data;
        this.support = support;
    }

    /**
     * Метод {@code getPage} возвращает номер текущей страницы.
     *
     * @return текущая страница в виде строки
     */
    public String getPage() {
        return page;
    }

    /**
     * Метод {@code getPerPage} возвращает количество элементов на странице.
     *
     * @return количество элементов
     */
    public String getPerPage() {
        return perPage;
    }

    /**
     * Метод {@code getTotal} возвращает общее количество элементов.
     *
     * @return общее количество элементов
     */
    public String getTotal() {
        return total;
    }

    /**
     * Метод {@code getTotalPages} возвращает общее количество страниц.
     *
     * @return всего страниц (маппинг из "total_pages")
     */
    public String getTotalPages() {
        return totalPages;
    }

    /**
     * Метод {@code getData} возвращает список пользователей.
     *
     * @return список объектов {@code DataUserDto}
     */
    public List<DataUserDto> getData() {
        return data;
    }

    /**
     * Метод {@code getSupport} возвращает дополнительную информацию.
     *
     * @return объект {@code SupportDto}
     */
    public SupportDto getSupport() {
        return support;
    }

    /**
     * Метод {@code setPage} устанавливает номер страницы.
     *
     * @param page новый номер страницы
     */
    public void setPage(String page) {
        this.page = page;
    }

    /**
     * Метод {@code setPerPage} устанавливает количество элементов на странице.
     *
     * @param perPage новое количество элементов
     */
    public void setPerPage(String perPage) {
        this.perPage = perPage;
    }

    /**
     * Метод {@code setTotal} устанавливает общее количество элементов.
     *
     * @param total новое общее количество
     */
    public void setTotal(String total) {
        this.total = total;
    }

    /**
     * Метод {@code setTotalPages} устанавливает общее количество страниц.
     *
     * @param totalPages новое количество страниц
     */
    public void setTotalPages(String totalPages) {
        this.totalPages = totalPages;
    }

    /**
     * Метод {@code setData} обновляет список пользователей.
     *
     * @param data новый список объектов {@code DataUserDto}
     */
    public void setData(List<DataUserDto> data) {
        this.data = data;
    }

    /**
     * Метод {@code setSupport} обновляет дополнительную информацию.
     *
     * @param support новый объект {@code SupportDto}
     */
    public void setSupport(SupportDto support) {
        this.support = support;
    }
}
