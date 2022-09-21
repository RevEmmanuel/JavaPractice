package ClassActivity;


public class Colors {

    public static void main(String[] args) {
        String[] colors = {"Red", "Orange", "Yellow", "Green", "Blue", "Indigo", "Violet"};

        for (String counter : colors) {
            System.out.printf("%s   ", counter);
        }
        System.out.println(" ");

        for (int index = 6; index >= 0; index--) {
            System.out.printf("%s    ", colors[index]);
        }
    }
}
