package diary;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

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

    public String getTimeOfEntry() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        return timeOfEntry.format(formatter);
    }

    @Override
    public String toString() {
        String time = getTimeOfEntry();
        return String.format("""
                ==========================================
                Entry: %s
                Written on: %s
                Title: %s
                Body: %s
                ==========================================
                """, id, time, title, content);
    }
}
