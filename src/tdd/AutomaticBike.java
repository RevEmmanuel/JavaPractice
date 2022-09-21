package tdd;

public class AutomaticBike {
    private boolean power;
    private int speed;

    public void powerOn() {

        if (!power) {
            power = true;
            speed = 0;
        }
        else {
            System.out.print("\nThe bike is already on.");
        }
    }


    public void powerOff() {

        if (power) {
            power = false;
            speed = 0;
        }
        else {
            System.out.print("\nThe bike is already off.");
        }
    }

    public boolean powerStatus() {
        return power;
    }

    public void powering() {
        power = !power;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (power) {
            if (speed > 0) {
                this.speed = speed;
            }
        }
    }

    public void accelerate() {
        if (power) {
            if (speed >= 0 && speed <= 20) {
                speed += 1;
            } else if (speed >= 21 && speed <= 30) {
                speed += 2;
            } else if (speed >= 31 && speed <= 40) {
                speed += 3;
            } else if (speed >= 41) {
                speed += 4;
            }
        } else {
            System.out.print("\nTurn on bike before accelerating!");
        }
    }

    public void decelerate() {
        if (power) {
            if (speed > 0) {
                if (speed <= 20) {
                    speed -= 1;
                } else if (speed <= 30) {
                    speed -= 2;
                } else if (speed <= 40) {
                    speed -= 3;
                } else {
                    speed = speed - 4;
                }

            } else {
                System.out.print("\nSpeed is already at lowest. Bike is not moving.");
            }
        } else {
            System.out.print("\nBike cannot decelerate when off.");
        }

    }
}
