package fundamentals;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CountLettersTest {

    @Test
    void countsEachOccurrenceOfTheLetter() {
        assertEquals(7, CountLetters.countChar("aaaaabbbaa", 'a'));
        assertEquals(1, CountLetters.countChar("bbacbaaa", 'c'));
    }

    @Test
    void returnsZeroWhenTheLetterIsAbsent() {
        assertEquals(0, CountLetters.countChar("bbcc", 'a'));
        assertEquals(0, CountLetters.countChar("", 'a'));
    }

    @Test
    void returnsMinusOneWhenTextIsNull() {
        assertEquals(-1, CountLetters.countChar(null, 'a'));
    }
}
