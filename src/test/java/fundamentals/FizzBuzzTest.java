package fundamentals;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class FizzBuzzTest {

    @Test
    void returnsFizzForMultiplesOfThree() {
        assertEquals("Fizz", FizzBuzz.fizzBuzz(3));
        assertEquals("Fizz", FizzBuzz.fizzBuzz(9));
    }

    @Test
    void returnsBuzzForMultiplesOfFive() {
        assertEquals("Buzz", FizzBuzz.fizzBuzz(5));
        assertEquals("Buzz", FizzBuzz.fizzBuzz(10));
    }

    @Test
    void returnsFizzBuzzForMultiplesOfThreeAndFive() {
        assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(15));
        assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(30));
    }

    @Test
    void returnsTheNumberOtherwise() {
        assertEquals("1", FizzBuzz.fizzBuzz(1));
        assertEquals("7", FizzBuzz.fizzBuzz(7));
    }
}
