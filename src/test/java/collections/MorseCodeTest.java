package collections;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MorseCodeTest {

    @Test
    void decodesAWord() {
        assertEquals("WILD", MorseCode.decode(".-- .. .-.. -.."));
        assertEquals("TACOS", MorseCode.decode("- .- -.-. --- ..."));
    }

    @Test
    void separatesWordsWithASpace() {
        assertEquals("WILD CODE", MorseCode.decode(".-- .. .-.. -..   -.-. --- -.. ."));
    }

    @Test
    void decodesPunctuation() {
        assertEquals("SOS!", MorseCode.decode("... --- ... -.-.--"));
    }
}
