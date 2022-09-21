package ChibuzorAssignment;

public class TrianglePrinting2 {

    public static void main(String[] args) {
        for (int count = 10; count > 0; count--) {
            for (int star = 0; star < count; star++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}

