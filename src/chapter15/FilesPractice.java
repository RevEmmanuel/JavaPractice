package Chapter15;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class FilesPractice {

    public static void main(String[] args) {
        try {
            File newFile = new File("C:\\Users\\user\\IdeaProjects\\adekunleAdeola\\src\\Chapter15\\mySecondFile.txt");
            if (newFile.createNewFile()) System.out.println("File created successfully " + newFile.getName());
            else System.out.println("File already exists " + newFile.getAbsolutePath());

            FileWriter fileWriter = new FileWriter("C:\\Users\\user\\IdeaProjects\\adekunleAdeola\\src\\Chapter15\\mySecondFile.txt");
            fileWriter.write("""
            Hi there! My name is Adeola.
            I am a native of Semicolon Africa.
            """);
            fileWriter.close();
            System.out.println("Successfully written to file!");

//            newFile = new File("C:\\Users\\user\\IdeaProjects\\adekunleAdeola\\src\\Chapter15\\mySecondFile.txt");
//            Scanner scanner = new Scanner(newFile);
//            while (scanner.hasNextLine()) {
//                String line = scanner.nextLine();
//                System.out.println(line);
//            }
//            System.out.println(newFile.length());
//
//            Scanner input = new Scanner(System.in);
//            System.out.println("Enter a path: ");
//            Path path = Paths.get(input.nextLine());
//
//            if (Files.exists(path)) {
//                System.out.printf("Path name: %s%n", path.getFileName());
//                System.out.printf("It %s a directory%n", (Files.isDirectory(path) ? "is" : "is not"));
//                System.out.printf("It %s an absolute path%n", (path.isAbsolute() ? "is" : "is not"));
//                System.out.printf("Last modified: %s%n", Files.getLastModifiedTime(path));
//                System.out.printf("Size: %ss%n", Files.size(path));
//                System.out.printf("Absolute path: %s%n", path.toAbsolutePath());
//
//
//
//                if (Files.isDirectory(path)) {
//                    DirectoryStream<Path> stream = Files.newDirectoryStream(path);
//                    for (Path p : stream) {
//                        System.out.println(p.toAbsolutePath());
//                    }
//                    stream.close();
//                }
//            }
//            else System.out.println("Path does not exist.");
        }
        catch (IOException exception) {
            System.out.println("An error occurred");
            exception.printStackTrace();
        }
    }
}


