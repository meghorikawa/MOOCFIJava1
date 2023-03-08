
    
import java.util.Scanner;

public class test {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int ageOfOldest = -1;
        String nameOfOldest = "";

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            String[] parts = input.split(",");
            int age = Integer.valueOf(parts[1]);
            System.out.println(Integer.valueOf(parts[0]));
            if (age > ageOfOldest) {
                ageOfOldest = age;
                nameOfOldest = parts[0];
            }
        }
        scanner.close();
        System.out.println("Name of the oldest: " + nameOfOldest);
    }
}

