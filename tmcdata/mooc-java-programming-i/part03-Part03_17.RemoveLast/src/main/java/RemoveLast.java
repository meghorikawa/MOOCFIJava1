
import java.util.ArrayList;

public class RemoveLast {

    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();

        strings.add("First");
        strings.add("Second");
        strings.add("Third");

        System.out.println(strings);

        removeLast(strings);
        removeLast(strings);
        System.out.println(strings);
    }

    public static void removeLast (ArrayList<String> strings){
        int index = strings.size()-1;
        if (strings.size() > 0){
            strings.remove(index);
        }
    }
}
