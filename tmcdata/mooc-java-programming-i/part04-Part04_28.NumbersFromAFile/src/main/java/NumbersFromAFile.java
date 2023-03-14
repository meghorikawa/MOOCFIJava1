
import java.nio.file.Paths;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        int counter = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());

        try (Scanner fileReader = new Scanner(Paths.get(file))){
            while (fileReader.hasNext()){
                int num = fileReader.nextInt();
                if (num <= upperBound && num >= lowerBound){
                    counter ++; 
                }
            }
            
        } catch (Exception e) {
            System.out.println("Error");
        }
        System.out.println("Numbers: "+ counter);

    }

}
