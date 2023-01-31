package chapter17;

import java.util.stream.IntStream;

public class StreamPractice {

    public static void main(String[] args) {
        int sumOfNumbers = IntStream.rangeClosed(1, 10).sum();
        System.out.printf("Sum of numbers from 1 to 10 is %d%n", sumOfNumbers);

        sumOfNumbers = IntStream.rangeClosed(1, 10).map((int x) -> x * 2).sum();
        System.out.printf("Sum of even numbers from 2 to 20 is %d%n", sumOfNumbers);
    }
}
