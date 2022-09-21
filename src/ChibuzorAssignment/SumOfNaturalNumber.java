package ChibuzorAssignment;

public class SumOfNaturalNumber {
    public static void main(String[] args) {
        int total = 0;

       for(int counter = 1; counter <= 10; counter++) {
           total += counter;
       }
        System.out.printf("The sum of the first ten natural numbers is: %d", total);

    }
}
