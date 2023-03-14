
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which file should hae its contents printed?");
        String fileName = scanner.nextLine();
        try (Scanner reader = new Scanner(Paths.get(fileName))) {
            while (reader.hasNextLine()) {
                System.out.println(reader.nextLine());
            }
        } catch (Exception e) {
            System.out.println("file name not found");
        }
    }
}
