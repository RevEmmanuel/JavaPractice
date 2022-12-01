package diary;

import java.util.ArrayList;

public class Diary {

    private boolean isLocked;
    private final String password;
    private final ArrayList<Entry> entries;
    private final String ownerName;
    private int idCounter;

    public Diary(String ownerName, String password) {
        idCounter = 1;
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
        if (!isLocked) return entries.size();
        return 0;
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

    public void deleteEntry(int id) {
        if (!isLocked()) entries.remove(findId(id));
    }

    public void updateEntryTitle(int id, String title) {
        if (!isLocked()) findId(id).setTitle(title);
    }

    public void updateEntryContent(int id, String content) {
        if (!isLocked()) findId(id).setContent(content);
    }

    public String getContentOfEntry(int id) {
        if (!isLocked()) return findId(id).getContent();
        return null;
    }

    public String getTitleOfEntry(int id) {
        if (!isLocked()) return findId(id).getTitle();
        return null;
    }

    public String getOwnerName() {
        if (!isLocked) return ownerName;
        return null;
    }

    private void writeIntoDiary(String title, String content) {
        Entry aNewEntry = new Entry(idCounter++, title, content);
        entries.add(aNewEntry);
    }

    private Entry findId(int id) {
        Entry foundEntry = null;
        for (int i = 0; i < entries.toArray().length; i++) {
            if (entries.get(i).getId() == id) {
                foundEntry = entries.get(i);
                break;
            }
        }
        if (foundEntry == null) throw new NullPointerException("No entry found");
        if (idCounter == 1) throw new NullPointerException("No entries exist.");
        return foundEntry;
    }

}
