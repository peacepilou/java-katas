package owntests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class AbbreviateNamesTest {

    @Test
    void abbreviatesTwoNames() {
        assertEquals("A.H", AbbreviateNames.abbreviate("Alyson Hannigan"));
    }

    // TODO écris tes tests ici : un test par règle de l'énoncé
}
