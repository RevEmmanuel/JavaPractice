package Chapters2to6;

//3.17 (Computerization of Health Records) A health-care issue that has been in the news lately is
//the computerization of health records. This possibility is being approached cautiously because of
//sensitive privacy and security concerns, among others. [We address such concerns in later exercises.]
//Computerizing health records could make it easier for patients to share their health profiles and histories among their various health-care professionals. This could improve the quality of health care,
//help avoid drug conflicts and erroneous drug prescriptions, reduce costs and, in emergencies, could
//save lives. In this exercise, you’ll design a “starter” HealthProfile class for a person. The class attributes should include the person’s first name, last name, gender, date of birth (consisting of separate
//attributes for the month, day and year of birth), height (in inches) and weight (in pounds). Your class
//should have a constructor that receives this data. For each attribute, provide set and get methods.
//The class also should include methods that calculate and return the user’s age in years, maximum
//heart rate and target-heart-rate range (see Exercise 3.16), and body mass index (BMI; see
//Exercise 2.33). Write a Java app that prompts for the person’s information, instantiates an object of
//class HealthProfile for that person and prints the information from that object—including the person’s first name, last name, gender, date of birth, height and weight—then calculates and prints the
//person’s age in years, BMI, maximum heart rate and target-heart-rate range. It should also display
//the BMI values chart from Exercise 2.33

public class HealthProfile {

    private String firstName;
    private String lastName;
    private String gender;
    private int year;
    private int month;
    private int day;
    private int age;
    private double height;
    private double weight;

    public HealthProfile (String firstName, String lastName, String gender, int year, int month, int day, double height, double weight) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        if (year > 0) {
            this.year = year;
        }
        if (month > 0 && month <= 12) {
            this.month = month;
        }
        if (day > 0) {
            this.day = day;
        }
        if (height > 0) {
            this.height = height;
        }
        if (weight > 0) {
            this.weight = weight;
        }
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

   public void setGender(String gender) { this.gender = gender; }

    public void setYear(int year) {
        this.year = year;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setDay(int day){
        this.day = day;
    }

    public void setHeight(double height) { this.height = height; }

    public void setWeight(double weight) { this.weight = weight; }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getGender() { return gender; }

    public void getDateOfBirth() {
        System.out.printf("%d-%02d-%02d", year, month, day);
    }

    public double getHeight() { return height; }

    public double getWeight() { return weight; }

    public void setAge() {
        this.age = 2022 - year;
    }

    public int getAge(){
        return age;
    }

    public int getMaximumHeartRate() {
        int maximumHeartRate;
        maximumHeartRate = 220 - getAge();
        return maximumHeartRate;
    }

    public double calculateBMI() {
        return (getWeight() * 703) / Math.pow(getHeight(), 2);
    }

    public void getTargetHeartRange() {
        int heart = 50 * getMaximumHeartRate() / 100;
        int rate = 85 * getMaximumHeartRate() / 100;

        System.out.printf("Target heart rate is %d to %d bpm", heart, rate);
    }
}
