package collections;

import java.util.ArrayList;
import java.util.List;

/**
 * Écris la méthode {@code censor} : elle reçoit des phrases et un mot interdit, et renvoie une nouvelle liste
 * où le mot interdit est remplacé par autant d'étoiles qu'il a de lettres ("tacos" devient "*****").
 * Seul le mot entier est censuré : "psittacosis" contient "tacos" mais reste intact.
 * Ne modifie pas la liste reçue.
 *
 * <pre>
 * censor(["Eat tacos every day.", "Where is my umbrella?"], "tacos")
 *   → ["Eat ***** every day.", "Where is my umbrella?"]
 * censor(["The disease psittacosis."], "tacos")
 *   → ["The disease psittacosis."]
 * </pre>
 *
 * Dans les tests, le mot interdit n'est jamais collé à une ponctuation.
 * {@code sentence.split(" ")} découpe une phrase en tableau de mots, {@code String.join(" ", words)} les recolle,
 * {@code "*".repeat(5)} renvoie "*****".
 */
public class Censorship {

    public static List<String> censor(List<String> sentences, String forbiddenWord) {
        // TODO écris ton code ici
        return new ArrayList<>();
    }
}
