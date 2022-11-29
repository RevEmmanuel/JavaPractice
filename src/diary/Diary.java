package diary;

import java.util.ArrayList;

public class Diary {

    private boolean isLocked;
    private final String password;
    private final ArrayList<Entry> entries;

    public Diary(String ownerName, String password) {
        this.password = password;
        this.isLocked = true;
        entries = new ArrayList<>();
    }

    public boolean isLocked() {
        return isLocked;
    }

    public void lock() {
        this.isLocked = true;
    }

    public void unlockWith(String password) {
        if (checkPassword(password)) this.isLocked = false;
    }

    private boolean checkPassword(String password) {
        return password.equals(this.password);
    }

    public void write(String title, String content) {
        if (!isLocked) writeIn(title, content);
    }

    public int getNumberOfEntries() {
        return entries.size();
    }

    private void writeIn(String title, String content) {
        int id = getNumberOfEntries() + 1;
        Entry aNewEntry = new Entry(id, title, content);
        entries.add(aNewEntry);
    }

}
