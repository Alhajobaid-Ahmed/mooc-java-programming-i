
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> points = new ArrayList<>();

        System.out.println("Enter point totals, -1 stops:");

        while (true) {
            int input = Integer.valueOf(scanner.nextLine());

            if (input == -1) {
                break;
            }

            if (input >= 0 && input <= 100) {
                points.add(input);
            }
        }

        int totalSum = 0;
        int passingSum = 0;
        int passingCount = 0;

        int grade0 = 0;
        int grade1 = 0;
        int grade2 = 0;
        int grade3 = 0;
        int grade4 = 0;
        int grade5 = 0;

        for (int point : points) {
            totalSum += point;

            if (point >= 50) {
                passingSum += point;
                passingCount++;
            }

            if (point < 50) {
                grade0++;
            } else if (point < 60) {
                grade1++;
            } else if (point < 70) {
                grade2++;
            } else if (point < 80) {
                grade3++;
            } else if (point < 90) {
                grade4++;
            } else {
                grade5++;
            }
        }

        double averageAll = (double) totalSum / points.size();
        System.out.println("Point average (all): " + averageAll);

        if (passingCount == 0) {
            System.out.println("Point average (passing): -");
        } else {
            double averagePassing = (double) passingSum / passingCount;
            System.out.println("Point average (passing): " + averagePassing);
        }

        double passPercentage = 100.0 * passingCount / points.size();
        System.out.println("Pass percentage: " + passPercentage);

        System.out.println("Grade distribution:");

        System.out.print("5: ");
        for (int i = 0; i < grade5; i++) {
            System.out.print("*");
        }
        System.out.println("");

        System.out.print("4: ");
        for (int i = 0; i < grade4; i++) {
            System.out.print("*");
        }
        System.out.println("");

        System.out.print("3: ");
        for (int i = 0; i < grade3; i++) {
            System.out.print("*");
        }
        System.out.println("");

        System.out.print("2: ");
        for (int i = 0; i < grade2; i++) {
            System.out.print("*");
        }
        System.out.println("");

        System.out.print("1: ");
        for (int i = 0; i < grade1; i++) {
            System.out.print("*");
        }
        System.out.println("");

        System.out.print("0: ");
        for (int i = 0; i < grade0; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }
}
