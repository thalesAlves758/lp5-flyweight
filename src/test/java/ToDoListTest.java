import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ToDoListTest {
    @Test
    void shouldReturnTasks() {
        ToDoList toDoList = new ToDoList();
        toDoList.addTask("Programar", "Pessoal", "yellow");
        toDoList.addTask("Fazer exercício físico", "Pessoal", "yellow");
        toDoList.addTask("Fazer trabalho de LP5", "Faculdade", "green");
        toDoList.addTask("Terminar tarefa", "Trabalho", "blue");

        List<String> output = Arrays.asList(
            "Task{title=\"Programar\", tag=\"Pessoal\", tagColor=\"yellow\"}",
            "Task{title=\"Fazer exercício físico\", tag=\"Pessoal\", tagColor=\"yellow\"}",
            "Task{title=\"Fazer trabalho de LP5\", tag=\"Faculdade\", tagColor=\"green\"}",
            "Task{title=\"Terminar tarefa\", tag=\"Trabalho\", tagColor=\"blue\"}"
        );

        assertEquals(output, toDoList.getTasks());
    }

    @Test
    void shouldReturnTagsAmount() {
        ToDoList toDoList = new ToDoList();
        toDoList.addTask("Programar", "Pessoal", "yellow");
        toDoList.addTask("Fazer exercício físico", "Pessoal", "yellow");
        toDoList.addTask("Fazer trabalho de LP5", "Faculdade", "green");
        toDoList.addTask("Terminar tarefa", "Trabalho", "blue");

        assertEquals(3, TagFactory.getTotalTags());
    }
}
