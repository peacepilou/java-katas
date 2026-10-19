package owntests;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class PalindromeTest {

    @Test
    void recognizesAPalindrome() {
        assertTrue(Palindrome.isPalindrome("rotor"));
    }

    // TODO écris tes tests ici : un test par règle de l'énoncé
}
