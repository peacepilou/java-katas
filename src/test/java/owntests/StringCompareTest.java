package owntests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class StringCompareTest {

    @Test
    void countsMatchingPositions() {
        assertEquals(1, StringCompare.compare("a", "a"));
    }

    // TODO écris tes tests ici : un test par règle de l'énoncé
}
