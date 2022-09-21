package ClassActivity;

class IPhoneTest {
    public static void main(String[] args) {
        IPhone phone11 = new IPhone();
        IPhone phone12 = new IPhone();

        phone11.setColor("Black");
        phone12.setColor("Blue");

        IPhone.setPrice(1500.75);

        System.out.printf("The color of phone11 is %s%n", phone11.getColor());
        System.out.printf("The color of phone12 is %s%n%n", phone12.getColor());

        System.out.printf("The price of phone11 is $%.2f%n", phone11.getPrice());
        System.out.printf("The price of phone11 is $%.2f%n", phone12.getPrice());


    }


}