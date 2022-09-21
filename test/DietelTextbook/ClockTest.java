package DietelTextbook;

// import static org.junit.jupiter.api.Assertions.*;

class ClockTest {

    public static void main(String[] args) {

        Clock checkTime = new Clock(2, 56, 45);

        checkTime.checkTime();

        checkTime.setHour(25);
        checkTime.setMinute(62);
        checkTime.setSecond(70);

        checkTime.checkTime();

        Clock time = new Clock(24, 60, 60);
        time.checkTime();

        time.setHour(14);
        time.setMinute(24);
        time.setSecond(45);

        time.checkTime();

        System.out.printf("%02d:%02d:%02d%n", time.getHour(), time.getMinute(), time.getSecond());
    }

}