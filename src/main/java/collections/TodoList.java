package collections;

import java.util.ArrayList;
import java.util.List;

/**
 * Complète la classe {@code TodoList} : une liste de tâches à faire, puis faites.
 * C'est à toi de choisir les attributs.
 *
 * <ul>
 *   <li>{@code add("Faire les courses")} ajoute une tâche à faire, à la fin. Un titre {@code null}
 *       ou vide (même fait d'espaces) lance une {@code IllegalArgumentException}.</li>
 *   <li>{@code complete("Faire les courses")} fait passer la tâche de « à faire » à « faite ».
 *       Un titre absent des tâches à faire lance une {@code IllegalArgumentException}.</li>
 *   <li>{@code getPending()} et {@code getDone()} renvoient les tâches dans leur ordre d'arrivée.
 *       Celui qui modifie la liste renvoyée ne doit pas pouvoir toucher à ta {@code TodoList}.</li>
 * </ul>
 */
public class TodoList {

    // TODO ajoute tes attributs ici

    public void add(String title) {
        // TODO écris ton code ici
    }

    public void complete(String title) {
        // TODO écris ton code ici
    }

    public List<String> getPending() {
        // TODO écris ton code ici
        return new ArrayList<>();
    }

    public List<String> getDone() {
        // TODO écris ton code ici
        return new ArrayList<>();
    }
}
