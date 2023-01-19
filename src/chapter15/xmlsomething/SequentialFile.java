package Chapter15.xmlsomething;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class SequentialFile {

    public static void main(String[] args) {
        Accounts accounts = new Accounts();
        Path source = Paths.get("C:\\Users\\user\\IdeaProjects\\adekunleAdeola\\src\\Chapter15\\mySecondFile.txt");
        try (BufferedWriter writer = Files.newBufferedWriter(source)) {
            Scanner scanner = new Scanner(source);

        }
        catch (IOException e) {
            System.err.println("An error occurred");
        }
    }
}
