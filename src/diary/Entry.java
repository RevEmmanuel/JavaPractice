package diary;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Entry {
    private final int id;
    private String title;
    private String content;
    private final LocalDateTime timeOfEntry;

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

    @Override
    public boolean equals(Object obj) {
        try {
            Entry newObject = (Entry) obj;
            return checkEquality(newObject);
        }
        catch (ClassCastException e) {
            return false;
        }
    }

    private boolean checkEquality(Entry entry) {
        return (
                titleEquals(entry.getTitle())
                && contentEquals(entry.getContent())
                && idEquals(entry.getId())
        );
    }

    private boolean titleEquals(String title) {
        return title.equals(this.title);
    }

    private boolean contentEquals(String content) {
        return content.equals(this.content);
    }

    private boolean idEquals(int id) {
        return id == this.id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
