import java.util.*;

public class L2E3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        Scanner scanner3 = new Scanner(System.in);

        System.out.println("What is the first item? ");
        String firstItem = scanner.nextLine();
        System.out.println("How much did the " + firstItem + " cost? ");
        float item1 = scanner.nextFloat();


        System.out.println("What is the second item? ");
        String secondItem = scanner2.nextLine();
        System.out.println("How much did the " + secondItem + " cost? ");
        float item2 = scanner.nextFloat();


        System.out.println("What is the third item? ");
        String thirdItem = scanner3.nextLine();
        System.out.println("How much did the " + thirdItem + " cost? ");
        float item3 = scanner3.nextFloat();


        float subtotal = item1 + item2 + item3;

        System.out.println("RECEIPT");
        System.out.format("%s........£%.2f %n",firstItem, item1);
        System.out.format("%s........£%.2f %n",secondItem, item2);
        System.out.format("%s........£%.2f %n",thirdItem, item3);
        System.out.format("SUBTOTAL..£%.2f %n",subtotal);
    }
}
