package diary;

import java.util.ArrayList;

public class Diary {

    private boolean isLocked;
    private final String password;
    private final ArrayList<Happening> happeningsList;

    public Diary(String ownerName, String password) {
        this.password = password;
        this.isLocked = true;
        happeningsList = new ArrayList<Happening>();
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
        Happening newHappening = new Happening(title, content);
        happeningsList.add(newHappening);
    }

    public int getNumberOfHappenings() {
        return happeningsList.size();
    }
}
