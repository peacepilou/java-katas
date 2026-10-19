package collections;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

class CensorshipTest {

    @Test
    void replacesTheForbiddenWordWithStars() {
        assertEquals(List.of("Eat ***** every day.", "Where is my umbrella?"),
                Censorship.censor(List.of("Eat tacos every day.", "Where is my umbrella?"), "tacos"));
    }

    @Test
    void censorsEveryOccurrence() {
        assertEquals(List.of("*** and ***"), Censorship.censor(List.of("foo and foo"), "foo"));
    }

    @Test
    void leavesWordsThatOnlyContainTheForbiddenWord() {
        assertEquals(List.of("The disease psittacosis."),
                Censorship.censor(List.of("The disease psittacosis."), "tacos"));
    }

    @Test
    void doesNotModifyTheReceivedList() {
        List<String> sentences = new ArrayList<>(List.of("I love tacos"));
        Censorship.censor(sentences, "tacos");
        assertEquals(List.of("I love tacos"), sentences);
    }
}
