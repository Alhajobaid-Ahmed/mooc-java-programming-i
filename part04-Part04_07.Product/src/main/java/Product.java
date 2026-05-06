
public class Product {

    private String name;
    private double price;
    private int quantity;

    public Product(String initiaName, double initiaPrice, int initiaQuantity) {
        this.name = initiaName;
        this.price = initiaPrice;
        this.quantity = initiaQuantity;
    }

    public void printProduct() {
        System.out.println(this.name + ", price " + this.price + ", " + this.quantity + " pcs ");
    }
}
