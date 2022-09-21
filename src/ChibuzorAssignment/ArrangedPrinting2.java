package ChibuzorAssignment;

public class ArrangedPrinting2 {

    public static void main(String[] args) {
        for (int counter = 6; counter > 0; counter--) {
            for (int number = 1; number <= counter; number++) {
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }
}
