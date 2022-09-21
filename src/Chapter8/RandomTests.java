package Chapter8;

public class RandomTests {

    public static void main(String[] args) {
        for (int counter = 0; counter < 11; counter++) {
            if (counter == 10) {
                System.out.printf("%7d: ", 100);
            }
            else {
                System.out.printf("%02d - %02d: ", counter * 10, (counter * 10) + 9);
            }
            System.out.println();
        }
        System.out.println();

        int[] frequent = {60, 79, 87, 92, 100, 95, 80, 86, 74, 65, 73};

        int[] bar = new int[11];

        for (int counter : frequent) {
            ++bar[counter / 10];
        }


        for (int counter : bar) {
            System.out.printf("%d   ", counter);
        }
        System.out.println();
        int counter;
        for (counter = 0; counter < frequent.length; counter++) {
            switch (counter) {
                case 10 -> System.out.printf("%7d: ", 100);
                case 1 -> {
                    continue;
                }
                default -> System.out.printf("%02d - %02d: ", counter * 10, (counter * 10) + 9);
            }
            for (int star = 1; star <= bar[counter]; star++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
