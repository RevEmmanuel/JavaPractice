package Leetcode;

public class AddBinaryDigits {

    public String addBinary(String a, String b) {
        int addition = convertToInt(a) + convertToInt(b);
        return convertToBinary(addition);
    }

    public static int convertToInt(String number) {
        int newNumber = Integer.parseInt(number);
        int sum = 0;
        int counter = 0;
        for (int length = String.valueOf(newNumber).length(); length != 0; newNumber /= 10) {
            int r = newNumber % 10;
            int decimal = r * (int) Math.pow(2,  counter);
            sum += decimal;
            counter++;
            length--;
        }
        return sum;
    }

    public static String add(String a, String b) {
        if (a.length() > b.length()) {
            for (int i = a.length(); b.length() < a.length();) {
                b = "0" + b;
            }
        }
        else {
            if (b.length() > a.length()) {
                for (int i = b.length(); a.length() < b.length();) {
                    a = "0" + a;
                }
            }
        }

        int remainder = 0;
        int sum = 0;
        String answer = "";
        for (int i = a.length() - 1; i >= 0; i--) {
            sum = Character.getNumericValue(a.charAt(i)) + Character.getNumericValue(b.charAt(i)) + remainder;
            if (sum > 1) {
                answer = (sum % 2) + answer;
            }
            remainder = sum / 2;
        }
        if (remainder > 0) {
            answer = remainder + answer;
        }
        return answer;
    }

    public static String convertToBinary(int number) {
        String binary = "0";
        for (int length = String.valueOf(number).length(); length != 0; number /= 2) {
            int remainder = number % 2;
            int sum = (Integer.parseInt(binary) * 10) + remainder;
            binary += String.valueOf(sum);
            length--;
        }
        return reverseOf(binary);
    }

    public static String reverseOf(String number) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = number.length() - 1; i >= 0; i--) {
            stringBuilder.append(number.charAt(i));
        }
        return stringBuilder.toString();
    }

}
