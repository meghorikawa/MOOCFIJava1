// receive input of name and age and return the name of the oldest child

import java.util.Scanner;

public class nameOfTheOldest {
    public static void main(String[] args) {
        System.out.println("Enter names and ages seperated by a , : ");
        Scanner s = new Scanner(System.in);
        int ageOfOldest = 0;
        String nameOfOldest = "";

        while (true) {
            String input = s.nextLine();

            if (input.equals("")) {
                break;
            }
            // split input into the array
            String[] array = input.split(",");
            // initalize variable and make sure it is converted to int
            int age = Integer.valueOf(array[1]);

            if (age > ageOfOldest) {
                ageOfOldest = age;
                nameOfOldest = array[0];
            }
        }
        s.close();
        System.out.println("The name of the oldest is: " + nameOfOldest);
        System.out.println("The age of the oldest is: " + ageOfOldest);
    }
}
