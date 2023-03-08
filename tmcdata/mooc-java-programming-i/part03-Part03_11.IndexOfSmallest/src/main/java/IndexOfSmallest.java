
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<>();
        int smallest = 9999;

        while (true) {
            int input = scanner.nextInt();
            if (input == 9999) {
                break;
            }
            nums.add(input);
        }

        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) < smallest) {
                smallest = nums.get(i);
            }
        }
        System.out.println("Smallest number: " + smallest);

        for (int x = 0; x < nums.size(); x++) {
            if (nums.get(x) == smallest) {
                System.out.println("Found at index: " + x);
            }
        }

    }
}
