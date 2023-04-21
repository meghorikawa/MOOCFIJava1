
public class MainProgram {

    public static void main(String[] args) {
        // write your test code here

        int[] numbers = { 8, 3, 7, 9, 1, 2, 4 };
        MainProgram.sort(numbers);

    }

    // Returns the smallest value of an array
    public static int smallest(int[] array) {
        int s = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] < s) {
                s = array[i];
            }
        }
        return s;
    }

    // return index of smallest number
    public static int indexOfSmallest(int[] array) {
        int s = array[0];
        int smallIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < s) {
                s = array[i];
                smallIndex = i;
            }
        }
        return smallIndex;

    }

    // return index of smallest value after a given value
    public static int indexOfSmallestFrom(int[] array, int startIndex) {
        // variable to store the smallest number for comparison
        int s = array[startIndex];
        // initial index
        int index = startIndex;

        for (int i = startIndex; i < array.length; i++) {
            if (array[i] < s) {
                s = array[i];
                index = i;
            }
        }

        return index;

    }

    // swap method which swaps numbers at the given indices
    public static void swap(int[] array, int index1, int index2) {
        int num1 = array[index1];
        int num2 = array[index2];

        array[index1] = num2;
        array[index2] = num1;

    }

    // sorting algorithm using the above methods
    public static void sort(int[] array) {
        // find smallest number and switch the indicies with 0
        for (int i = 0; i < array.length; i++) {
            int smallIndex = MainProgram.indexOfSmallestFrom(array, i);
            MainProgram.swap(array, smallIndex, i);

        }

    }

}
