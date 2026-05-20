
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public Money plus(Money addition) {
        int totalE = this.euros + addition.euros();
        int tCents = this.cents + addition.cents();

        if (tCents >= 100) {
            totalE++;
            tCents -= 100;
        }

        return new Money(totalE, tCents);
    }

    public boolean lessThan(Money compared) {
        if (this.euros < compared.euros()) {
            return true;
        }

        if (this.euros == compared.euros() && this.cents < compared.cents()) {
            return true;
        }

        return false;
    }

    public Money minus(Money decreaser) {
        int totalE = this.euros - decreaser.euros();
        int tCents = this.cents - decreaser.cents();

        if (tCents < 0) {
            totalE--;
            tCents += 100;
        }

        if (totalE < 0) {
            return new Money(0, 0);
        }

        return new Money(totalE, tCents);
    }

    public String toString() {
        String z = "";
        if (this.cents < 10) {
            z = "0";
        }

        return this.euros + "." + z + this.cents + "e";
    }

}
