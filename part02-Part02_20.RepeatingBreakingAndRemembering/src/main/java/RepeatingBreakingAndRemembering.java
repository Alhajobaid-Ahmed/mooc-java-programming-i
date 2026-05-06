
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Give numbers:");
        int ev = 0;
        int od = 0;

        int t = 0;
        int sum = 0;
        while (true) {
            int num = Integer.valueOf(scanner.nextLine());

            if (num == -1) {
                break;
            } else if (num % 2 == 0) {
                ev++;
            } else {
                od++;
            }

            sum += num;
            t += 1;

        }
        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + t);
        double av = (double) sum / t;
        System.out.println("Average: " + av);
        System.out.println("Even: " + ev);
        System.out.println("Odd: " + od);

    }
}
