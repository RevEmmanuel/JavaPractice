package Chapter7;

public class NewBarChart {

    //87, 68, 94, 100, 83, 78, 85, 91, 76 and 87. They include one grade of 100,
    //two grades in the 90s, four grades in the 80s, two grades in the 70s, one grade in the 60s
    //and no grades below 60.

    public static void main(String[] args) {
        int[] array = {87,68, 94, 100, 85, 77, 85, 91, 76, 87};

        int hundred = 0;
        int ninety = 0;
        int eighty = 0;
        int seventy = 0;
        int sixty = 0;

        for (int i : array) {
            switch (i / 10) {
                case 10 -> ++hundred;
                case 9 -> ++ninety;
                case 8 -> ++eighty;
                case 7 -> ++seventy;
                case 6 -> ++sixty;
            }
        }

        int[] newArray = {0, 0, 0, 0, 0, 0, hundred, ninety, eighty, seventy, sixty};



       for (int counter = 0; counter < newArray.length; counter++) {
           if (counter == 10) {
                System.out.printf("%7d: ", 100);
            }
            else {
                System.out.printf("%02d - %02d: ", counter * 10, counter * 10 + 9);
            }
            for (int bar = 0; bar < newArray[counter]; bar++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
