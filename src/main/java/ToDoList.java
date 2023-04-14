import java.util.ArrayList;
import java.util.List;

public class ToDoList {
    private List<Task> tasks = new ArrayList<>();

    public void addTask(String title, String tagName, String tagColor) {
        Tag tag = TagFactory.getTag(tagName, tagColor);
        Task task = new Task(title, tag);
        tasks.add(task);
    }

    public List<String> getTasks() {
        return tasks.stream().map(Task::getTask).toList();
    }
}
