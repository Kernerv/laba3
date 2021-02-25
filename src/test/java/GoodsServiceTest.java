import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GoodsServiceTest {

    @Test
    void countByFilter() throws PackingException, GoodsException, FilterException {
        IPackingWeightGoods[] arr = new IPackingWeightGoods[4];

        Packing pack = new Packing("Упаковка 1", 0.001);
        Packing pack1 = new Packing("Упаковка 2", 0.002);

        Goods goods = new Goods("Товар", "Описание");
        PieceGoods pieceGoods = new PieceGoods("товар", "Уп и его описание", 0.2);
        arr[0] = new PackingPieceGoods(pack,3, pieceGoods);
        arr[1] = new PackingWeightGoods(goods, 0.5, pack1);
        arr[2] = new PackingPieceGoods(pack,5, pieceGoods);
        arr[3] = new PackingPieceGoods(pack1, 6, pieceGoods);
        Shipment shipment = new Shipment("Сундук", arr);
        BeginStringFilter filt = new BeginStringFilter("Уп");
        assertEquals(3, GoodsService.countByFilter(shipment,filt));
    }

    @Test
    void checkAllWeighted() throws PackingException, GoodsException, FilterException {
        IPackingWeightGoods[] arr = new IPackingWeightGoods[4];

        Packing pack = new Packing("Упаковка 1", 0.001);
        Packing pack1 = new Packing("Упаковка 2", 0.002);

        Goods goods = new Goods("Товар", "Описание");
        PieceGoods pieceGoods = new PieceGoods("товар", "Уп и его описание", 0.2);
        arr[0] = new PackingPieceGoods(pack,3, pieceGoods);
        arr[1] = new PackingWeightGoods(goods, 0.5, pack1);
        arr[2] = new PackingPieceGoods(pack,5, pieceGoods);
        arr[3] = new PackingPieceGoods(pack1, 6, pieceGoods);
        Shipment shipment = new Shipment("Сундук", arr);
        BeginStringFilter filt = new BeginStringFilter("Уп");
        assertFalse(GoodsService.checkAllWeighted(shipment));

        IPackingWeightGoods[] arr1 = new IPackingWeightGoods[3];
        Goods goods1 = new Goods("Товарище", "Описание");
        arr1[0] = new PackingWeightGoods(goods1, 0.7, pack1);
        arr1[1] = new PackingWeightGoods(goods, 0.5, pack);
        arr1[2] = new PackingWeightGoods(goods, 0.1, pack1);
        Shipment shipment1 = new Shipment("Коробок", arr1);
        assertTrue(GoodsService.checkAllWeighted(shipment1));

    }
}
