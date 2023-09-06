import java.util.*;

public class L2E3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is the first item? ");
        String firstItem = input.nextLine();
        System.out.println("How much did the " + firstItem + " cost? ");
        int item1 = input.nextInt();
        input.nextLine();

        System.out.println("What is the second item? ");
        String secondItem = input.nextLine();
        System.out.println("How much did the " + secondItem + " cost? ");
        int item2 = input.nextInt();
        input.nextLine();

        System.out.println("What is the third item? ");
        String thirdItem = input.nextLine();
        System.out.println("How much did the " + thirdItem + " cost? ");
        int item3 = input.nextInt();
        input.nextLine();

        System.out.format(firstItem + item1);
        System.out.println(secondItem + item2);
        System.out.println(thirdItem + item3);
    }
}
