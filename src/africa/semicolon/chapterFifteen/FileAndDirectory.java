package africa.semicolon.chapterFifteen;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class FileAndDirectory {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter file or directory name");
        Path path = Paths.get(scan.nextLine());

        if (Files.exists(path)){
            System.out.printf("%n%s exists %n", path.getFileName());
            System.out.printf("%s a directory%n ", Files.isDirectory(path)?"Is ": "Is not");
            System.out.printf("%s an absolute path%n", path.isAbsolute()?"Is":"Is not");
            System.out.printf("Last modified: %s%n", Files.getLastModifiedTime(path));
            System.out.printf("Size: %s%n", Files.size(path));
            System.out.printf("Path:%s%n", path);
            System.out.printf("Absolute path: %s%n", path.toAbsolutePath());

            if (Files.isDirectory(path)){
                System.out.println("%n Directory contents: %n");
                DirectoryStream<Path> directoryStream = Files.newDirectoryStream(path);
                for (Path child : directoryStream){
                    System.out.println(child);
                }
            }
            else System.out.printf("%s does not exist", path);
        }
    }
}
