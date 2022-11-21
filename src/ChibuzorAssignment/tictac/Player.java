package ChibuzorAssignment.tictac;

import java.security.SecureRandom;

public class Player {
    SecureRandom random = new SecureRandom();

    private final int id;
    private final String name;
    private final String character;

    private String position;

    public Player(String name) {
        this(name, "X");
    }

    public Player(String name, String character) {
        this.id = 1 + random.nextInt(999999);
        this.name = name;
        this.character = character;
        position = "";
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCharacter() {
        return character;
    }

    public void addPosition(int position) {
        this.position += String.valueOf(position);
    }

    public String getPosition() {
        return position;
    }
}
