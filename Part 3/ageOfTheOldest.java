// design a class that takes input and splits it by , and then returns the age oft he oldest

import java.util.Scanner;

public class ageOfTheOldest {
    public static void main(String[] args) {

        System.out.println("Enter names and ages seperated by a , : ");
        Scanner s = new Scanner(System.in);
        int ageOfOldest = 0;

        while (true) {
            String input = s.nextLine();

            if (input.equals("")) {
                break;
            }
            String[] array = input.split(",");

            for (int i = 1; i < array.length; i += 2) {
                //initalize variable and make sure it is converted to int
                int age = Integer.valueOf(array[i]);

                if (age > ageOfOldest) {
                    ageOfOldest = age;
                }
            }
            //close scanner
            s.close();

        }
        System.out.println("The age of the oldest is: "+ ageOfOldest);
    }
}
