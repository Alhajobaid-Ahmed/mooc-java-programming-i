
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int old = -1;
        while (true) {
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }
            String[] pieces = input.split(",");
            int age = Integer.valueOf(pieces[1]);

            if (age > old) {
                old = age;
            }
        }
        System.out.println("Age of the oldest: " + old);
    }
}
