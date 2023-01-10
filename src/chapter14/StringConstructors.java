package chapter14;

public class StringConstructors {

    public static void main(String[] args) {
        char[] birthday = {'H', 'a', 'p', 'p', 'y', ' ', 'b', 'i', 'r', 't', 'h', 'd', 'a', 'y'};
        String greet = "Hello, world";
        String s1 = new String();
        String s2 = new String(greet);
        String s3 = new String(birthday);
        String s4 = new String(birthday, 11, 3);

        System.out.printf("""
                s1 = %s
                s2 = %s
                s3 = %s
                s4 = %s
                """, s1, s2, s3, s4);

        String input = "-123fgjf";

        String input2 = input.replaceAll("[^-\\d]", "");
        System.out.println(input2);

    }
}
