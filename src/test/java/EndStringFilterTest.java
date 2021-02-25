import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EndStringFilterTest {

    @Test
    void testApplyWithCorrectedParameter() throws FilterException {
        String str = "Мама мыла раму";
        EndStringFilter filter1 = new EndStringFilter("раму");
        EndStringFilter filter2 = new EndStringFilter("мыла");
        assertTrue(filter1.apply(str));
        assertFalse(filter2.apply(str));
    }

    @Test
    void testApplyWithUncorrectedParameter() throws FilterException {
        String str = "";
        EndStringFilter filter1 = new EndStringFilter("Мама");
        assertThrows(FilterException.class, ()->filter1.apply(str));
    }
}