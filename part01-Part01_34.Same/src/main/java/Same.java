
import java.util.Scanner;

public class Same {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here. 
        System.out.println("Enter the first string:");
        String inp1 = scan.nextLine();

        System.out.println("Enter the second string:");
        String inp2 = scan.nextLine();

        if (inp1.equals(inp2)) {
            System.out.println("Same");

        } else {
            System.out.println("Different");
        }
    }
}
