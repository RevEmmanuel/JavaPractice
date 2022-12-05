package chapter14;

public class StringStartEnd {

    public static void main(String[] args) {
        String[] strings = {"started", "starting", "ended", "ending"};

        for (String s : strings) {
            if (s.startsWith("st")) System.out.printf("%s starts with \"st\"%n", s);
        }

        for (String s : strings) {
            if (s.startsWith("art", 2)) System.out.printf("%s starts with \"st\" at position 2%n", s);
        }

        for (String s : strings) {
            if (s.endsWith("ed")) System.out.printf("%s ends with \"ed\"%n", s);
        }


        String letters = "abcdefghijklmabcdefghijklm";

        System.out.printf("Index of a is %d%n", letters.indexOf('a', 2));
        System.out.printf("Index of c is %d%n", letters.indexOf('c'));
        System.out.printf("Index of $ is %d%n", letters.indexOf('$'));
        System.out.printf("Index of def is %d%n%n", letters.indexOf("def"));
        System.out.printf("Index of def is %d%n%n", letters.indexOf("def", 7));
        System.out.printf("Last index of a is %d%n", letters.lastIndexOf('a'));
        System.out.printf("Last index of c is %d%n", letters.lastIndexOf('c'));
        System.out.printf("Last index of def is %d%n", letters.lastIndexOf("def"));
        System.out.printf("Last index of def is %d%n", letters.lastIndexOf("def", 25));

        System.out.printf("Substring from index 20 is %s%n", letters.substring(20));
        System.out.printf("Substring from index 3 up to but not including 6 is %s%n", letters.substring(3, 6));

        String s1 = "Happy ";
        String s2 = "Birthday";
        System.out.printf("s1 is %s%ns2 is %s%n", s1, s2);
        System.out.printf("s1 concat s2 is %s%n", s1.concat(s2));
        System.out.printf("s1 after is %s%n", s1);
        String s3 = s1.concat(s2);
        System.out.printf("s3 is %s%n", s3);
    }
}
