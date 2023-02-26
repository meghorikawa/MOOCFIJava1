// a class that takes input and will split the string and print it onto seperate lines

import java.util.Scanner;

public class lineByLine {

    public static void main (String[] args){
        System.out.println("Enter a string to split");
        Scanner s = new Scanner(System.in);


        //split string by whitespace
        

        //use loop to take continous input
        while (true){
            //first take input and split into array
            String input = s.nextLine();
            String[] words = input.split(" ");
            
            //iterate through array and print each index
            for (int i = 0; i < words.length; i++){
                System.out.println(words[i]);
            }
            //end loop if nothing is entered
            if (input.equals("")){
                break;
            }
        }
        //close scanner
        s.close();

       

    }

}
