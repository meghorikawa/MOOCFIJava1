
import java.util.Scanner;

public class indexNotFound {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] array = new int[10];
        array[0] = 6;
        array[1] = 2;
        array[2] = 8;
        array[3] = 1;
        array[4] = 3;
        array[5] = 0;
        array[6] = 9;
        array[7] = 7;

        System.out.println("Search for? ");
        int search = s.nextInt();

        // close scanner
        s.close();

        // initialize index variable and booleans
        int index = 0;
        boolean found = false;
        // use while to iterate through array
        while (index < array.length) {
            if (search == array[index]) {
                System.out.println(search + " is at index " + index + ".");
                found = true;
            }
            index++;
        }
        // if not found:
        if (!found) {
            System.out.println(search + " was not found.");
        }
    }
}
