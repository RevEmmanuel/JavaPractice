package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AutomaticBikeTest {

    @Test
    public void turnOnTheBike() {
        AutomaticBike bike = new AutomaticBike();
        bike.powerOn();
        assertTrue(bike.powerStatus());
    }

    @Test
    public void turnOffTheBike() {
        AutomaticBike bike = new AutomaticBike();
        bike.powerOn();
        assertTrue(bike.powerStatus());

        bike.powerOff();
        assertFalse(bike.powerStatus());
    }

    @Test
    public void initialSpeed() {
        AutomaticBike bike = new AutomaticBike();
        bike.powerOn();

        bike.setSpeed(15);
        assertEquals(15, bike.getSpeed());
    }

    @Test
    public void initialSpeedCannotBeBelowZero() {
        AutomaticBike bike = new AutomaticBike();
        bike.powerOn();

        bike.setSpeed(-15);
        assertEquals(0, bike.getSpeed());
    }

    @Test
    public void acceleratingOnGear1() {
        AutomaticBike bike = new AutomaticBike();
        bike.powerOn();
        assertTrue(bike.powerStatus());

        bike.setSpeed(15);

        bike.accelerate();
        assertEquals(16, bike.getSpeed());

        bike.accelerate();
        assertEquals(17, bike.getSpeed());
    }

    @Test
    public void acceleratingOnGear2() {
            AutomaticBike bike = new AutomaticBike();
            bike.powerOn();
            assertTrue(bike.powerStatus());

            bike.setSpeed(21);

            bike.accelerate();
            assertEquals(23, bike.getSpeed());

            bike.accelerate();
            assertEquals(25, bike.getSpeed());
    }

    @Test
    public void acceleratingOnGear3() {
        AutomaticBike bike = new AutomaticBike();
        bike.powerOn();
        assertTrue(bike.powerStatus());

        bike.setSpeed(31);

        bike.accelerate();
        assertEquals(34, bike.getSpeed());

        bike.accelerate();
        assertEquals(37, bike.getSpeed());
    }

    @Test
    public void acceleratingOnGear4() {
        AutomaticBike bike = new AutomaticBike();
        bike.powerOn();
        assertTrue(bike.powerStatus());

        bike.setSpeed(41);

        bike.accelerate();
        assertEquals(45, bike.getSpeed());

        bike.accelerate();
        assertEquals(49, bike.getSpeed());

        bike.accelerate();
        assertEquals(53, bike.getSpeed());
    }

    @Test
    public void switchingGearsAutomatically1to2() {
            AutomaticBike bike = new AutomaticBike();
            bike.powerOn();
            assertTrue(bike.powerStatus());

            bike.setSpeed(19);

            bike.accelerate();
            assertEquals(20, bike.getSpeed());

            bike.accelerate();
            assertEquals(21, bike.getSpeed());

            bike.accelerate();
            assertEquals(23, bike.getSpeed());
    }

    @Test
    public void switchingGearsAutomatically2to3() {
        AutomaticBike bike = new AutomaticBike();
        bike.powerOn();
        assertTrue(bike.powerStatus());

        bike.setSpeed(28);

        bike.accelerate();
        assertEquals(30, bike.getSpeed());

        bike.accelerate();
        assertEquals(32, bike.getSpeed());

        bike.accelerate();
        assertEquals(35, bike.getSpeed());
    }

    @Test
    public void switchingGearsAutomatically3to4() {
        AutomaticBike bike = new AutomaticBike();
        bike.powerOn();
        assertTrue(bike.powerStatus());

        bike.setSpeed(36);

        bike.accelerate();
        assertEquals(39, bike.getSpeed());

        bike.accelerate();
        assertEquals(42, bike.getSpeed());

        bike.accelerate();
        assertEquals(46, bike.getSpeed());
    }

    @Test
    public void acceleratingFromZero() {
        AutomaticBike bike = new AutomaticBike();
        bike.powerOn();
        bike.setSpeed(0);

        bike.accelerate();
        assertEquals(1, bike.getSpeed());

        bike.accelerate();
        assertEquals(2, bike.getSpeed());

        bike.accelerate();
        bike.accelerate();
        assertEquals(4, bike.getSpeed());
    }

    @Test
    public void deceleratingFromGear4() {
        AutomaticBike bike = new AutomaticBike();
        bike.powerOn();
        bike.setSpeed(45);

        bike.decelerate();
        assertEquals(41, bike.getSpeed());

        bike.decelerate();
        assertEquals(37, bike.getSpeed());
    }

    @Test
    public void deceleratingFromGear3() {
        AutomaticBike bike = new AutomaticBike();
        bike.powerOn();
        bike.setSpeed(35);

        bike.decelerate();
        assertEquals(32, bike.getSpeed());

        bike.decelerate();
        assertEquals(29, bike.getSpeed());
    }

    @Test
    public void deceleratingFromGear2() {
        AutomaticBike bike = new AutomaticBike();
        bike.powerOn();
        bike.setSpeed(25);

        bike.decelerate();
        assertEquals(23, bike.getSpeed());

        bike.decelerate();
        assertEquals(21, bike.getSpeed());
    }

    @Test
    public void deceleratingFromGear1() {
        AutomaticBike bike = new AutomaticBike();
        bike.powerOn();
        bike.setSpeed(15);

        bike.decelerate();
        assertEquals(14, bike.getSpeed());

        bike.decelerate();
        assertEquals(13, bike.getSpeed());
    }

    @Test
    public void deceleratingFrom4to3() {
        AutomaticBike bike = new AutomaticBike();
        bike.powerOn();
        bike.setSpeed(42);

        bike.decelerate();
        assertEquals(38, bike.getSpeed());

        bike.decelerate();
        assertEquals(35, bike.getSpeed());
    }

    @Test
    public void deceleratingFrom3to2() {
        AutomaticBike bike = new AutomaticBike();
        bike.powerOn();
        bike.setSpeed(32);

        bike.decelerate();
        assertEquals(29, bike.getSpeed());

        bike.decelerate();
        assertEquals(27, bike.getSpeed());
    }

    @Test
    public void deceleratingFrom2to1() {
        AutomaticBike bike = new AutomaticBike();
        bike.powerOn();
        bike.setSpeed(21);

        bike.decelerate();
        assertEquals(19, bike.getSpeed());

        bike.decelerate();
        assertEquals(18, bike.getSpeed());
    }

    @Test
    public void deceleratingFrom1() {
        AutomaticBike bike = new AutomaticBike();
        bike.powerOn();
        bike.setSpeed(18);

        bike.decelerate();
        assertEquals(17, bike.getSpeed());

        bike.decelerate();
        assertEquals(16, bike.getSpeed());
    }

    @Test
    public void cannotDecelerateLowerThanZero() {
        AutomaticBike bike = new AutomaticBike();
        bike.powerOn();
        bike.setSpeed(0);

        bike.decelerate();
        assertEquals(0, bike.getSpeed());
    }

    @Test
    public void cannotAccelerateWhenOff() {
        AutomaticBike bike = new AutomaticBike();
        bike.accelerate();
        assertEquals(0, bike.getSpeed());
    }

    @Test
    public void cannotDecelerateWhenOff() {
        AutomaticBike bike = new AutomaticBike();
        bike.decelerate();
        assertEquals(0, bike.getSpeed());
    }

    @Test
    public void cannotDecelerateBelow0() {
        AutomaticBike bike = new AutomaticBike();
        bike.powerOn();
        bike.decelerate();
        assertEquals(0, bike.getSpeed());
    }

    @Test
    public void speedIsZeroWhenOff() {
        AutomaticBike bike = new AutomaticBike();
        assertEquals(0, bike.getSpeed());
    }

    @Test
    public void testingSecondPowerMethod() {
        AutomaticBike bike = new AutomaticBike();
        bike.powering();
        assertTrue(bike.powerStatus());

        bike.powering();
        assertFalse(bike.powerStatus());
    }
}