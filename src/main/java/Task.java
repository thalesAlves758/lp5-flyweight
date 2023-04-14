public class Task {
    private String title;
    private Tag tag;

    public Task(String title, Tag tag) {
        this.title = title;
        this.tag = tag;
    }

    public String getTask() {
        return "Task{" +
                "title=\"" + this.title + "\", " +
                "tag=\"" + this.tag.getName() + "\", " +
                "tagColor=\"" + this.tag.getColor() + "\"}";
    }
}
