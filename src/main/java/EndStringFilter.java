/**
 * Класс EndStringFilter, реализующий интерфейс Filter
 */
public class EndStringFilter implements Filter {

    private String pattern;
    EndStringFilter(String pattern) throws FilterException{
        if(pattern.isEmpty()){
            throw new FilterException("Подаваймая как pattern строка пуста");
        }
        this.pattern = pattern;
    }
    /**
     * Метод apply(str) проверяет, что строка str заканчивается с подстроки pattern.
     */

    @Override
    public boolean apply(String string) throws FilterException{
        if(string.isEmpty()){
            throw new FilterException("Подаваймая в фильтр строка пуста");
        }
        return string.endsWith(pattern);
    }

}
