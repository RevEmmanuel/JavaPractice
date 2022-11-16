package ChibuzorAssignment;

import java.security.SecureRandom;

public class Player {
    SecureRandom random = new SecureRandom();

    private int id;
    private final String name;
    private final String character;

    public Player(String name, String character) {
        this.id = random.nextInt(999999);
        this.name = name;
        this.character = character;
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
}
