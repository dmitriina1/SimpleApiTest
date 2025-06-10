package helpers;

import org.testng.annotations.DataProvider;

import java.util.stream.Stream;

/**
 * Класс {@code DPclass} предназначен для предоставления значений параметров теста.
 * Используется в тестах для генерации различных наборов данных, необходимых для проверки функциональности.
 *
 * @author Наливайко Дмитрий
 *
 */
public class DPclass {

    /**
     * Метод {@code providerSuccessLogin} предоставляет значения для тестирования успешного логина.
     * Возвращает их в виде потока аргументов, который может быть использован в параметризованных тестах.
     *
     * @return поток значений параметров, содержащий почту, пароль и токен.
     */
    @DataProvider(name = "providerSuccessLogin")
    public static Object[][] providerSuccessLogin() {
        return new Object[][]{
                {"eve.holt@reqres.in", "cityslicka", "QpwL5tke4Pnpja7X4"}
        };
    }

    /**
     * Метод {@code provideUnSuccessLogin} предоставляет значения для тестирования логина с ошибкой.
     * Возвращает их в виде потока аргументов, который может быть использован в параметризованных тестах.
     *
     * @return поток значений параметров, содержащий почту и название ошибки.
     */
    @DataProvider(name = "provideUnSuccessLogin")
    public static Object[][] provideUnSuccessLogin() {
        return new Object[][]{
                {"peter@klaven", "Missing password"}
        };
    }
}
