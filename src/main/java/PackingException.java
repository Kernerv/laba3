/*Класс исключений для класса Packing
*/
public class PackingException extends Exception {
    private double number;

    public PackingException(String message, double num){
        super(message);
        number = num;
    }
    public PackingException(String message){
        super(message);
    }
    public double getNumber(){
        return number;
    }

}
