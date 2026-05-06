
public class Fitbyte {

    private int ages;
    private int rHR;

    public Fitbyte(int age, int rHr) {
        this.ages = age;
        this.rHR = rHr;
    }

    public double targetHeartRate(double pAgem) {
        double mHR = 206.3 - (0.711 * this.ages);
        return (mHR - this.rHR) * pAgem + this.rHR;
    }
}
