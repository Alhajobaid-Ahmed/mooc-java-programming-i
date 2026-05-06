
public class MainProgram {

    public static void main(String[] args) {
        PaymentCard paulCard = new PaymentCard(20);
        PaymentCard mattCard = new PaymentCard(30);

        paulCard.eatHeartily();
        System.out.println("Paul: " + paulCard);
        mattCard.eatAffordably();
        System.out.println("Matt: " + mattCard);
        paulCard.addMoney(20);
        System.out.println("paul: " + paulCard);
        mattCard.eatHeartily();
        System.out.println("Matt: " + mattCard);
        paulCard.eatAffordably();
        paulCard.eatAffordably();
        System.out.println("Paul: " + paulCard);
        mattCard.addMoney(50);
        System.out.println("Matt: " + mattCard);

    }
}
