package ClassActivity;

import java.security.SecureRandom;

public class Dice {
    private int face;

    private static final int loseNumber1 = 2;
    private static final int loseNumber2 = 3;
    private static final int loseNumber3 = 7;
    private static final int loseNumber4 = 11;
    private static final int loseNumber5 = 12;
    SecureRandom random = new SecureRandom();

    public int rollDie() {
        this.face = 1 + random.nextInt(6);
        return face;
    }

    public int getFace() {
        return face;
    }




}
