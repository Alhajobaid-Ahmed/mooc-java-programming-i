
import java.util.ArrayList;

public class Hold {

    private ArrayList<Suitcase> suitCases;
    private final int maxW;

    public Hold(int maxW) {
        this.suitCases = new ArrayList<>();
        this.maxW = maxW;
    }

    public int totalWeight() {
        int t = 0;
        for (Suitcase suitcase : this.suitCases) {
            t += suitcase.totalWeight();
        }
        return t;
    }

    public void addSuitcase(Suitcase suitcase) {
        if (this.totalWeight() + suitcase.totalWeight() <= this.maxW) {
            this.suitCases.add(suitcase);
        }
    }

    @Override
    public String toString() {
        if (this.suitCases.isEmpty()) {
            return "no suitcases (0 kg)";
        }
        if (this.suitCases.size() == 1) {
            return "1 suitcase (" + this.totalWeight() + " kg)";
        }

        return this.suitCases.size() + " suitcases (" + this.totalWeight() + " kg)";
    }

    public void printItems() {
        System.out.println("The suitcases in the hold contain the following items:");
        for (Suitcase suitcase : this.suitCases) {
            suitcase.printItems();
        }
    }
}
