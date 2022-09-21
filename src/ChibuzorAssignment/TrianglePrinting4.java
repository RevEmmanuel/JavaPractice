package ChibuzorAssignment;

public class TrianglePrinting4 {
    public static void main(String[] args) {

        for (int counter = 0; counter < 10; counter++) {
            for (int space = 10; space > counter + 1; space--) {
                System.out.print(" ");
            }
            for (int star = 0; star < counter; star++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
