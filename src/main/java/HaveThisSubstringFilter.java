/**
 * Класс HaveThisSubstringFilter, реализующий интерфейс Filter
 */

public class HaveThisSubstringFilter implements Filter {
    private String pattern;

    HaveThisSubstringFilter(String pattern) throws FilterException {
        if (pattern.isEmpty()) {
            throw new FilterException("Подаваймая как pattern строка пуста");
        }
        this.pattern = pattern;
    }

    /**
     * Метод apply(str) проверяет, что в строке есть подстрока(pattern).
     */

    @Override
    public boolean apply(String string) throws FilterException {
        if (string.isEmpty()) {
            throw new FilterException("Подаваймая в фильтр строка пуста");
        }
        return string.contains(pattern);
    }

}
