
import java.util.Scanner;

public class CountingToHundred {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.valueOf(scanner.nextLine());

        int st = num;
        int end = 100;

        for (int c = st; c <= end; c++) {
            System.out.println(c);
        }

    }
}
