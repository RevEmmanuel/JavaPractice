package ChibuzorAssignment;

public class ArrangedPrinting3 {

    public static void main(String[] args) {
        for (int counter = 6; counter >= 0; counter--) {
            for (int space = 7; space > counter + 1; space--) {
                System.out.print("  ");
            }
            for (int number = counter; number >= 1; number--) {
                System.out.print(number + " ");
            }
            System.out.println();
        }

    }

}

