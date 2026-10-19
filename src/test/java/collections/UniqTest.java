package collections;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

class UniqTest {

    @Test
    void removesConsecutiveDuplicates() {
        assertEquals(List.of("a", "b", "c", "a", "b", "c"),
                Uniq.uniq(List.of("a", "a", "b", "b", "c", "a", "b", "c")));
        assertEquals(List.of("bar"), Uniq.uniq(List.of("bar", "bar", "bar")));
    }

    @Test
    void keepsAListWithoutDuplicatesUnchanged() {
        assertEquals(List.of("foo", "bar"), Uniq.uniq(List.of("foo", "bar")));
    }

    @Test
    void returnsAnEmptyListForAnEmptyList() {
        assertEquals(List.of(), Uniq.uniq(List.of()));
    }

    @Test
    void doesNotModifyTheReceivedList() {
        List<String> items = new ArrayList<>(List.of("a", "a", "b"));
        Uniq.uniq(items);
        assertEquals(List.of("a", "a", "b"), items);
    }
}
