/**
 * Класс «Партия товаров». Партия товаров имеет описание и содержит некоторое
 * количество упакованных товаров, возможно, разных типов (в том числе наборов
 * товаров).
 */
public class Shipment{
    private String description;
    private IPackingWeightGoods[] shipment;

    /**
     * Конструктор по произвольному набору упаковок товаров
     * @param description описание
     * @param arr Произвольный набор упаковок товаров
     * @throws GoodsException если описание пусто
     */
    public Shipment(String description,IPackingWeightGoods ... arr) throws GoodsException {
        if(description.isEmpty()){
            throw new GoodsException("Название товара пусто");
        }
        shipment = arr;
        this.description = description;
    }
    /**
     * Метод: получить массу всей партии
     * @return масса всей партии
     */
    public double getWeight() {
        double result = 0;
        for(IPackingWeightGoods temp: shipment){
            result += temp.getWeight();
        }
        return result;
    }

    public IPackingWeightGoods[] getShipment(){
        return shipment;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
