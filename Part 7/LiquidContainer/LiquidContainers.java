
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //first container
        int firstVol =0;
        int secondVol = 0;
        int max = 100;
    


        while (true) {
            System.out.println("First: " + firstVol + "/" + max);
            System.out.println("Second: " + secondVol + "/"+ max);


            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String [] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);



            if (command.equals("add") && amount >= 0){
                if (firstVol <= max){
                    firstVol += amount;
                    if (firstVol > max){
                        firstVol = max;
                    }
                }

            }

            if (command.equals("move") && amount >= 0){
                if ((firstVol - amount)>= 0){
                    secondVol += amount;
                    firstVol -= amount;
                    if (secondVol >= max){
                        secondVol = max;
                    }
                }
                
                else if ((firstVol - amount) <0 ){ 
                    secondVol += firstVol;
                    firstVol = 0;
                    if(secondVol >= max){
                        secondVol = max;
                    }
                }
            }


            if (command.equals("remove") && amount >= 0){
                secondVol = secondVol - amount;
                if (secondVol <=0 ){
                    secondVol = 0;
                }

            }



        }
       
    }

}
