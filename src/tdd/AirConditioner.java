package tdd;

public class AirConditioner {
    private boolean power;
    private int temperature;

    int[] temp = new int[1];


    public void powerOn() {
        if (!power) {
            power = true;
        }
        temperature = temp[0];
    }

    public boolean powerStatus() {
        return power;
    }

    public void powerOff() {
        if (power) {
            power = false;
            temperature = 0;
        }
    }

    public void increaseTemperature(int degree) {
                temperature = temperature + degree;
                if (temperature > 30) {
                    temperature = 30;
                }
        temp[0] = temperature;
    }

    public int getTemperature() {
                return temperature;
            }

    public void reduceTemperature(int degree) {
        temperature = temperature - degree;
        if (temperature < 16) {
            temperature = 16;
        }
        temp[0] = temperature;
    }

    public void setTemperature(int degree) {
        if (degree >= 16 && degree <= 30) {
                temperature = degree;
            }
            else if (degree < 16) {
                temperature = 16;
            }
            else {
                temperature = 30;
            }

            temp[0] = temperature;
    }
}
