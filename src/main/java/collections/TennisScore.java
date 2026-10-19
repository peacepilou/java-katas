package collections;

import java.util.List;

/**
 * Bonus.
 *
 * Une liste raconte un jeu de tennis point par point : 1 quand le serveur marque, 2 quand le receveur marque.
 * Écris la méthode {@code getScore} : elle renvoie le score annoncé après le dernier point,
 * le serveur à gauche, le receveur à droite.
 *
 * <ul>
 *   <li>0, 1, 2 et 3 points se disent "love", "15", "30" et "40".</li>
 *   <li>Dès que chacun a marqué au moins 3 points, l'égalité se dit "deuce".</li>
 *   <li>Toujours après 3 points chacun, un point d'avance se dit "ad in" pour le serveur, "ad out" pour le receveur.</li>
 *   <li>Une liste {@code null}, ou une valeur autre que 1 ou 2, lance une {@code IllegalArgumentException}.</li>
 * </ul>
 *
 * <pre>
 * [1, 1, 1]             → "40-love"
 * [2, 1, 2, 2]          → "15-40"
 * [1, 2, 1, 2, 1, 2]    → "deuce"
 * [1, 1, 1, 2, 2, 2, 1] → "ad in"
 * </pre>
 *
 * Les tests ne donnent jamais un jeu déjà gagné.
 */
public class TennisScore {

    public static String getScore(List<Integer> points) {
        // TODO écris ton code ici
        return "";
    }
}
