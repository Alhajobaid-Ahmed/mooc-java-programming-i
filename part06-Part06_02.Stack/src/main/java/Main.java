
public class Main {

    public static void main(String[] args) {

        Stack s = new Stack();
        System.out.println(s.isEmpty()); // Should print true
        System.out.println(" ");
        s.add("First");
        s.add("Second");
        System.out.println(s.isEmpty()); // Should print false
        System.out.println("   ");
        System.out.println(s.values());  // Should print [First, Second]
    }
}
