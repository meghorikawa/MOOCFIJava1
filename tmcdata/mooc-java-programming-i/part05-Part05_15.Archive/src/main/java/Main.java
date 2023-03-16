
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Archive> list = new ArrayList<>();

        while (true) {
            System.out.println("Indentifier? (empty will stop)");
            String anIdentifier = scanner.nextLine();

            if (anIdentifier.isEmpty()) {
                break;
            }

            System.out.println("Name? (empty will stop)");
            String aName = scanner.nextLine();

            if (aName.isEmpty()) {
                break;
            }
            Archive thing = new Archive(anIdentifier, aName);
            if (list.contains(thing)) {
                continue;
            } else {
                list.add(thing);
            }
        }
        
        scanner.close();

        System.out.println("==Items==");
        for (Archive i : list) {
            System.out.println(i);
        }

    }
}
