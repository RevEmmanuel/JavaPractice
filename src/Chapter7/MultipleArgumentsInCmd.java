package Chapter7;

public class MultipleArgumentsInCmd {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Enter 3 numbers!");
        }
        else {
            int lengthOfArray = Integer.parseInt(args[0]);
            int[] array = new int[lengthOfArray];

            System.out.print("java ");
            for (String arg : args) {
                System.out.printf("%s ", arg);
            }
            System.out.println();
            System.out.printf("%5s%8s%n", "Index", "Value");
            int increment = Integer.parseInt(args[2]);
            int initialValue = Integer.parseInt(args[1]);

            for (int counter = 0; counter < array.length; counter++) {
                array[counter] = initialValue + increment * counter;
                System.out.printf("%5d%8d%n", counter, array[counter]);
            }
        }
    }
}
