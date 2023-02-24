import java.util.Scanner;

public class swap {
    public static void main(String[] args) {

        int[] array = new int[5];
        array[0] = 1;
        array[1] = 3;
        array[2] = 5;
        array[3] = 7;
        array[4] = 9;
        
        //print out the values in the array
        int index = 0;
        while (index < array.length){
            System.out.println(array[index]);
            index++;
        }

        System.out.println("");

        //initialize scanner
        Scanner s = new Scanner(System.in);

        //prompt user input to enter indices to swap
        System.out.println("Give two indices to swap: ");

        int one = s.nextInt();
        int two = s.nextInt();

        //close scanner
        s.close();
        System.out.println(" ");

        //initalize a helper variable to store values
        int helper = array[one];
        
        array[one] = array[two];
        array[two] = helper;

        //print out the modified array
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }



    }
}
