package ChibuzorAssignment;

public class ArrangedPrinting {

    public static void main(String[] args) {

        for (int counter = 0; counter <= 6; counter++) {
            for (int number = 1; number <= counter; number++) {
                System.out.print(number + " ");
            }
            System.out.println();
        }

    }
}
