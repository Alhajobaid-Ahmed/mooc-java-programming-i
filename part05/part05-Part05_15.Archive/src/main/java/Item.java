
public class Item {

    private String identifier;
    private String name;

    public Item(String ident, String nam) {
        this.identifier = ident;
        this.name = nam;
    }

    public boolean equals(Object compared) {
        if (this == compared) {
            return true;
        }
        if (!(compared instanceof Item)) {
            return false;
        }
        Item oItem = (Item) compared;
        return this.identifier.equals(oItem.identifier);
    }

    @Override
    public String toString() {
        return this.identifier + ": " + this.name;
    }
}
