package chapter14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

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

        Pattern pattern = Pattern.compile("Java SE");
        Matcher matcher = pattern.matcher("Java SE");
        System.out.println(matcher.matches());

        pattern = Pattern.compile("[a-z A-Z]*");
        matcher = pattern.matcher("Endangered species will likely end up dead");
        System.out.println(matcher.matches());

        pattern = Pattern.compile("[eE].+?d");
        matcher = pattern.matcher("Endangered species will likely end up dead");
        while (matcher.find()) System.out.println("matched -> " + matcher.group());
    }
}
