
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {

        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("First name: ");
            String fN = scanner.nextLine();
            if (fN.isEmpty()) {
                break;
            }
            System.out.println("Last name: ");
            String lN = scanner.nextLine();
            if (lN.isEmpty()) {
                break;
            }
            System.out.println("Identification number: ");
            String iD = scanner.nextLine();
            if (iD.isEmpty()) {
                break;
            }
            infoCollection.add(new PersonalInformation(fN, lN, iD));

        }
        System.out.println("");

        for (PersonalInformation person : infoCollection) {
            System.out.println(person.getFirstName() + " " + person.getLastName());
        }
    }
}
