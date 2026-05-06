
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int t = 0;

        while (true) {
            System.out.println("Give a number:");
            int num = Integer.valueOf(scanner.nextLine());

            if (num == 0) {
                break;
            } else if (num > 0) {
                sum = num + sum;
                t = t + 1;
            }
        }
        double av = (double) sum / t;
        if (sum <= 0) {
            System.out.println("Cannot calculate the average");
        } else {
            System.out.println(av);
        }
    }
}
