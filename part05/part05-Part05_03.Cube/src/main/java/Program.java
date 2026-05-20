
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            Cube cube = new Cube(input);
            System.out.println(cube.volume());
            System.out.println(cube);

            System.out.println();

        }
    }
}
