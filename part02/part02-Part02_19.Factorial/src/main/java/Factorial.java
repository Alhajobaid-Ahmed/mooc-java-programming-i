
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a number: ");
        int num = Integer.valueOf(scanner.nextLine());

        int fc = 1;

        for (int st = 1; st <= num; st++) {
            fc = st * fc;

        }

        System.out.println("Factorial: " + fc);
    }
}
