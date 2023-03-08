//Create the method public static void printNumbersInRange(ArrayList<Integer> numbers, int lowerLimit, int upperLimit) in the exercise template. The method prints the numbers in the given list whose values are in the range [lowerLimit, upperLimit]. A few examples of using the method are supplied below.
import java.util.ArrayList;


public class numRange {
    public static void main (String[] args){
    ArrayList<Integer> numbers = new ArrayList<>();
    
    numbers.add(3);
    numbers.add(2);
    numbers.add(6);
    numbers.add(-1);
    numbers.add(5);
    numbers.add(1);

    System.out.println("The numbers in the range [0, 5]");

    printNumbersInRange(numbers, 0, 5);

    System.out.println("The numbers in the range [3, 10]");
    printNumbersInRange(numbers, 3, 10);
    System.out.println("Sum: "+ sum(numbers));
    }

    /**
     * complete the method
     * @param numbers list of ints to search
     * @param lowerLimit the index to start the range at
     * @param upperLimit the index to end the range at
     */
    public static void printNumbersInRange(ArrayList<Integer> numbers, int lowerLimit, int upperLimit){
        for (int num: numbers){
            if (num >= lowerLimit && num <= upperLimit){
                System.out.println(num);
            }
        }
    }

    /**
     * complete the method to calculate the sum
     * @param numbers
     * @return the sum of the numbers in the list
     */
    public static int sum (ArrayList<Integer> numbers){
        int ans = 0;

        for (int num: numbers){
            ans = num + ans;  
        }
        return ans;
    }


    
}
