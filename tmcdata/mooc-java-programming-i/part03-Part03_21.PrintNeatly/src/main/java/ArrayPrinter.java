
public class ArrayPrinter {

    public static void main(String[] args) {
        // You can test your method here
        int[] array = {5, 1, 3, 4, 2};
        printNeatly(array);
    }

    public static void printNeatly(int[] array) {
        for (int num=0; num < array.length; num++){
            System.out.print(array[num]);
            if (num < array.length-1){
                System.out.print(", ");
            }
        }
        System.out.println("");
    }
}
