
import java.util.ArrayList;

public class Suitcase {

    private ArrayList<Item> items;
    private final int maxW;

    public Suitcase(int maxW) {
        this.items = new ArrayList<>();
        this.maxW = maxW;
    }

    public int totalW() {
        int total = 0;
        for (Item item : this.items) {
            total += item.getWeight();
        }
        return total;
    }

    public void addItem(Item item) {
        if (this.totalW() + item.getWeight() <= this.maxW) {
            this.items.add(item);
        }
    }

    @Override
    public String toString() {
        if (this.items.isEmpty()) {
            return "no items (0 kg)";
        }
        if (this.items.size() == 1) {
            return "1 item (" + this.totalW() + " kg)";
        }
        return this.items.size() + " items (" + this.totalW() + " kg)";
    }

    public void printItems() {
        for (Item item : this.items) {
            System.out.println(item);
        }
    }

    public int totalWeight() {
        int t = 0;
        for (Item item : this.items) {
            t += item.getWeight();
        }
        return t;
    }

    public Item heaviestItem() {
        if (this.items.isEmpty()) {
            return null;
        }
        Item h = this.items.get(0);
        for (Item item : this.items) {
            if (item.getWeight() > h.getWeight()) {
                h = item;
            }
        }
        return h;
    }
}
