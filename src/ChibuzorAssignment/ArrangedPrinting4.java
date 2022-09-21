package ChibuzorAssignment;

public class ArrangedPrinting4 {

    public static void main(String[] args) {
        for (int counter = 6; counter > 0; counter--) {
            for (int space = 6; space >= counter + 1; space--) {
                System.out.print("  ");
            }
            for (int number = 1; number <= counter; number++) {
                System.out.print(number + " ");
            }
            System.out.println();
        }

        }
    }


