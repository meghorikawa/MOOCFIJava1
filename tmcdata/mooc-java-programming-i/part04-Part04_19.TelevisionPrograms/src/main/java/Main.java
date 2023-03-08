import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement here your program that uses the TelevisionProgram class

        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("Name: ");
            
            String showName = scanner.nextLine();

            if (showName.isEmpty()){
                break;
            }
            System.out.print("Duration: ");
            int duration = Integer.valueOf(scanner.nextLine());
            programs.add(new TelevisionProgram(showName, duration));
        }

        System.out.println("Program's maximum duration? ");
        int maxduration = scanner.nextInt();
        
        for (TelevisionProgram bangumi : programs){
            if (bangumi.getDuration() <= maxduration){
                System.out.println(bangumi.getName()+", " + bangumi.getDuration());
            }
        }


    }
}
