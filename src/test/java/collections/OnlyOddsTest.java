package collections;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

class OnlyOddsTest {

    @Test
    void keepsOnlyOddNumbersInOrder() {
        assertEquals(List.of(1, 3), OnlyOdds.odd(List.of(1, 2, 3, 4)));
        assertEquals(List.of(-3, 7), OnlyOdds.odd(List.of(-3, 10, 7)));
    }

    @Test
    void returnsAnEmptyListWhenNothingIsOdd() {
        assertEquals(List.of(), OnlyOdds.odd(List.of(10, 20)));
    }

    @Test
    void doesNotModifyTheReceivedList() {
        List<Integer> numbers = new ArrayList<>(List.of(1, 2, 3));
        OnlyOdds.odd(numbers);
        assertEquals(List.of(1, 2, 3), numbers);
    }
}
