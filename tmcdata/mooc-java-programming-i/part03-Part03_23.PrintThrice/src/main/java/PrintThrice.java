
import java.util.Scanner;

public class PrintThrice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();

        scanner.close();

        System.out.print(word+word+word);
        System.out.println("");

    }
}
