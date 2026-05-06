
public class AdvancedAstrology {

    public static void printStars(int number) {
        int st = 0;
        while (st < number) {
            System.out.print("*");
            st++;
        }
        System.out.println("");
    }

    public static void printSpaces(int number) {
        int sp = 0;
        while (sp < number) {
            System.out.print(" ");
            sp++;
        }
    }

    public static void printTriangle(int size) {
        int row = 1;
        while (row <= size) {
            printSpaces(size - row);
            printStars(row);
            row++;
        }
    }

    public static void christmasTree(int height) {
        int r =1;
        while (r <= height) {
            printSpaces(height - r);
            printStars(2 * r - 1);
            r++;
        }
        int t = 0;
        while (t < 2) {
            printSpaces(height - 2);
            printStars(3);
            t++;
        }
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(4);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
