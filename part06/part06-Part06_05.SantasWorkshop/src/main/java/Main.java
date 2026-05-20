
public class Main {

    public static void main(String[] args) {
        Gift book = new Gift("Harry Potter", 2);
        Gift teddy = new Gift("Teddy Bear", 1);

        Package box = new Package();
        box.addGift(book);
        box.addGift(teddy);

        System.out.println("Total weight: " + box.totalWeight() + " kg");
    }
}
