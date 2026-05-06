
public class Timer {

    private ClockHand seconds;
    private ClockHand hOfs;

    public Timer() {
        this.seconds = new ClockHand(60);
        this.hOfs = new ClockHand(100);
    }

    public void advance() {
        this.hOfs.advance();

        if (this.hOfs.value() == 0) {
            this.seconds.advance();
        }
    }

    public String toString() {
        return this.seconds + ":" + this.hOfs;
    }
}
