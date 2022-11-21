package ChibuzorAssignment;

public class SevenSegmentDisplaySession {

    public static void main(String[] args) {
        SevenSegmentDisplay sevenSegmentDisplay = new SevenSegmentDisplay();
//        sevenSegmentDisplay.setScreen("11100001");
//        sevenSegmentDisplay.display();

        for (int i = 0; i < 10; i++) {
            sevenSegmentDisplay.iWantToSee(String.valueOf(i));
            sevenSegmentDisplay.display();
            System.out.println();
            System.out.println();
        }
//        sevenSegmentDisplay.iWantToSee("0");
//        sevenSegmentDisplay.display();
    }
}
