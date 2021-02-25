public class PackingWeightGoods implements IPackingWeightGoods{
    private Packing packing;
    private WeightGoods weightGoods;

    /**
     * Конструктор по товару, массе товара и упаковке
     * @param goods - товар
     * @param weightOfGoods - масса
     * @param packing - упаковка
     */
    public PackingWeightGoods(Goods goods, double weightOfGoods, Packing packing) throws GoodsException {
        this.packing = packing;
        this.weightGoods = new WeightGoods(goods, weightOfGoods);
    }

    /**
     * Метод: получить массу брутто (упаковки и товара вместе)
     * @return  масса брутто (упаковки и товара вместе)
     */
    @Override
    public double getWeight() {
        return packing.getWeight() + weightGoods.getWeight();
    }

    /**
     * Метод: получить массу нетто (только товара)
     * @return масса нетто (только товара)
     */
    public double getWeightWithoutPacking(){
        return weightGoods.getWeight();
    }

    @Override
    public Goods getGoods() {
        return weightGoods;
    }

}
