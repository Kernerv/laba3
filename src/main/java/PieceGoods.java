public class PieceGoods extends Goods implements IWeight{
    /**
     * Класс «Штучный товар». Штучный товар хранит название, описание и вес одной
     * штуки товара (в кг).
     * Наследуется от товара
     */
    private double weight;

    /**
     * Конструктор по всем трем полям
     */
    public PieceGoods(String name, String description, double weightOfGoods) throws GoodsException{
        super(name, description);
        if(weightOfGoods <= 0){
            throw new GoodsException("Вес отрицательный", weightOfGoods);
        }
        weight = weightOfGoods;
    }

    public double getWeight(){
        return weight;
    }

    public void setWeight(double weight){
        this.weight = weight;
    }
}