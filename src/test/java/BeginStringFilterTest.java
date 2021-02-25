import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BeginStringFilterTest {

    @Test
    void testApplyWithCorrectedParameter() throws FilterException {
        String str = "Мама мыла раму";
        BeginStringFilter filter1 = new BeginStringFilter("Мама");
        BeginStringFilter filter2 = new BeginStringFilter("мыла");
        assertTrue(filter1.apply(str));
        assertFalse(filter2.apply(str));
    }

    @Test
    void testApplyWithUncorrectedParameter() throws FilterException {
        String str = "";
        BeginStringFilter filter1 = new BeginStringFilter("Мама");
        assertThrows(FilterException.class, ()->filter1.apply(str));
    }
}