
public class Main {

    public static void main(String[] args) {

        MessagingService m = new MessagingService();

        Message a = new Message("Bob", "Hey waht's up?");
        Message b = new Message("AAA", "lets go to the movies");

        m.add(a);
        m.add(b);
        System.out.println(m.getMessages());

        MessagingService ms = new MessagingService();
        System.out.println(ms.getMessages());
    }
}
