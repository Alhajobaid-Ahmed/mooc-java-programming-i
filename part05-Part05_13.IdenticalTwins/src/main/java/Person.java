
import java.util.Objects;

public class Person {

    private String name;
    private SimpleDate birthday;
    private int height;
    private int weight;

    public Person(String name, SimpleDate birthday, int height, int weight) {
        this.name = name;
        this.birthday = birthday;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public boolean equals(Object compared) {
        if (this == compared) {
            return true;
        }
        if (!(compared instanceof Person)) {
            return false;
        }
        Person otherD = (Person) compared;

        if (this.name.equals(otherD.name)
                && this.birthday.equals(otherD.birthday)
                && this.height == otherD.height
                && this.weight == otherD.weight) {
            return true;
        }
        return false;
    }
}
