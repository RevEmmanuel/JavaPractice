package ChibuzorAssignment;

import java.util.Scanner;

public class MinMax {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int maximum = 0;
        int minimum = 999999999;

        System.out.printf("%s%n%s%n %s%n %s%n", "Enter the numbers: ",
                "Type the end-of-file indicator to terminate input:",
                "On UNIX/Linux/macOS type <Ctrl> d then press Enter",
                "On Windows type <Ctrl> z then press Enter");
        while (input.hasNext()) {
            int number = input.nextInt();
            if (number > maximum) maximum = number;
            else if (number < minimum) minimum = number;
        }

        System.out.printf("%nThe maximum number is %d%n", maximum);
        System.out.printf("%nThe minimum number is %d%n", minimum);
    }
}
