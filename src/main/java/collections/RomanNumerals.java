package collections;

import java.util.Map;

/**
 * Nouvelle notion : {@code Map}.
 *
 * Écris la méthode {@code convert} : elle traduit un nombre romain en nombre entier.
 * Un symbole plus petit placé avant un plus grand se soustrait : IV vaut 5 - 1.
 * Si le texte est {@code null}, vide, ou contient un symbole inconnu, elle lance une
 * {@code IllegalArgumentException} avec le message "Illegal argument".
 *
 * <pre>
 * convert("III")        → 3
 * convert("IV")         → 4
 * convert("XLIII")      → 43
 * convert("MCCXXXVIII") → 1238
 * convert("tacos")      → IllegalArgumentException
 * </pre>
 *
 * Une {@code Map} range des valeurs derrière des clés, comme un dictionnaire.
 * {@code VALUES.get('X')} renvoie 10, {@code VALUES.containsKey('Z')} renvoie false.
 */
public class RomanNumerals {

    private static final Map<Character, Integer> VALUES = Map.of(
            'I', 1,
            'V', 5,
            'X', 10,
            'L', 50,
            'C', 100,
            'D', 500,
            'M', 1000);

    public static int convert(String roman) {
        // TODO écris ton code ici
        return 0;
    }
}
