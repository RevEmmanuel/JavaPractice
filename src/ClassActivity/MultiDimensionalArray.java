package ClassActivity;

public class MultiDimensionalArray {

    public static void main(String[] args) {
        char[][] charArray = {{'X', 'O', 'X'}, {'X', 'O', 'X'}, {'X', 'X', 'O'}};

        System.out.print("{");
        for (char[] row : charArray) {
            System.out.print("  ---{");
            for (char column : row) {
                System.out.printf("  %s  ", column);
            }
            System.out.print("}---  ");
        }
        System.out.println("}");

        for (char[] row : charArray) {
            for (char column : row) {
                System.out.printf("  %s  ", column);
            }
            System.out.println();
        }
    }
}
