
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    public String toString() {
        String output = "The collection " + this.name;

        if (elements.isEmpty()) {
            return output + " is empty.";
        }

        // create a String for the values to print out
        String printValues = "";

        for (String i : elements) {
            if (elements.size() == 1) {
                printValues = i;
            } else {
                printValues = printValues + i + "\n";
            }

        }

        if (this.elements.size() == 1) {
            return output + " has " + elements.size() + " element:\n" + printValues;
        } else {
            return output + " has " + elements.size() + " elements:\n" + printValues;
        }
    }

}
