package fundamentals;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SumOfMultiplesTest {

    @Test
    void sumsMultiplesOfThreeOrFiveBelowTheLimit() {
        assertEquals(23, SumOfMultiples.sum(10));
        assertEquals(60, SumOfMultiples.sum(16));
        assertEquals(2318, SumOfMultiples.sum(100));
    }

    @Test
    void excludesTheLimitItself() {
        assertEquals(3, SumOfMultiples.sum(5));
    }

    @Test
    void returnsZeroWhenThereIsNoMultiple() {
        assertEquals(0, SumOfMultiples.sum(3));
        assertEquals(0, SumOfMultiples.sum(0));
    }
}
