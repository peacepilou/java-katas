package collections;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class WaitingLineTest {

    @Test
    void startsEmpty() {
        assertEquals(0, new WaitingLine().size());
    }

    @Test
    void countsThePeopleWhoJoin() {
        WaitingLine line = new WaitingLine();
        line.join("Lina");
        line.join("Sam");
        assertEquals(2, line.size());
    }

    @Test
    void servesPeopleInTheirOrderOfArrival() {
        WaitingLine line = new WaitingLine();
        line.join("Lina");
        line.join("Sam");
        assertEquals("Lina", line.next());
        assertEquals("Sam", line.next());
        assertEquals(0, line.size());
    }

    @Test
    void givesThePositionStartingAtOne() {
        WaitingLine line = new WaitingLine();
        line.join("Lina");
        line.join("Sam");
        assertEquals(1, line.positionOf("Lina"));
        assertEquals(2, line.positionOf("Sam"));
        line.next();
        assertEquals(1, line.positionOf("Sam"));
    }

    @Test
    void givesMinusOneForSomeoneNotInTheLine() {
        WaitingLine line = new WaitingLine();
        line.join("Lina");
        assertEquals(-1, line.positionOf("Sam"));
    }

    @Test
    void rejectsAnEmptyName() {
        WaitingLine line = new WaitingLine();
        assertThrows(IllegalArgumentException.class, () -> line.join(null));
        assertThrows(IllegalArgumentException.class, () -> line.join(""));
    }

    @Test
    void rejectsSomeoneAlreadyInTheLine() {
        WaitingLine line = new WaitingLine();
        line.join("Lina");
        assertThrows(IllegalArgumentException.class, () -> line.join("Lina"));
    }

    @Test
    void refusesToServeAnEmptyLine() {
        assertThrows(IllegalStateException.class, () -> new WaitingLine().next());
    }
}
