
import java.util.ArrayList;

public class Room {

    private ArrayList<Person> persons;

    public Room() {
        this.persons = new ArrayList<>();
    }

    public void add(Person peson) {
        this.persons.add(peson);
    }

    public boolean isEmpty() {
        return this.persons.isEmpty();
    }

    public ArrayList<Person> getPersons() {
        return this.persons;
    }

    public Person shortest() {
        if (this.persons.isEmpty()) {
            return null;

        }
        Person shP = this.persons.get(0);
        for (Person person : this.persons) {
            if (person.getHeight() < shP.getHeight()) {
                shP = person;

            }
        }
        return shP;
    }

    public Person take() {
        if (this.persons.isEmpty()) {
            return null;
        }
        Person shp = this.shortest();
        this.persons.remove(shp);
        return shp;
    }

}
