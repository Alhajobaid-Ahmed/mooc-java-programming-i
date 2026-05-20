
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String longN = "";
        int sum = 0;
        int count = 0;
        while (true) {
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }
            String[] pieces = input.split(",");
            String name = pieces[0];
            int year = Integer.valueOf(pieces[1]);
            if (longN.length() < name.length()) {
                longN = name;
            }
            sum += year;
            count++;
        }
        double av = sum * 1.0 / count;
        System.out.println("Longest name: " + longN);
        System.out.println("Average of the birth years: " + av);
    }
}
