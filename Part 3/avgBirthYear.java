/*Write a program that reads names and birth years from the user 
until an empty line is entered. The name and birth year are separated by a comma.
After that the program prints the longest name and the average of the birth years. 
If multiple names are equally longest, you can print any of them. 
You can assume that the user enters at least one person. */


import java.util.Scanner;

public class avgBirthYear {
    public static void main (String[] args){
        System.out.println("Enter eacher peron's name and birth year seperated by , ");
        //initalize scanner
        Scanner s = new Scanner(System.in);

        //integer for sum
        int sum = 0;
        //integer to count # of entries 
        int counter = 0;
        String longestName = "";

        //loop to accept input
        while (true){
            String input = s.nextLine();
            if (input.equals("")){
                break;
            }
            
            //initalize array and variables
            String[] data = input.split(",");
            int age = Integer.valueOf(data[1]);
            String name = data [0];
            

            if (name.length()>longestName.length()){
                longestName = name;
            }

            sum = sum + age;
            counter++;
        }
        s.close();
        System.out.println("The longest name is: " + longestName);
        System.out.println("The average year born is: " + (1.0*sum)/counter);
    }
}
