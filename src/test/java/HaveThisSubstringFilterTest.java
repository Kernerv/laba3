import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HaveThisSubstringFilterTest {

    @Test
    void testApplyWithCorrectedParameter() throws FilterException {
        String str = "Мама мыла раму";
        HaveThisSubstringFilter filter1 = new HaveThisSubstringFilter("раму");
        HaveThisSubstringFilter filter2 = new HaveThisSubstringFilter("мыла");
        HaveThisSubstringFilter filter3 = new HaveThisSubstringFilter("не мыла");
        assertTrue(filter1.apply(str));
        assertTrue(filter2.apply(str));
        assertFalse(filter3.apply(str));

    }

    @Test
    void testApplyWithUncorrectedParameter() throws FilterException {
        String str = "";
        HaveThisSubstringFilter filter1 = new HaveThisSubstringFilter("Мама");
        assertThrows(FilterException.class, ()->filter1.apply(str));

    }
}