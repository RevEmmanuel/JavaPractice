package diary;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Diary {

    private boolean isLocked;
    private final String password;
    private final ArrayList<Entry> entries;
    private final String ownerName;

    public Diary(String ownerName, String password) {
        this.password = password;
        this.isLocked = true;
        this.ownerName = ownerName;
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
        if (!isLocked) writeIntoDiary(title, content);
    }

    public int getNumberOfEntries() {
        return entries.size();
    }

    public Entry findEntryWithId(int id) {
        if (!isLocked) return findId(id);
        else return null;
    }

    @Override
    public String toString() {
        return "Diary{" +
                "entries=" + entries +
                '}';
    }

    public String getOwnerName() {
        if (!isLocked) return ownerName;
        return null;
    }

    private void writeIntoDiary(String title, String content) {
        int id = getNumberOfEntries() + 1;
        Entry aNewEntry = new Entry(id, title, content);
        entries.add(aNewEntry);
    }

    private Entry findId(int id) {
        for (Entry entry : entries) {
            if (entry.getId() == id) return entry;
        }
        return null;
    }

}
