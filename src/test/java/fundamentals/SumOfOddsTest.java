package fundamentals;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SumOfOddsTest {

    @Test
    void sumsOnlyOddValues() {
        assertEquals(4, SumOfOdds.sum(new int[] {1, 2, 3}));
        assertEquals(0, SumOfOdds.sum(new int[] {2, 4, 6}));
    }

    @Test
    void worksWithNegativeNumbers() {
        assertEquals(-1, SumOfOdds.sum(new int[] {-1}));
        assertEquals(0, SumOfOdds.sum(new int[] {-3, 3}));
    }

    @Test
    void returnsZeroWhenArrayIsEmptyOrNull() {
        assertEquals(0, SumOfOdds.sum(new int[0]));
        assertEquals(0, SumOfOdds.sum(null));
    }
}
