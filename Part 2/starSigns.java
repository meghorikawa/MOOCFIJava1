public class starSigns {
    
    //Testing the methods
    public static void main(String[] args) {
        //printStars(5);
        //printStars(3);
        //printStars(9);
        printSquare(5);
        printRectangle(17, 3);
        printTriangle(4);
        printRightTriangle(5);
        printChristmasTree(5);
    
}
    /**
     * print stars method that prints the number of stars input
     * @param number of stars to print
     */
    public static void printStars(int number) {
        for (int i = 1; i <= number; i++){
            System.out.print("*");
        }
        System.out.println("");

    }

    /**
     * method which uses printStars method to create a square
     * @param size of the square
     */
    public static void printSquare(int size){
        for (int i = 1; i <= size; i++){
            printStars(size);
        }
        System.out.println("");
    }
     
    
    /**
     * method which uses printStars method to create a rectangle
     * @param width of the rectangle to print
     * @param height of the rectangle to print
     */
    public static void printRectangle (int width, int height){
        for (int i = 1; i <= height; i++){
            printStars(width);
        }
        System.out.println(""); 
    }
    //Define method which uses printStars method to create a Triangle
    public static void printTriangle(int size){
        for (int i = 1; i <= size; i++){
            printStars(i);
        }
        System.out.println("");
    }
    //create a method that prints spaces without a linebreak
    public static void printSpaces(int number){
        for (int i = 1; i <= number; i++){
            System.out.print(" ");
        }
        
    }
    // using printSpaces method and printStars method print an inverted Triangle
    public static void printRightTriangle(int size){
        for (int i = 1; i <= size; i++){
            printSpaces(size - i);
            printStars(i);
        } 

    }

    public static void printChristmasTree(int size){
        int whitespace = size;
        for (int i=1; i <= size; i++){
        whitespace = whitespace - 1;
        printSpaces(whitespace);
        printStars(i*2-1);
        }
        printSpaces(size - 2);
        printStars(3);
        printSpaces(size - 2);
        printStars(3);
    }


}
