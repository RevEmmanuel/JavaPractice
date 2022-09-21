package ClassActivity;

public class AverageProduct {

    public int averageOf(int num1, int num2, int num3) {
        int average;
        average = (num1 + num2 + num3) / 3;
        return average;
    }

    public int productOf(int num1, int num2, int num3) {
        int product;
        product = num1 * num2 * num3;
        return product;
    }

    public int smallestOf(int num1, int num2, int num3) {
        int smallest = num1;
        if (num2 < smallest) {
            smallest = num2;
        }
        if (num3 < smallest) {
            smallest = num3;
        }
        return smallest;
    }

    public int largestOf(int num1, int num2, int num3) {
        int largest = num1;
        if (num2 > largest) {
            largest = num2;
        }
        if (num3 > largest) {
            largest = num3;
        }
        return largest;
    }
}
