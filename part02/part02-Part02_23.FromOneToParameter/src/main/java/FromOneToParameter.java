
public class FromOneToParameter {

    public static void main(String[] args) {
        printUntilNumber(2);

    }

    public static void printUntilNumber(int num) {
        int n = 1;
        while (n <= num) {
            System.out.println(n);
            n++;
        }

    }
}
