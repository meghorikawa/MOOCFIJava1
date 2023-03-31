import java.util.Scanner;

public class TextUI {
    private Scanner scanner;
    private SimpleDictionary aJisho;

    public TextUI(Scanner scanner, SimpleDictionary jisho) {
        this.scanner = scanner;
        this.aJisho = jisho;
    }

    public void start() {
        while (true) {
            System.out.println("Command:");
            String input = scanner.nextLine();
            if (input.equals("end")) {
                break;
            }
            processCommand(input);
            System.out.println("");

        }

    }

    public void processCommand(String command) {
        if (command.equals("add")) {
            newEntry();
        } else if (command.equals("search")) {
            seach();
        } else {
            System.out.println("Unknown Command");
        }
    }

    public void newEntry() {
        System.out.println("Word: ");
        String word = scanner.next();
        System.out.println("Translation:");
        String yaku = scanner.next();
        aJisho.add(word, yaku);
    }

    public void seach() {
        System.out.print("To be translated:");
        String toTranslate = scanner.nextLine();
        String translated = aJisho.translate(toTranslate);
        if (translated.equals(null)) {
            System.out.println("Word (" + toTranslate + ") was not found.");
        } else {
            System.out.println("Translation: " + aJisho.translate(toTranslate));
        }
    }
}
