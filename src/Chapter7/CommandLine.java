package Chapter7;

// 7.15 (Command-Line Arguments) Write a program that takes command-line arguments and
//computes the average of their maximum and minimum. Make sure there are command-line arguments
// being passed before you attempt to compute anything.
//7.16 (Using the Enhanced for Statement) Write an application that uses an enhanced for
//statement to find the absolute values of int numbers passed by command-line arguments.

public class CommandLine {

    public static void main(String[] args) {

        int maximum = Integer.parseInt(args[0]);
        int minimum = Integer.parseInt(args[0]);

        for (String arg : args) {
            if (Integer.parseInt(arg) > maximum) {
                maximum = Integer.parseInt(arg);
            }
            if (Integer.parseInt(arg) < minimum) {
                minimum = Integer.parseInt(arg);
            }
        }

        System.out.printf("Maximum is %d%n", maximum);
        System.out.printf("Minimum is %d%n", minimum);

        System.out.printf("%nThe average is %.2f%n", ((double) minimum + maximum) / 2);

        for (String num : args) {
            System.out.printf("%d  ", Math.abs(Integer.parseInt(num)));
        }
    }
}
