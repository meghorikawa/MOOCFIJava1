import java.util.ArrayList;
import java.util.Scanner;

public class numList {
    public static void main(String[] args) {
        // Open scanner
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number to add to the list, when finished enter -1 to quit");
        int input = s.nextInt();

        // initialize list
        ArrayList<Integer> numList = new ArrayList<>();

        // use while loop to take continous input until user types quit
        while (true) {

            if (input == -1) {
                break;
            }

            numList.add(input);
            input = s.nextInt();

        }

        // open new scanner to accept input from user
        System.out.println("Enter the first index you would like to print from: ");
        int startIndex = s.nextInt();
        System.out.println(("Enter the end index"));
        int endIndex = s.nextInt();

        // close scanner
        s.close();

        System.out.println("-------------------");

        for (int i = startIndex; i <= endIndex; i++) {
            System.out.println(numList.get(i));
        }

        // return greatest number in the list

        int greatest = numList.get(0);

        for (int i = 0; i <= numList.size() - 1; i++) {
            int number = numList.get(i);

            if (number > greatest) {
                greatest = number;
            }

        }

        System.out.println("-------------------");
        System.out.println("The largest number in the list is " + greatest);

    }

}
