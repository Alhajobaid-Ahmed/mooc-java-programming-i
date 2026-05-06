
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }

    public boolean largerThan(Apartment compared) {
        if (this.squares > compared.squares) {
            return true;
        }
        return false;
    }

    public int priceDifference(Apartment compared) {

        int p = this.princePerSquare * this.squares;
        int cP = compared.princePerSquare * compared.squares;
        return Math.abs(p - cP);
    }

    public boolean moreExpensiveThan(Apartment compared) {
        int p = this.princePerSquare * this.squares;
        int cp = compared.princePerSquare * compared.squares;
        if (p > cp) {
            return true;
        }
        return false;
    }
}
