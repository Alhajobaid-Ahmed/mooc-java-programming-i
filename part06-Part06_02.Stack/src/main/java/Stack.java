import java.util.ArrayList;
public class Stack {
    private ArrayList<String> items;
    
    public Stack() {
        this.items = new ArrayList<>();
    }
    
    public boolean isEmpty() {
        return this.items.isEmpty();
    }
    public void add(String valu) {
        this.items.add(valu);
    }
    public ArrayList<String> values(){
        return this.items;
    }
    public String take() {
        int lI = this.items.size()  - 1;
        
        String m = this.items.get(lI);
        this.items.remove(lI);
        return m;
    }
}
