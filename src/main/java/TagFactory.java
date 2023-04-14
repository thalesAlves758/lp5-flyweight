import java.util.HashMap;
import java.util.Map;

public class TagFactory {
    private static Map<String, Tag> tags = new HashMap<>();

    public static Tag getTag(String name, String color) {
        Tag tag = tags.get(name);

        if(tag == null) {
            tag = new Tag(name, color);
            tags.put(name, tag);
        }

        return tag;
    }

    public static int getTotalTags() {
        return tags.size();
    }
}
