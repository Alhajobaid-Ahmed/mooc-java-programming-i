
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sl = "You have successfully logged in!";
        String il = "Incorrect username or password!";
        System.out.println("Enter username: ");
        String user = scanner.nextLine();
        System.out.println("Enter password: ");
        String pass = scanner.nextLine();

        if (user.equals("alex")) {
            if (pass.equals("sunshine")) {
                System.out.println(sl);
            } else {
                System.out.println(il);
            }
        } else if (user.equals("emma")) {
            if (pass.equals("haskell")) {
                System.out.println(sl);
            } else {
                System.out.println(il);
            }
        } else {
            System.out.println(il);
        }
    }
}
