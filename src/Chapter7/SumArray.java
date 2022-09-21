package Chapter7;

public class SumArray {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int total = 0;

        for (int i : array) {
            total += i;
        }

        System.out.printf("The sum of the first ten natural numbers is %d", total);

        int total1 = 0;
        for (int i : array) {
            total1 += i;
        }
        System.out.printf("%nThe sum of the first ten natural numbers is %d", total1);
    }
}
