import java.util.Scanner;

public class L4E3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the total purchase amount: ");
        double totalCost = scanner.nextDouble();
        double shipCost = 0.0;
        if (totalCost < 50.0){
            shipCost = 10.0;
        }
        double finalTotal = totalCost + shipCost;
        System.out.format("Shipping cost is = £%.2f %n",shipCost);
        System.out.format("Your final total is = £%.2f %n", finalTotal);
    }
}
