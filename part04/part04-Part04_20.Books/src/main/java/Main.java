
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        ArrayList<Books> books = new ArrayList<>();

        while (true) {
            String title = scan.nextLine();
            if (title.isEmpty()) {
                break;
            }
            System.out.print("Pages: ");
            int pages = Integer.parseInt(scan.nextLine());
            System.out.println("Publication year: ");
            int year = Integer.parseInt(scan.nextLine());
            books.add(new Books(title, pages, year));
        }

        System.out.println();
        System.out.print("What information will be printed? ");
        String ev = scan.nextLine();
        for (Books book : books) {
            if (ev.equals("everything")) {
                System.out.println(book);
            } else if (ev.equals("name")) {
                System.out.println(book.getTitle());
            }
        }
    }
}
