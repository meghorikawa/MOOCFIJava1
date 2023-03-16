
public class Main {

    public static void main(String[] args) {
        
        SimpleDate today = new SimpleDate(16, 03, 2023);
        System.out.println(today);
        today.advance();
        System.out.println(today);
        today.advance(3);
        System.out.println(today);

        SimpleDate christmas = new SimpleDate(25, 12, 2023);
        System.out.println(christmas.afterNumberOfDays(10));
        


    }
}
