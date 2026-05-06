
public class StarSign {

    public static void main(String[] args) {

        //The tests are not checking the main, so you can modify it freely.
        //NB: If the tests don't seem to pass, you should try the methods here
        //in the main to make sure they print the correct shapes!
        printStars(5);
        System.out.println("\n---");
        printStars(3);
        System.out.println("\n---");
        printStars(9);
        System.out.println("\n---");
        // printing --- between the shapes
        printSquare(4);
        System.out.println("\n---");
        printRectangle(17, 3);
        System.out.println("\n---");
        printTriangle(4);
        System.out.println("\n---");
    }

    public static void printStars(int number) {
        int st = 0;
        while (st < number) {
            System.out.print("*");
            st++;
        }
        System.out.println("");
    }

    public static void printSquare(int size) {
        int sq = 0;
        while (sq < size) {
            printStars(size);
            sq++;
        }
    }

    public static void printRectangle(int width, int height) {
        int ra = 0;
        while (ra < height) {
            printStars(width);
            ra++;
        }
    }

    public static void printTriangle(int size) {
        int ta = 0;
        while (ta < size) {
            printStars(ta + 1);
            ta++;
        }
    }
}
