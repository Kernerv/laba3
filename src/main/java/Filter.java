/**
 * Интерфейс «Фильтр» с единственным методом apply. Метод получает на вход строку
 * и возвращает логическое значение (строка удовлетворяет условию фильтра или нет).
 */
public interface Filter {
    boolean apply(String string) throws FilterException;
}
