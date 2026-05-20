
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int f = Integer.valueOf(scanner.nextLine());
        int s = Integer.valueOf(scanner.nextLine());
        
        int sum = (f + s);
        
        int sqr = (int) Math.sqrt(sum);
        
        System.out.println(sqr);
    }
}
