package Chapter8;

public class TimeWithOverloadedConstructor {

    private int hour;
    private int minute;
    private int second;

    public TimeWithOverloadedConstructor() {
        this(0, 0, 0);
    }

    public TimeWithOverloadedConstructor(int hour) {
        this(hour, 0, 0);
    }

    public TimeWithOverloadedConstructor(int hour, int minute) {
        this(hour, minute, 0);
    }

    public TimeWithOverloadedConstructor(int hour, int minute, int second) {
        validateTime(hour, minute, second);
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public TimeWithOverloadedConstructor(TimeWithOverloadedConstructor watch) {
        this(watch.hour, watch.minute, watch.second);
    }

    public void setTime(int hour, int minute, int second) {
        validateTime(hour, minute, second);
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public String toString() {
        return String.format("%02d : %02d : %02d", hour, minute, second);
    }

    public String toUniversalString() {
        return String.format("%02d : %02d : %02d  %s", ((hour == 0 || hour == 12) ? 12 : (hour % 12)), minute,
                second,(hour >= 12 ? "PM" : "AM"));
    }

    public static void validateTime(int hour, int minute, int second) {
        validateHour(hour);
        validateMinute(minute);
        validateSecond(second);
    }

    private static void validateHour(int hour) {
        boolean hourIsInvalid = hour < 0 || hour > 23;
        if (hourIsInvalid) {
            throw new IllegalArgumentException("Hour is an invalid value!\n");
        }
    }

    private static void validateMinute(int minute) {
        boolean minuteIsInvalid = minute < 0 || minute > 59;
        if (minuteIsInvalid) {
            throw new IllegalArgumentException("Minute is an invalid value!\n");
        }
    }

    private static void validateSecond(int second) {
        boolean secondIsInvalid = second < 0 || second > 59;
        if (secondIsInvalid) {
            throw new IllegalArgumentException("Second is an invalid value!\n");
        }
    }
}
