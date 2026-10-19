package collections;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.List;
import org.junit.jupiter.api.Test;

class TodoListTest {

    @Test
    void startsEmpty() {
        TodoList todo = new TodoList();
        assertEquals(List.of(), todo.getPending());
        assertEquals(List.of(), todo.getDone());
    }

    @Test
    void addsTasksAtTheEnd() {
        TodoList todo = new TodoList();
        todo.add("Faire les courses");
        todo.add("Appeler Lina");
        assertEquals(List.of("Faire les courses", "Appeler Lina"), todo.getPending());
    }

    @Test
    void movesACompletedTaskToDone() {
        TodoList todo = new TodoList();
        todo.add("Faire les courses");
        todo.add("Appeler Lina");
        todo.complete("Faire les courses");
        assertEquals(List.of("Appeler Lina"), todo.getPending());
        assertEquals(List.of("Faire les courses"), todo.getDone());
    }

    @Test
    void rejectsAnEmptyTitle() {
        TodoList todo = new TodoList();
        assertThrows(IllegalArgumentException.class, () -> todo.add(null));
        assertThrows(IllegalArgumentException.class, () -> todo.add(""));
        assertThrows(IllegalArgumentException.class, () -> todo.add("   "));
    }

    @Test
    void rejectsCompletingAnUnknownTask() {
        TodoList todo = new TodoList();
        todo.add("Faire les courses");
        assertThrows(IllegalArgumentException.class, () -> todo.complete("Appeler Lina"));
    }

    @Test
    void rejectsCompletingATaskTwice() {
        TodoList todo = new TodoList();
        todo.add("Faire les courses");
        todo.complete("Faire les courses");
        assertThrows(IllegalArgumentException.class, () -> todo.complete("Faire les courses"));
    }

    @Test
    void returnedListsCannotChangeTheTodoList() {
        TodoList todo = new TodoList();
        todo.add("Faire les courses");
        todo.getPending().clear();
        assertEquals(List.of("Faire les courses"), todo.getPending());
    }
}
