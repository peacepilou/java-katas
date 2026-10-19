package collections;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class RomanNumeralsTest {

    @Test
    void addsSymbolsFromBiggestToSmallest() {
        assertEquals(3, RomanNumerals.convert("III"));
        assertEquals(1238, RomanNumerals.convert("MCCXXXVIII"));
    }

    @Test
    void subtractsASmallerSymbolPlacedBeforeABiggerOne() {
        assertEquals(4, RomanNumerals.convert("IV"));
        assertEquals(43, RomanNumerals.convert("XLIII"));
        assertEquals(1994, RomanNumerals.convert("MCMXCIV"));
    }

    @Test
    void rejectsAnUnknownSymbol() {
        IllegalArgumentException error =
                assertThrows(IllegalArgumentException.class, () -> RomanNumerals.convert("tacos"));
        assertEquals("Illegal argument", error.getMessage());
    }

    @Test
    void rejectsAnEmptyOrNullText() {
        assertThrows(IllegalArgumentException.class, () -> RomanNumerals.convert(""));
        assertThrows(IllegalArgumentException.class, () -> RomanNumerals.convert(null));
    }
}
