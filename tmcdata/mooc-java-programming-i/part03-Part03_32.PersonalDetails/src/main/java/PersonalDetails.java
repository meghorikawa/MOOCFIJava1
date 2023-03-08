
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String longestName = "";
        int count =0;
        int sum= 0;


        while(true){
            String input = scanner.nextLine();
            if (input.equals("")){
                break;
            }
            String [] people = input.split(",");
            String name = people[0];
            if(name.length() > longestName.length()){
                longestName = people[0];
            }
            sum = Integer.valueOf(people[1]) + sum;
            count ++;
        }


        scanner.close();
        System.out.println("Longest name: "+ longestName);
        System.out.println("Average of the birth years: "+ (1.0*sum)/count);

    }
}
