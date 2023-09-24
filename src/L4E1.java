import java.util.Scanner;

public class L4E1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your first name: ");
        String firstName = input.nextLine();

        System.out.print("Enter your surname: ");
        String surname = input.nextLine();

        System.out.print("Enter the total value of your order: ");
        double total = input.nextDouble();

        System.out.print("Enter the amount you wish to pay as a deposit: ");
        double deposit = input.nextDouble();

        double remainder = total - deposit;

        System.out.println(" == RECEIPT == ");
        System.out.println("Customer: " + firstName.substring(0,1) + " " + surname );
        System.out.println("Order total: " + total);
        System.out.println("Deposit paid " + deposit);
        System.out.println("Balance still to pay: " + remainder);
        if (deposit > 100){
            System.out.println("You get a free toaster!");
        }
        System.out.println("Have a nice day!");
    }
}
