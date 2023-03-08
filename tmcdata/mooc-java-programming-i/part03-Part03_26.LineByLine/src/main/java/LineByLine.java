
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true){
            String input = scanner.nextLine();
            if (input.equals("")){
                break;
            }
            String[] stuff = input.split(" ");
            for (String word : stuff) {
                System.out.println(word);
        }
    }
    }
}
