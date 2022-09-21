package ClassActivity;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
// import tdd.GameOfCraps;

import static org.junit.jupiter.api.Assertions.*;

class DiceTest {
    private enum Status {WON, CONTINUE, LOST}

    Dice die1;
    Dice die2;

    private static final int loseNumber1 = 2;
    private static final int loseNumber2 = 3;
    private static final int winLoseNumber1 = 7;
    private static final int winNumber2 = 11;
    private static final int loseNumber3 = 12;

    @BeforeEach
    void startAllTestsWith() {
        die1 = new Dice();
        die2 = new Dice();
    }

    @Test
    public void testFirstDieExists() {
        assertNotNull(die1);
    }

    @Test
    void testSecondDieExists() {
        assertNotNull(die2);
    }

    @Test
    void die1ShouldGiveNumberGreaterThanOrEqualTo1() {
        for (int i = 1; i <= 10; i++) {
            int face1 = die1.rollDie();
            assertTrue(face1 >= 1);
        }
    }

    @Test
    void die2ShouldGiveNumberGreaterThanOrEqualTo1() {
        for (int i = 1; i <= 10; i++) {
            int face2 = die2.rollDie();
            assertTrue(face2 >= 1);
        }
    }

    @Test
    void die1ShouldGiveNumberLessThanOrEqualTo6() {
        for (int i = 1; i <= 10; i++) {
            int face1 = die1.rollDie();
            assertTrue(face1 <= 6);
        }
    }

    @Test
    void die2ShouldGiveNumberLessThanOrEqualTo6() {
        for (int i = 1; i <= 10; i++) {
            int face2 = die2.rollDie();
            assertTrue(face2 <= 6);
        }
    }

    @Test
    void dicesShouldGiveNumberGreaterThan1() {
        for (int i = 1; i <= 10; i++) {
            int faces = rollDices(die1, die2);
            assertTrue(faces > 1);
        }
    }

    @Test
    void dicesShouldGiveNumberLessThanOrEqualTo12() {
        for (int i = 1; i <= 10; i++) {
            int faces = rollDices(die1, die2);
            assertTrue(faces <= 12);
        }
    }

    @Test
    void gameStatusTest() {
        for (int i = 1; i <= 10; i++) {
            int faces = rollDices(die1, die2);
            System.out.printf("The player played %d%n", faces);
            Status game = enumStatus(faces);
            if((faces == 2 || faces == 3) || faces == 12) {
                assertSame(game, Status.LOST);
            }
        }
    }

    public static int rollDices(Dice a, Dice b) {
        int face1 = a.rollDie();
        int face2 = b.rollDie();
        return face2 + face1;
    }

    public static Status enumStatus(int sumOfFaces) {
        Status gameStatus;
        switch (sumOfFaces) {
            case winLoseNumber1, winNumber2 -> gameStatus = Status.WON;
            case loseNumber1, loseNumber2, loseNumber3  -> gameStatus = Status.LOST;
            default -> gameStatus = Status.CONTINUE;
        }

        return gameStatus;
    }



}