public class PackingPieceGoods implements IPackingWeightGoods{
    private Packing packing;
    private int countOfPieceGoods;
    private PieceGoods pieceGoods;

    public PackingPieceGoods(Packing packing, int countOfPieceGoods, PieceGoods pieceGoods) throws GoodsException {
        if(countOfPieceGoods <= 0){
            throw new GoodsException("Кол-во товаров отрицательно!", countOfPieceGoods);
        }
        this.packing = packing;
        this.countOfPieceGoods = countOfPieceGoods;
        this.pieceGoods = pieceGoods;
    }

    int getCountOfPieceGoods(){
        return countOfPieceGoods;
    }

    /**
     * Метод: получить массу брутто (упаковки и всех единиц товара вместе)
     * @return масса брутто (упаковки и всех единиц товара вместе)
     */
    @Override
    public double getWeight() {
        return getWeightWithoutPacking() + packing.getWeight();
    }
    /**
     * Метод: получить массу нетто(суммарный вес всех единиц товара)
     * @return масса нетто(суммарный вес всех единиц товара)
     */
    public double getWeightWithoutPacking(){
        return countOfPieceGoods*pieceGoods.getWeight();
    }

    @Override
    public Goods getGoods() {
        return pieceGoods;
    }


}
