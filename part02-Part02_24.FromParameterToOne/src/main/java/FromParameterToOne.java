
public class FromParameterToOne {

    public static void main(String[] args) {
        printFromNumberToOne(2);

    }

    public static void printFromNumberToOne(int num) {
        int n = num;
        while (n >= 1) {
            System.out.println(n);
            n--;
        }
    }
}
