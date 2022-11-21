package ChibuzorAssignment;

import java.util.Arrays;

public class SevenSegmentDisplay {

    private final int[][] pins = new int[5][4];

    public void setScreen(String numbers) {
        validateInput(numbers);
        if (checkOnOrOff(numbers)) {
            int arrayFiller = 0;
            for (int i = 0; i < numbers.length(); i += 3) {
                if (numbers.charAt(i) == '1') Arrays.fill(pins[arrayFiller], 1);
                else Arrays.fill(pins[arrayFiller], 0);
                arrayFiller += 2;
            }

            if (numbers.charAt(1) == '1') pins[1][3] = 1;
            else pins[1][3] = 0;
            if (numbers.charAt(2) == '1') pins[3][3] = 1;
            else pins[3][3] = 0;
            if (numbers.charAt(4) == '1') pins[3][0] = 1;
            else pins[3][0] = 0;
            if (numbers.charAt(5) == '1') pins[1][0] = 1;
            else pins[1][0] = 0;

            pins[0][3] = 1;
            pins[2][3] = 1;
            pins[4][3] = 1;
        }

    }

    public void display() {
        for (int[] pin : pins) {
            for (int aPin : pin) {
                if (aPin == 1) System.out.print(" # ");
                else System.out.print("   ");
            }
            System.out.println();
        }
    }

    public void iWantToSee(String value) {
        validateInputForValue(value);
        switch (value) {
            case "0" -> setScreen("11111101");
            case "1" -> setScreen("01100001");
            case "2" -> setScreen("11011011");
            case "3" -> setScreen("11110011");
            case "4" -> setScreen("01100111");
            case "5" -> setScreen("10110111");
            case "6" -> setScreen("10111111");
            case "7" -> setScreen("11100001");
            case "8" -> setScreen("11111111");
            case "9" -> setScreen("11110111");
        }
    }
    private void validateInput(String input) {
        validateLengthOfInput(input);
        validateNumbersInInput(input);
    }

    private void validateNumbersInInput(String input) {
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != '0' && input.charAt(i) != '1') {
                throw new IllegalArgumentException("Invalid input at position " + (i + 1));
            }
        }
    }

    private void validateLengthOfInput(String input) {
        if (input.length() != 8) {
            throw new IllegalArgumentException("Invalid input. Please enter 8 digits.");
        }
    }

    private void validateInputForValue(String input) {
        try {
            if (Integer.parseInt(input) < 0 || Integer.parseInt(input) > 9) {
                throw new IllegalArgumentException("Invalid input. Please enter a number from 0 to 8.");
            }
        }
        catch (NumberFormatException e) {
            System.out.println("Invalid input.\nEnter a valid value.\n");
        }
    }

    private boolean checkOnOrOff(String input) {
        boolean isOn = true;
        int[] empty = {0, 0, 0, 0};
        if (input.charAt(7) == '0') {
            Arrays.fill(pins, empty);
            isOn = false;
        }
        return isOn;
    }

}
