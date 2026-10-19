package fundamentals;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SoccerTest {

    @Test
    void announcesTheWinner() {
        assertEquals("3-0: team 1 wins the game", Soccer.getScore(new int[] {1, 1, 1}));
        assertEquals("1-3: team 2 wins the game", Soccer.getScore(new int[] {2, 1, 2, 2}));
    }

    @Test
    void announcesADraw() {
        assertEquals("2-2: draw", Soccer.getScore(new int[] {1, 2, 1, 2}));
        assertEquals("0-0: draw", Soccer.getScore(new int[0]));
    }

    @Test
    void rejectsInvalidInput() {
        assertEquals("Illegal argument", Soccer.getScore(new int[] {1, 3}));
        assertEquals("Illegal argument", Soccer.getScore(null));
    }
}
