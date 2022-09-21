package Chapter7;

//Figure 7.17 demonstrates initializing two-dimensional arrays with array initializers and using nested for loops
// to traverse the arrays (i.e., manipulate every element of each array).
//Class InitArray’s main declares two arrays. The declaration of array1 (line 7) uses nested
//array initializers of the same length to initialize the first row to the values 1, 2 and 3, and
//the second row to the values 4, 5 and 6. The declaration of array2 (line 8) uses nested
//initializers of different lengths. In this case, the first row is initialized to two elements with
//the values 1 and 2, respectively. The second row is initialized to one element with the value
//3. The third row is initialized to three elements with the values 4, 5 and 6, respectively.

public class MultidimensionalArray {

    public static void main(String[] args) {
        int[][] array1 = {{1, 2, 3}, {4, 5, 6}};
        int[][] array2 = {{1, 2}, {3}, {4, 5, 6}};

        System.out.println("The contents of array 1 by row are: ");
        outputArray(array1);
        System.out.println();
        System.out.println("The contents of array 2 by row are: ");
        outputArray(array2);
    }

    public static void outputArray(int[][] array) {
        for (int[] row : array) {
            for (int column : row) {
                System.out.printf("%d   ", column);
            }
            System.out.println();
        }

        int total = 0;
        for (int[] row : array) {
            for (int column : row) {
                total += column;
            }
        }

        System.out.printf("The total of all the elements in the array is %d", total);

//        for (int row = 0; row < array.length; row++) {
//            for (int column = 0; column < array[row].length; column++) {
//                System.out.printf("%d  ", array[row][column]);
//            }
//            System.out.println();
//        }
    }
}
