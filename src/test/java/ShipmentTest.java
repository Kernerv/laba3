import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ShipmentTest {

    @Test
    void getWeight() throws GoodsException, PackingException {
        IPackingWeightGoods[] arr = new IPackingWeightGoods[4];
        Packing pack = new Packing("Упаковка 1", 0.001);
        Packing pack1 = new Packing("Упаковка 2", 0.002);
        Goods goods = new Goods("Товар", "Описание");
        PieceGoods pieceGoods = new PieceGoods("Штучный товар", "и его описание", 0.2);
        arr[0] = new PackingPieceGoods(pack,3, pieceGoods);
        arr[1] = new PackingWeightGoods(goods, 0.5, pack1);
        arr[2] = new PackingPieceGoods(pack,5, pieceGoods);
        arr[3] = new PackingPieceGoods(pack1, 6, pieceGoods);
        Shipment shipment = new Shipment("Сундук", arr);
        assertEquals(3.306, shipment.getWeight());

    }
}
