
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);

        Cube oSheaJackson = new Cube(7);
        System.out.println(oSheaJackson.volume());
        System.out.println(oSheaJackson);

        System.out.println();

        Cube salt = new Cube(3);
        System.out.println(salt.volume());
        System.out.println(salt);
    }
}
