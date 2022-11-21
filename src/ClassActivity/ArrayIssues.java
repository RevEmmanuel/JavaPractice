package ClassActivity;

public class ArrayIssues {

    public static void main(String[] args) {
        int[][] sudoku = new int[9][9];

//        for (int i = 0; i < sudoku.length; i++) {
//            int filled = 9 - i;
//            for (int j = i; j < sudoku[i].length;) {
//                sudoku[i][j - i] = ++j;
//                if (j == 9 && filled != 9) {
//                    int secondFilledIndex = filled;
//                    for (j = 1; filled != 9;) {
//                        sudoku[i][secondFilledIndex] = j++;
//                        secondFilledIndex++;
//                        filled++;
//                    }
//                }
//            }
//        }

        for (int i = 0; i < sudoku.length; i++) {
            for (int j = 0; j < sudoku[i].length; j++) {
                int value = j + i + 1;
                if (value > 9) {
                    value %= 9;
                }
                sudoku[i][j] = value;
            }
        }

        for (int[] ints : sudoku) {
            for (int anInt : ints) {
                System.out.printf("  %d  ", anInt);
            }
            System.out.println();
        }
    }
}
