
public class YourFirstAccount {

    public static void main(String[] args) {
        Account ahmedAccount = new Account("Ahmed account", 100.0);

        ahmedAccount.deposit(20.0);
        System.out.println(ahmedAccount);
    }
}
