package fundamentals;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class FoundMinTest {

    @Test
    void returnsTheSmallestValue() {
        assertEquals(1, FoundMin.min(new int[] {1, 2, 3}));
        assertEquals(1, FoundMin.min(new int[] {3, 2, 1}));
    }

    @Test
    void worksWithNegativeNumbers() {
        assertEquals(-2, FoundMin.min(new int[] {3, -2, 1}));
        assertEquals(-3, FoundMin.min(new int[] {-2, -1, -3}));
    }

    @Test
    void worksWithASingleValue() {
        assertEquals(42, FoundMin.min(new int[] {42}));
    }
}
