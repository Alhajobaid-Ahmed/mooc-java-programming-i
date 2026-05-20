
public class HealthStation {

    private int wC;

    public HealthStation() {
        this.wC = 0;
    }

    public int weigh(Person person) {
        this.wC++;
        return person.getWeight();
    }

    public void feed(Person person) {
        int cWeight = person.getWeight();
        person.setWeight(cWeight + 1);
    }

    public int weighings() {
        return this.wC;
    }
}
