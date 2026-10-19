package fundamentals;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class InverseValuesTest {

    @Test
    void changesTheSignOfEachNumber() {
        assertArrayEquals(new int[] {-1, -2, -3}, InverseValues.inverse(new int[] {1, 2, 3}));
        assertArrayEquals(new int[] {-1, 2, -3, 4}, InverseValues.inverse(new int[] {1, -2, 3, -4}));
    }

    @Test
    void returnsAnEmptyArrayWhenInputIsNull() {
        assertArrayEquals(new int[0], InverseValues.inverse(null));
    }

    @Test
    void doesNotModifyTheReceivedArray() {
        int[] numbers = {1, 2, 3};
        InverseValues.inverse(numbers);
        assertArrayEquals(new int[] {1, 2, 3}, numbers);
    }
}
