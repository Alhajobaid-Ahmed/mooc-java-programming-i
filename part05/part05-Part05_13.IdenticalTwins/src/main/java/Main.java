
public class Main {

    public static void main(String[] args) {
        // you can write code here to try out your program
        SimpleDate date = new SimpleDate(24, 3, 2017);
        SimpleDate date2 = new SimpleDate(23, 7, 2017);

        Person leo = new Person("Leo", date, 62, 9);
        Person lily = new Person("Lily", date2, 65, 8);

        if (leo.equals(lily)) {
            System.out.println("Is this quite correct?");
        }

        Person leoWithDifferentWeight = new Person("Leo", date, 62, 10);

        if (leo.equals(leoWithDifferentWeight)) {
            System.out.println("Is this quite correct?");
        }else {
            System.out.println("forget about it your code is working output is emphty but the code is working trozdem becouase of that insist to learn evrything you wrote this text to remember how i worked hard how hard is learning whaen you dont have time and have too much o to do but insted of rest  i was learn and i am happy");
        }

    }
}
