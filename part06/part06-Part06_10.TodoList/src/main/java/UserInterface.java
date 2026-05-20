
import java.util.Scanner;

public class UserInterface {

    private TodoList tasks;
    private Scanner scanner;

    public UserInterface(TodoList task, Scanner scanner) {
        this.tasks = task;
        this.scanner = scanner;
    }

    public void start() {
        while (true) {
            System.out.print("Command: ");
            String command = scanner.nextLine();

            if (command.equals("stop")) {
                break;
            }
            if (command.equals("add")) {
                System.out.print("To add: ");
                String toadd = scanner.nextLine();
                this.tasks.add(toadd);
            }
            if (command.equals("list")) {
                this.tasks.print();
                continue;

            }
            if (command.equals("remove")) {
                System.out.print("Which one is removed? ");
                int toremove = Integer.valueOf(scanner.nextLine());
                this.tasks.remove(toremove);
                continue;
            }

        }
    }
}
