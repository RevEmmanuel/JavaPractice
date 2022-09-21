package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AirConditionerTest {

    private static final AirConditioner samsung = new AirConditioner();
    @Test
    public void turnOnTheAirCondition() {

        samsung.powerOn();
        assertTrue(samsung.powerStatus());
    }

    @Test
    public void turnOffTheAirCondition() {

        samsung.powerOn();

        samsung.powerOff();
        assertFalse(samsung.powerStatus());
        assertEquals(0, samsung.getTemperature());
    }


    @Test
    public void temperatureSetting() {

        samsung.powerOn();
        samsung.setTemperature(20);
        assertEquals(20, samsung.getTemperature());
    }


    @Test
    public void temperatureShouldNotSetAbove30() {

        samsung.powerOn();
        samsung.setTemperature(35);
        assertEquals(30, samsung.getTemperature());
    }

    @Test
    public void temperatureShouldNotSetBelow16() {

        samsung.powerOn();
        samsung.setTemperature(14);
        assertEquals(16, samsung.getTemperature());
    }

    @Test
    public void increasingTheTemperature() {

        samsung.powerOn();
        samsung.setTemperature(22);

        samsung.increaseTemperature(6);
        assertEquals(28, samsung.getTemperature());
    }

    @Test
    public void temperatureShouldNotIncreaseAbove30() {

        samsung.powerOn();
        samsung.setTemperature(20);

        samsung.increaseTemperature(15);
        assertEquals(30,samsung.getTemperature());
    }

    @Test
    public void decreasingTheTemperature() {

        samsung.powerOn();
        samsung.setTemperature(20);
        samsung.increaseTemperature(8);
        assertEquals(28, samsung.getTemperature());

        samsung.reduceTemperature(7);
        assertEquals(21, samsung.getTemperature());
    }

    @Test
    public void temperatureShouldNotDecreaseBelow16() {

        samsung.powerOn();
        samsung.setTemperature(22);

        samsung.reduceTemperature(8);
        assertEquals(16, samsung.getTemperature());
    }

    @Test
    public void temperatureIsZeroWhenOff() {
        samsung.powerOn();
        samsung.setTemperature(18);
        assertEquals(18, samsung.getTemperature());

        samsung.powerOff();
        assertFalse(samsung.powerStatus());

        assertEquals(0, samsung.getTemperature());
    }

    @Test
    public void temperatureShouldBeRememberedWhenItIsTurnOn() {
        samsung.powerOn();
        samsung.setTemperature(25);
        assertEquals(25, samsung.getTemperature());

        samsung.increaseTemperature(2);
        assertEquals(27, samsung.getTemperature());

        samsung.powerOff();
        samsung.powerOn();
        assertEquals(27, samsung.getTemperature());
    }

}