//a class to search a list of strings and return if the parameter was found


import java.util.Scanner;
import java.util.ArrayList;

public class stringSearch {

    public static void main (String[] args){
        //intialize Array List
        ArrayList<String> nameList = new ArrayList<>();
        
        //take user input of the list
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a name to add to the list, when finished enter quit");
        String input = s.nextLine();

        while(input != null){
            if (input.equals("")){
                break;
            }
            nameList.add(input);
            input = s.nextLine();

        }

        //prompt user to give the name they are searching for
        System.out.println("Search for? ");
        String search = s.nextLine();

        //close scanner
        s.close();

        //use contains method to search list
        if (nameList.contains(search)){
            System.out.println(search + " was found!");
        }
        else {
            System.out.println(search + " was not found");
        }




    }
}
