import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PackingWeightGoodTest {
    @Test
    void testGetWeightOfGoods() throws GoodsException, PackingException {
        PackingWeightGoods test = new PackingWeightGoods(
                new WeightGoods("Сахар", "Тросниковый сахар", 0.5), 0.5,
                new Packing("Название упаковки", 0.001));
        assertEquals(0.5, test.getWeightWithoutPacking());
    }

    @Test
    void testGetWeightWithPacking() throws GoodsException, PackingException {
        PackingWeightGoods test = new PackingWeightGoods(
                new WeightGoods("Сахар", "Тросниковый сахар", 0.5), 0.5,
                new Packing("Название упаковки", 0.003));
        assertEquals(0.503, test.getWeight());
    }
}
