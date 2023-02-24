// practice implementing ArrayLists

import java.util.ArrayList;
import java.util.Scanner;

public class ThirdElement{
    
    public static void main (String[] args){
        //Open scanner 
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a name to add to the list, when finished enter quit");
        String input = s.next();

        //initialize list 
        ArrayList<String> nameList = new ArrayList<>();

        //use while loop to take continous input until user types quit
        while(input != null){
            
            nameList.add(input);
            System.out.println( input + " has been added to list");
            input = s.next();
            if (input.equals("quit")){
                break;
            }
        }
        //close scanner
        s.close();

        
        //print out the third element in the list
        if (nameList.size() < 4){
            System.out.println("Error: There are not enough names! You must add at least 4 names to the list.");
        }
        else {
            System.out.println("The third element on the list is: " + nameList.get (2));
        }
  
        

    }
}
