package fundamentals;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MathMinTest {

    @Test
    void returnsTheSmallestNumber() {
        assertEquals(3, MathMin.min(3, 7));
        assertEquals(3, MathMin.min(7, 3));
    }

    @Test
    void worksWithNegativeNumbers() {
        assertEquals(-1, MathMin.min(-1, 0));
        assertEquals(-8, MathMin.min(-2, -8));
    }

    @Test
    void returnsTheValueWhenBothAreEqual() {
        assertEquals(4, MathMin.min(4, 4));
    }
}
