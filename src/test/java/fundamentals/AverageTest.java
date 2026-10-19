package fundamentals;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class AverageTest {

    @Test
    void returnsTheAverageOfThreeGrades() {
        assertEquals(12.0, Average.average(10, 12, 14), 0.001);
    }

    @Test
    void keepsTheDecimals() {
        assertEquals(7.667, Average.average(7, 8, 8), 0.001);
        assertEquals(15.333, Average.average(15, 15, 16), 0.001);
    }
}
