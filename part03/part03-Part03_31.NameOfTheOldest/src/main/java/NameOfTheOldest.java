
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int oldN = -1;
        String oldS = "";

        while (true) {
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }
            String[] pieces = input.split(",");
            String name = pieces[0];
            int age = Integer.valueOf(pieces[1]);
            if (age > oldN) {
                oldN = age;
                oldS = name;
            }
        }
        System.out.println("Name of the oldest: " + oldS);
    }
}
