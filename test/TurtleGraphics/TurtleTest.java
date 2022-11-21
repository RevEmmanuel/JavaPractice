package TurtleGraphics;

import org.junit.jupiter.api.*;
import static TurtleGraphics.Direction.*;
import static org.junit.jupiter.api.Assertions.*;

class TurtleTest {

    Turtle tortoise;

    @BeforeEach
    public void setUp() {
        tortoise = new Turtle();
    }

    @Test
    public void turtleExistTest() {
        assertNotNull(tortoise);
    }

    @Test
    public void turtleCanMovePenUpTest() {
        tortoise.penUp();
        assertTrue(tortoise.isPenUp());
    }

    @Test
    public void turtleCanMovePenDownTest() {
        tortoise.penUp();
        assertTrue(tortoise.isPenUp());
        tortoise.penDown();
        assertFalse(tortoise.isPenUp());
    }

    @Test
    public void turtleIsFacingRightByDefault() {
        assertEquals(EAST, tortoise.getCurrentDirection());
    }

    @Test
    public void turtleCanTurnRightWhileFacingEastTest() {
        assertEquals(EAST, tortoise.getCurrentDirection());
        tortoise.turnRight();
        assertEquals(SOUTH, tortoise.getCurrentDirection());
    }

    @Test
    public void turtleCanTurnRightWhileFacingSouthTest() {
        tortoise.turnRight();
        assertEquals(SOUTH, tortoise.getCurrentDirection());
        tortoise.turnRight();
        assertEquals(WEST, tortoise.getCurrentDirection());
    }

    @Test
    public void turtleCanTurnRightWhileFacingWestTest() {
        tortoise.turnRight();
        tortoise.turnRight();
        assertEquals(WEST, tortoise.getCurrentDirection());
        tortoise.turnRight();
        assertEquals(NORTH, tortoise.getCurrentDirection());
    }

    @Test
    public void turtleCanTurnRightWhileFacingNorthTest() {
        tortoise.turnRight();
        tortoise.turnRight();
        tortoise.turnRight();
        assertEquals(NORTH, tortoise.getCurrentDirection());
        tortoise.turnRight();
        assertEquals(EAST, tortoise.getCurrentDirection());
    }

    @Test
    public void turtleCanTurnLeftWhileFacingEastTest() {
        assertEquals(EAST, tortoise.getCurrentDirection());
        tortoise.turnLeft();
        assertEquals(NORTH, tortoise.getCurrentDirection());
    }

    @Test
    public void turtleCanTurnLeftWhileFacingNorthTest() {
        tortoise.turnLeft();
        assertEquals(NORTH, tortoise.getCurrentDirection());
        tortoise.turnLeft();
        assertEquals(WEST, tortoise.getCurrentDirection());
    }

    @Test
    public void turtleCanTurnLeftWhileFacingWestTest() {
        tortoise.turnLeft();
        tortoise.turnLeft();
        assertEquals(WEST, tortoise.getCurrentDirection());
        tortoise.turnLeft();
        assertEquals(SOUTH, tortoise.getCurrentDirection());
    }

    @Test
    public void turtleCanTurnLeftWhileFacingSouthTest() {
        tortoise.turnLeft();
        tortoise.turnLeft();
        tortoise.turnLeft();
        assertEquals(SOUTH, tortoise.getCurrentDirection());
        tortoise.turnLeft();
        assertEquals(EAST, tortoise.getCurrentDirection());
    }

    @Test
    public void turtleCanMoveForwardWhileFacingEastTest() {
        assertEquals(new Position(0, 0), tortoise.getCurrentPosition());
//
//        int numberOfSteps = 10;
//        tortoise.moveSteps(numberOfSteps);
//        assertEquals(new Position(0, 10), tortoise.getCurrentPosition());
//        tortoise.turnRight();
//        assertEquals(SOUTH, tortoise.getCurrentDirection());
//        tortoise.moveSteps(numberOfSteps);
//        assertEquals(new Position(10, 10), tortoise.getCurrentPosition());
//        tortoise.turnRight();
//        tortoise.moveSteps(numberOfSteps);
//        assertEquals(new Position(10, 0), tortoise.getCurrentPosition());
//        tortoise.turnRight();
//        tortoise.moveSteps(numberOfSteps);
//        assertEquals(new Position(0, 0), tortoise.getCurrentPosition());
//        tortoise.display();
        tortoise.move(2, 5, 12, 3, 5, 12, 3, 5, 12, 3, 5, 12, 1, 6, 9);
    }
}
