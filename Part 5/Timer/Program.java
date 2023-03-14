
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Timer x = new Timer();

        while (true){
            System.out.println(x);
            x.advance();

            try {
                Thread.sleep(10);
            }
            catch(Exception e){

            }

        }


    }
}
