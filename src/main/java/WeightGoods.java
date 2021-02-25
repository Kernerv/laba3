public class WeightGoods extends Goods implements IWeight {
    /**
     * Класс «Весовой товар». Весовой товар хранит название и описание.
     * Наследуется от товара
     */
    private double weightOfGoods;
    public WeightGoods(String name, String description, double weightOfGoods) throws GoodsException{
        super(name, description);
        if(weightOfGoods <= 0){
            throw new GoodsException("Вес товара отрицателен", weightOfGoods);
        }
        this.weightOfGoods = weightOfGoods;
    }

    public WeightGoods(Goods goods, double weightOfGoods) throws GoodsException {
        super(goods.getName(), goods.getDescription());
        if(weightOfGoods <= 0){
            throw new GoodsException("Вес товара отрицателен", weightOfGoods);
        }
        this.weightOfGoods = weightOfGoods;
    }

    @Override
    public double getWeight() {
        return weightOfGoods;
    }
}
