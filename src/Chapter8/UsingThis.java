package Chapter8;

public class UsingThis {
    public static void main(String[] args) {
        SecondTime second = new SecondTime(12,30,56);
        SecondTime timeObject = new SecondTime(12, 34, 45);
        System.out.println(timeObject.timeBuild());
        // System.out.println(second.times); gives error
        System.out.println(second.timeZone);
    }
}

class SecondTime {
    private int hour;
    private int second;
    private int minute;

    String timeZone = "Nigeria";
    private static final String times = "Germany";


    public SecondTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public String timeBuild() {
        return String.format("%35s: %s%n%35s: %s%n", "Explicitly calling this.toUniversalString", this.toUniversalString(),
                "Implicitly calling this.toUniversalString", toUniversalString());
    }

    public String toUniversalString() {
        return String.format("%02d : %02d : %02d", hour, minute, second);
        // There is no need to use "this" because there is no local variable with
        // the same name as the instance variable.
    }
}
