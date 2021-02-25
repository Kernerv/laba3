//Класс исключений для класса Goods, наследуемых классов и т.д

public class GoodsException extends Exception {
    double number;
    public GoodsException(String message){
        super(message);
    }
    public GoodsException(String message, double num){
        super(message);
        number = num;
    }
    public double getNumber(){
        return number;
    }
}
