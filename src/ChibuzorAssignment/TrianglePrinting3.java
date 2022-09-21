package ChibuzorAssignment;

public class TrianglePrinting3 {

    public static void main(String[] args) {
        for (int counter = 0; counter < 10; counter++) {
            for (int space = 1; space < counter + 1; space++) {
                System.out.print(" ");
            }
                for (int star = 10; star > counter; star--) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
