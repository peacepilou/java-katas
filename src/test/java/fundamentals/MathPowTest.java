package fundamentals;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MathPowTest {

    @Test
    void anyNumberToThePowerOfZeroIsOne() {
        assertEquals(1, MathPow.pow(2, 0));
        assertEquals(1, MathPow.pow(7, 0));
    }

    @Test
    void multipliesTheBaseExponentTimes() {
        assertEquals(2, MathPow.pow(2, 1));
        assertEquals(27, MathPow.pow(3, 3));
        assertEquals(-8, MathPow.pow(-2, 3));
    }

    @Test
    void handlesResultsBiggerThanAnInt() {
        assertEquals(1099511627776L, MathPow.pow(2, 40));
    }
}
