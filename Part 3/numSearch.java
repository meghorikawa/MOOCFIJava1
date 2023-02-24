// search a number list and return index that the int is found at
//use search algorithm to return the all indexes of the smallest number in list

import java.util.ArrayList;
import java.util.Scanner;

public class numSearch {

    public static void main(String[] args) {

        // first accept input from user
        Scanner s = new Scanner(System.in);
        System.out.println("Enter numbers to add to the list. To quit enter \"-1\"");
        int input = s.nextInt();

        // initialize ArrayList
        ArrayList<Integer> numList = new ArrayList<>();

        // use while loop to add the input ints to list
        while (true) {
            // should make if statement first so that the -1 will not be added to
            // the list
            if (input == -1) {
                break;
            }
            numList.add(input);
            input = s.nextInt();
        }

        // prompt user for input for number they want to search for
        System.out.println("Please enter the number you would like to search the list for.");
        int search = s.nextInt();

        // use for loop to iterate through list and give index of each instance
        for (int i = 0; i <= numList.size() - 1; i++) {
            if (search == numList.get(i)) {
                System.out.println(search + " is at index " + i);
            }
        }

        int smallest = numList.get(0);

        // use for loop to iterate through list and find smallest number
        for (int i = 0; i <= numList.size() - 1; i++) {
            if (numList.get(i) < smallest) {
                smallest = numList.get(i);
            }
        }
        System.out.println("The smallest number is " + smallest);

        // use search function to return the location of each instance of the smallest
        // num in the list
        for (int i = 0; i <= numList.size() - 1; i++) {
            if (smallest == numList.get(i)) {
                System.out.println("at index " + i);
            }
        }
        s.close();

    }
}
