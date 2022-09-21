package ClassActivity;

import java.util.Scanner;

public class Calculator {
private Scanner scanner;

    public int addTwoNumbers(int num1, int num2) {
        return num1 + num2;
    }

    public int subtractTwoNumbers(int num1, int num2) {
        return Math.abs(num1 - num2);
    }

    public int divideTwoNumbers(int num1, int num2) {
        return num1 / num2;
    }

    public int multiplyTwoNumbers(int num1, int num2) {
        return num1 * num2;
    }
//    public int addUserInput(int input1, int input2,int input3) {
//        //if (input1 <= 0 || input2 <=0 || input3 <=0){
////        System.out.printf("%s%n","Invalid input");
////        }
////        int result = input1 + input2 + input3;
////        return  result;
//if (input1 <= 0) {
//            System.out.println(input1 + " :This input is too less!!!");
//        } else if (input2 <= 0) {
//            System.out.println("Ahh, wetin happun?");
//        } else if (input3 <= 0) {
//            System.out.println("I give up!!, God abegggg");
//        }
//        return input1 + input2 + input3;
//    }
}

