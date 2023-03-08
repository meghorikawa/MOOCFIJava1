
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<>();
        int sum = 0;
        while (true){
            int input = scanner.nextInt();
            if (input == -1){
                break;
            }
            nums.add(input);
            sum = input + sum;
        }
        System.out.println("Average: " + (1.0*sum)/(nums.size()));

        
    }
}
