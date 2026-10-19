package collections;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.List;
import org.junit.jupiter.api.Test;

class TennisScoreTest {

    @Test
    void startsAtLoveAll() {
        assertEquals("love-love", TennisScore.getScore(List.of()));
    }

    @Test
    void callsPointsWithTennisWords() {
        assertEquals("40-love", TennisScore.getScore(List.of(1, 1, 1)));
        assertEquals("15-40", TennisScore.getScore(List.of(2, 1, 2, 2)));
        assertEquals("30-30", TennisScore.getScore(List.of(1, 2, 1, 2)));
    }

    @Test
    void callsDeuceFromThreePointsEach() {
        assertEquals("deuce", TennisScore.getScore(List.of(1, 2, 1, 2, 1, 2)));
        assertEquals("deuce", TennisScore.getScore(List.of(1, 1, 1, 2, 2, 2, 1, 2)));
    }

    @Test
    void callsTheAdvantage() {
        assertEquals("ad in", TennisScore.getScore(List.of(1, 1, 1, 2, 2, 2, 1)));
        assertEquals("ad out", TennisScore.getScore(List.of(1, 1, 1, 2, 2, 2, 2)));
    }

    @Test
    void rejectsInvalidInput() {
        assertThrows(IllegalArgumentException.class, () -> TennisScore.getScore(null));
        assertThrows(IllegalArgumentException.class, () -> TennisScore.getScore(List.of(1, 3)));
    }
}
