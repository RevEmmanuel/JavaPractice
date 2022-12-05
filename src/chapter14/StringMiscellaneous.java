package chapter14;

public class StringMiscellaneous {

    public static void main(String[] args) {
        String greeting = "Hello, world";
        char[] charArray = new char[10];

        System.out.printf("Greeting: %s%n", greeting);
        System.out.printf("The length of greeting is %d%n", greeting.length());

        System.out.print("Greeting in reverse is: ");
        for (int i = greeting.length() - 1; i >= 0; i--) {
            System.out.printf("%c ", greeting.charAt(i));
        }
        System.out.println();

        greeting.getChars(7, 10, charArray, 3);
        System.out.println(charArray);
    }
}
