public class GoodsService {
    /**
     * Метод, который получает на вход партию товара и произвольный
     * фильтр.
     * @param shipment партия товара
     * @param filter фильтр
     * @return Количество элементов партии, имена которых удовлетворяют фильтру
     */
    public static int countByFilter(Shipment shipment, Filter filter) throws FilterException {
        int counter = 0;
        String tempDescription;
        for(IPackingWeightGoods temp: shipment.getShipment()){
            tempDescription = temp.getGoods().getDescription();
            if(filter.apply(tempDescription)){
                counter++;
            }
        }
        return counter;
    }

    /**
     * Метод, который для партии товаров проверит, что вся партия
     * состоит только из весовых товаров.
     * @return true, если содержит необходимый набор, false - в ином случае
     */

    public static boolean checkAllWeighted(Shipment shipment){
        Goods tempGoods;
        for (IPackingWeightGoods temp: shipment.getShipment()){
            tempGoods = temp.getGoods();
            if(!(tempGoods instanceof WeightGoods)){
                return false;
            }
        }
        return true;
    }

}
