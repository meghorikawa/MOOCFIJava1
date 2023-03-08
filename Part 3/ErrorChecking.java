import java.util.Scanner;

//There is an error in the below program, identify it and propose a fix.

public class ErrorChecking {

    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);
        System.out.print("Customer number: ");
        int y = Integer.valueOf(x.nextLine());

        // the else if statement will not apply for numbers over 2000
        //as they will always meet the first condition. skipping the second
        //else if should be replaced with just if 
        if (y >= 1000 && y > 2000 && y % 25 == 0) {
            System.out.println("Gets a gift card!");
        }
        if (y % 2000 == 0) {
            System.out.println("Gets a large gift card!");
        } 
        else {
            System.out.println("Gets nothing.");
        }
        x.close();
    }

}