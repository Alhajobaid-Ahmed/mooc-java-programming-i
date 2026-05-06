
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Statistics statistics = new Statistics();
        Statistics evSta = new Statistics();
        Statistics odSta = new Statistics();
        System.out.println("Enter numbers: ");
        while (true) {
            int input = Integer.valueOf(scan.nextLine());
            if (input == -1) {

                break;
            }
            statistics.addNumber(input);
            if (input % 2 == 0) {
                evSta.addNumber(input);
            } else {
                odSta.addNumber(input);
            }
        }

        System.out.println("Sum: " + statistics.sum());
        System.out.println("Sum of even numbers: " + evSta.sum());
        System.out.println("Sum of odd numbers: " + odSta.sum());
    }
}
