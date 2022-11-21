package Chapter8;

// import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

class FirstTimeTest {

    public static void main(String[] args) {
        LocalDate timer = LocalDate.now();
        System.out.println("Year is " + timer.getYear());
        FirstTimeClass time = new FirstTimeClass();
        TimeWithOverloadedConstructor time1 = new TimeWithOverloadedConstructor();
        TimeWithOverloadedConstructor time2 = new TimeWithOverloadedConstructor(12);
        TimeWithOverloadedConstructor time3 = new TimeWithOverloadedConstructor(12, 45);
        TimeWithOverloadedConstructor time4 = new TimeWithOverloadedConstructor(14, 45, 34);
        TimeWithOverloadedConstructor time5 = new TimeWithOverloadedConstructor(time4);
//        time.hour = 7;
//        time.minute = 16;
        // displays error message

        displayTime(time1, "Time1 Object with no argument: ");
        displayTime(time2, "Time2 object with only hour argument: ");
        displayTime(time3, "Time3 object with hour and minute argument: ");
        displayTime(time4, "Time4 object with full argument");
        displayTime(time5, "Time5 object with time4 time.");

        System.out.printf("The time before it was set is %s%n", time); // toString method is called implicitly
        time.setTime(22, 16, 9);
        System.out.printf("The time now is %s%n", time.toUniversalString());
        System.out.printf("The time now is %s%n", time);

        try {
            time.setTime(27, 63, 62);
        }
        catch (IllegalArgumentException mistake) {
            System.out.printf("%s%n", mistake.getMessage());
        }

        System.out.printf("The time now is %s%n", time);

        try {
            TimeWithOverloadedConstructor time6 = new TimeWithOverloadedConstructor(25, 45, 30);
            displayTime(time6, "Time6 Object with wrong argument");
        }
        catch (IllegalArgumentException mistake) {
            System.out.println(mistake.getMessage());
        }

        time4.setHour(23);
        displayTime(time4, "Modify time of time4");
        displayTime(time5, "Check if time5 is also modified.");
    }

    public static void displayTime(TimeWithOverloadedConstructor timeIs, String header) {
        System.out.printf("%s%n   %s%n   %s%n", header, timeIs, timeIs.toUniversalString());
    }

}