package Chapter8;
import static java.lang.Math.*;

public class StaticImport {

    public static void main(String[] args) {
        System.out.printf("E is %.5f%n", E);
        System.out.printf("Pi is %.5f%n", PI);
        System.out.printf("Square root of 9 is %d%n", (int)sqrt(9));
        System.out.printf("2 raced to power 3 is %d%n", (int)pow(2, 3));
    }
}
