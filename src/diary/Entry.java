package diary;

import java.time.LocalDateTime;

public class Entry {
    private int id;
    private String title;
    private String content;
    private LocalDateTime timeOfEntry;

    public Entry(int id, String title, String content) {
        this.id = id;
        this.title = title;
        this.content = content;
        timeOfEntry = LocalDateTime.now();
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }
}
