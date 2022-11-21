package HackerRank;

import java.util.Scanner;

public class Solution {

    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        if (t >= 0 && t <= 500){
            for(int i=0;i<t;i++) {
                int a = in.nextInt();
                int b = in.nextInt();
                int n = in.nextInt();

                int powerSomething = 1;
                double sum = a;
                if (a >= 0 && a <= 50 && b >= 0 && b <= 50 && n >= 1 && n <= 15) {
                    for (int j = 0; j < n; j++) {
                        sum += (powerSomething * b);
                        System.out.printf("%.0f ", sum);
                        powerSomething *= 2;
                    }
                    System.out.println();
                }
            }
        }
        in.close();
    }
}
