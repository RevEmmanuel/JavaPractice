package w3Schools;

public class StringLength {

    public static void main(String[] args) {
        String name = "PNEUMONIA";

        String lab = "QWERTYUIOP";

        System.out.println("The length of name is " + name.length());
        System.out.println("The content of name is " + name.toLowerCase());
        System.out.println("The content of name is " + name.toUpperCase());

        System.out.println("The length of lab is " + lab.length());
        System.out.println("I is in " + lab.indexOf("I"));
        System.out.println(name.concat(lab));


    }
}
