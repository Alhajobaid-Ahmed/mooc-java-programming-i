
public class PaymentCard {

    private double balance;

    public PaymentCard(double openingBalance) {
        this.balance = openingBalance;

    }

    public void eatAffordably() {
        if (this.balance >= 2.60) {
            this.balance = this.balance - 2.60;

        } else {
            System.out.println(toString());
        }

    }

    public void eatHeartily() {

        if (this.balance >= 4.60) {
            this.balance = this.balance - 4.60;
        } else {
            
        }
    }

    public void addMoney(double mny) {
        if (mny < 0) {
            return;
        }
        this.balance += mny;
        if (this.balance > 150) {
            this.balance = 150;
            
        }
    }

    @Override
    public String toString() {
        return "The card has a balance of " + this.balance + " euros";
    }

}
