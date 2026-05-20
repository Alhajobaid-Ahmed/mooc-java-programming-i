
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
        if (this.elements.isEmpty()) {
            return "The collection " + this.name + " is empty.";
        }

        String header = "The collection " + this.name + " has " + this.elements.size() + " ";

        if (this.elements.size() == 1) {
            header += "element:\n";
        } else {
            header += "elements:\n";
        }

        String elementsString = String.join("\n", this.elements);

        return header + elementsString;
    }

}
