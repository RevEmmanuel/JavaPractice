package Chapter8;

public class Date {

    private int month;
    private int day;
    private int year;

    int[] daysOfTheMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public Date(int year, int month, int day) {
        if (year < 0){
            throw new IllegalArgumentException("Invalid value for year!");
        }
        if (year % 4 == 0) {
            daysOfTheMonth[2] = 29;
        }
        if (month < 1 || month > 12) {
            throw new IllegalArgumentException("Month is invalid!");
        }
        if (day > daysOfTheMonth[month] || day < 1) {
            throw new IllegalArgumentException("Month " + month + " has only " + daysOfTheMonth[month] + " days starting"
            + " from 1!");
        }
//        if (month < 1 || month > 12 || day > daysOfTheMonth[month] || day < 1) {
//            throw new IllegalArgumentException("Month " + month + " has only " + daysOfTheMonth[month] + " days!");
//        }
        this.year = year;
        this.month = month;
        this.day = day;
        System.out.printf("Date object constructor for date %s%n", this);
    }

//    public void setMonth(int month) {
//        if (month < 1 || month > 12) {
//            throw new IllegalArgumentException("Month is invalid!");
//        }
//        this.month = month;
//    }
//
//    public void setDay(int day) {
//        if (day > daysOfTheMonth[month] || day < 1) {
//            throw new IllegalArgumentException("Month " + month + " has only " + daysOfTheMonth[month] + " days starting"
//                    + " from 1!");
//        }
//    }
//
//    public void setYear(int year) {
//        this.year = year;
//    }

    public String toString() {
        return String.format("%02d/%02d/%04d", day, month, year);
    }

}
