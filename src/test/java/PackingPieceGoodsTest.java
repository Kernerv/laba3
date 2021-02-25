import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PackingPieceGoodsTest {

    @Test
    void testGetCountOfGoods() throws GoodsException, PackingException {
        PackingPieceGoods test = new PackingPieceGoods(
                new Packing("Название упаковки", 0.001), 7,
                new PieceGoods("Паста", "Белоснежные зубки", 0.05));
        assertEquals(7, test.getCountOfPieceGoods());

    }

    @Test
    void testGetWeightOfAllGoods() throws PackingException, GoodsException {
        PackingPieceGoods test = new PackingPieceGoods(
                new Packing("Название упаковки", 0.001), 5,
                new PieceGoods("Паста", "Белоснежные зубки", 0.05));
        assertEquals(0.25, test.getWeightWithoutPacking());
    }

    @Test
    void TestGetWeightOfAllGoodsWithPacking() throws GoodsException, PackingException {
        PackingPieceGoods test = new PackingPieceGoods(new Packing("Название упаковки", 0.001),
                6, new PieceGoods("Паста", "Белоснежные зубки", 0.05));
        assertTrue(Math.abs(0.301- test.getWeight()) < 10e-5);
    }
}