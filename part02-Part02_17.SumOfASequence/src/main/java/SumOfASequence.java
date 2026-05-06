
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Last number? ");
        int num = Integer.valueOf(scanner.nextLine());

        int sum = 0;

        for (int s = 1; s <= num; s++) {
            sum = s + sum;
        }

        System.out.println(sum);
    }
}
