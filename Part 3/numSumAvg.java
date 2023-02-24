//create program that will return the sum and average of the entered numbers
import java.util.ArrayList;
import java.util.Scanner;

public class numSumAvg {
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
        s.close();
        int sum = 0;

        //for loop to calculate the sum
        for (int i = 0; i <= numList.size() -1; i++){
            sum = sum + numList.get(i);
        }
        System.out.println("Sum: "+ sum);
        System.out.println("Average: " + 1.0* (sum/numList.size()));

    }
}
