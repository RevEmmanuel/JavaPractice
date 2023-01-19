package Chapter15;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ReadFromFile {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(Paths.get("C:\\Users\\user\\IdeaProjects\\adekunleAdeola\\src\\Chapter15\\mySecondFile.txt"))) {
            System.out.printf("%-10s%-12s%-12s%10s%n", "Account", "FirstName", "LastName", "Balance");
            while (scanner.hasNext()) {
                System.out.printf("%-10d%-12s%-12s%10.2f%n", scanner.nextInt(), scanner.next(), scanner.next(), scanner.nextDouble());
            }
        }
        catch (IOException | NoSuchElementException | IllegalStateException exception) {
//        catch (NoSuchElementException | IllegalStateException exception) {
            exception.printStackTrace();
        }
    }
}
