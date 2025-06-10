package data;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Класс {@code PantoneData} представляет данные о Pantone.
 *
 * @author Наливайко Дмитрий
 */
public class PantoneData {

    /**
     * Идентификатор данных Pantone
     */
    private Integer id;

    /**
     Название цвета Pantone
     */
    private String name;

    /**
     * Год, когда был выбран этот цвет Pantone
     */
    private Integer year;

    /**
     * Цвет Pantone в формате строки
     */
    private String color;

    /**
     Значение Pantone для данного цвета
     */
    @JsonProperty("pantone_value")
    private String pantoneValue;

    /**
     * Конструктор {@code PantoneData} по умолчанию.
     */
    public PantoneData() { super(); }

    /**
     * Конструктор {@code PantoneData} с параметрами для инициализации всех полей.
     *
     * @param id идентификатор данных Pantone
     * @param name название цвета Pantone
     * @param year год, когда был выбран этот цвет Pantone
     * @param color цвет Pantone в формате строки
     * @param pantoneValue значение Pantone для данного цвета
     */
    public PantoneData(Integer id, String name, Integer year, String color, String pantoneValue) {
        this.id = id;
        this.name = name;
        this.year = year;
        this.color = color;
        this.pantoneValue = pantoneValue;
    }

    /**
     * Метод {@code getId} возвращает идентификатор данных Pantone.
     *
     * @return идентификатор
     */
    public Integer getId() {
        return id;
    }

    /**
     * Метод {@code getName} возвращает название цвета Pantone.
     *
     * @return название цвета
     */
    public String getName() {
        return name;
    }

    /**
     * Метод {@code getYear} возвращает год, когда был выбран этот цвет Pantone.
     *
     * @return год
     */
    public Integer getYear() {
        return year;
    }

    /**
     * Метод {@code getColor} возвращает цвет Pantone в формате строки.
     *
     * @return цвет
     */
    public String getColor() {
        return color;
    }

    /**
     * Метод {@code getPantoneValue} возвращает значение Pantone для данного цвета.
     *
     * @return значение Pantone
     */
    public String getPantoneValue() {
        return pantoneValue;
    }
}
