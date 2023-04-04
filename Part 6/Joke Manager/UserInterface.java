import java.util.Scanner;

public class UserInterface {

    private Scanner scanner;
    private JokeManager list;

    public UserInterface(JokeManager aList, Scanner s) {
        this.scanner = s;
        this.list = aList;
    }

    public void start() {

        while (true) {

            System.out.println("Commands:");
            System.out.println("1 - add a joke");
            System.out.println("2- draw a joke");
            System.out.println("3 - list jokes");
            System.out.println("X - stop");

            String input = scanner.nextLine();
            if (input.equals("X")) {
                break;
            }
            if (input.equals("1")) {
                System.out.println("Write the joke to be added:");
                String newJoke = scanner.nextLine();
                list.addJoke(newJoke);
            } else if (input.equals("2")) {
                System.out.println("Drawing jokes");
                String drawn = list.drawJoke();
                System.out.println(drawn);
            } else if (input.equals("3")) {
                list.printJokes();
            }

        }
        scanner.close();
    }

}
