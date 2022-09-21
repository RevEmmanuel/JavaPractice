package Chapter7;

public class OutOfBoundArray {

    public static void main(String[] args) {
        int[] result = {1, 2, 5, 4, 3, 5, 2, 1, 3, 3, 1, 4, 3, 3, 3, 2, 3, 3, 2, 14};
        int[] frequency = new int[6];

        for (int answer = 0; answer < result.length; answer++) {
            try {
                ++frequency[result[answer]];
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e); // invokes toString method
                System.out.printf(" responses[%d] = %d%n%n",
                        answer, result[answer]);
            }
        }

            System.out.printf("%8s%20s%n", "Response", "Number Of Students");

            for (int print = 1; print < frequency.length; print++) {
                System.out.printf("%8d%20d%n", print, frequency[print]);
            }
        }
    }


