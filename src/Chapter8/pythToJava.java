package Chapter8;
import java.util.Scanner;

public class pythToJava {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int counter = 1;
        int count = 0;
        String grade = "Null";

        while (counter <= 5) {
            System.out.println("Enter your result: ");
            double result = input.nextDouble();
            if ((result < 0) || (result > 100)) {
                System.out.println("Invalid grade entered!");
                count++;
            }
			else {
                if (result >= 90) { grade = "A";}
				else {
                    if ((result >= 70) && (result <= 89)) { grade = "B";}
				    else {
                        if ((result >= 60) && (result <= 69)) { grade = "C";}
				        else {
                            if ((result >= 50) && (result <= 59)) { grade = "D";}
				            else {
                                if ((result >= 40) && (result <= 49)) { grade = "E";}
				                else {
                                    if ((result >= 0) && (result <= 39)) { grade = "F";}
                                        }
                            }
                        }
                    }
                }
                System.out.printf("Grade is %s", grade);
                counter++;
            }

            if (count == 3) {
                System.out.println("You have entered too many invalid grades!");
                break;
            }

        }

    }

}
