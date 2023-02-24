//create sum, print, and printStars methods that can take an array as a parameter

public class arrayMethods {
    public static void main(String[] args) {

        int[] numbers = { 5, 1, 3, 4, 2 };
        System.out.println(sumOfNumbersInArray(numbers));
        System.out.println("----------------");
        printNeatly(numbers);
        System.out.println("----------------");
        printArrayInStars(numbers);
    }

    /**
     * method to calculate the sum of ints in an array
     * 
     * @param array
     * @return the sum
     */
    public static int sumOfNumbersInArray(int[] array) {
        // initiate sum and index variables
        int sum = 0;
        int index = 0;

        while (index < array.length) {
            sum = array[index] + sum;
            index++;
        }
        return sum;
    }

    /**
     * print a neat string representation of the array
     * @param array to be printed
     */
    public static void printNeatly(int[] array) {
        int index = 0;
        //beginning brackets
        System.out.print("{");

        // while loop to interate through array values
        while (index < array.length) {
            if (index == array.length - 1) {
                System.out.print(array[index]);
                index++;
            } else {
                System.out.print(array[index] + ", ");
                index++;
            }
        }
        //end brackets, move to next line
        System.out.println("}");
    }

    public static void printArrayInStars (int[] array){
        int index = 0;
        int numOfStars = 0;
        
        //iterate through each value of the array
        while (index < array.length){
            for (int i =0; i < array[index]; i++){
                System.out.print("*");
            }
            System.out.println("");
            index++;
        }
    }

}
