package collections;

import java.util.Map;

/**
 * Bonus. Nouvelle notion : {@code Map}.
 *
 * Écris la méthode {@code decode} : elle traduit du morse en lettres majuscules.
 * Une espace sépare deux lettres, trois espaces séparent deux mots.
 *
 * <pre>
 * decode(".-- .. .-.. -..")              → "WILD"
 * decode("- .- -.-. --- ...")            → "TACOS"
 * decode(".-- .. .-.. -..   -.-. --- -.. .") → "WILD CODE"
 * </pre>
 *
 * {@code MORSE.get(".-")} renvoie "A". {@code text.split("   ")} découpe un texte à chaque groupe de trois espaces.
 */
public class MorseCode {

    private static final Map<String, String> MORSE = Map.ofEntries(
            Map.entry(".-", "A"), Map.entry("-...", "B"), Map.entry("-.-.", "C"),
            Map.entry("-..", "D"), Map.entry(".", "E"), Map.entry("..-.", "F"),
            Map.entry("--.", "G"), Map.entry("....", "H"), Map.entry("..", "I"),
            Map.entry(".---", "J"), Map.entry("-.-", "K"), Map.entry(".-..", "L"),
            Map.entry("--", "M"), Map.entry("-.", "N"), Map.entry("---", "O"),
            Map.entry(".--.", "P"), Map.entry("--.-", "Q"), Map.entry(".-.", "R"),
            Map.entry("...", "S"), Map.entry("-", "T"), Map.entry("..-", "U"),
            Map.entry("...-", "V"), Map.entry(".--", "W"), Map.entry("-..-", "X"),
            Map.entry("-.--", "Y"), Map.entry("--..", "Z"), Map.entry(".-.-.-", "."),
            Map.entry("..--..", "?"), Map.entry("-.-.--", "!"));

    public static String decode(String morse) {
        // TODO écris ton code ici
        return "";
    }
}
