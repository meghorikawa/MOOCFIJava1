
public class AdvancedAstrology {

    public static void printStars(int number) {
        for (int i = 1; i <= number; i++){
            System.out.print("*");
        }
        System.out.println("");
    }

    public static void printSpaces(int number) {
        for (int i = 1; i <= number; i++ ){
            System.out.print(" ");
        }
    }

    public static void printTriangle(int size) {
        for (int i= 1; i <= size; i++){
            int space = size - i; 
            printSpaces(space);
            printStars(i);
        }
    }

    public static void christmasTree(int height) {
        int whitespace = height;
        for (int i =1; i<= height; i++){
            whitespace = whitespace -1; 
            printSpaces(whitespace);
            printStars(i*2-1);
        }
        printSpaces(height-2);
        printStars(3);
        printSpaces(height-2);
        printStars(3);

    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
