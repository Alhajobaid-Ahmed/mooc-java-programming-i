public class DivisibleByThree {

    public static void main(String[] args) {
        divisibleByThreeInRange(2, 10);
    }
    public static void divisibleByThreeInRange(int beginning, int end) {

        for (int n = beginning; n <= end; n++) {
            if (n % 3 == 0) {
                System.out.println(n);
            }
        }
    }
}
