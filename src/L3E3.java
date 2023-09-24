import java.util.Scanner;

public class L3E3 {

    public static void main(String[] args) {
        double M;
        Scanner input = new Scanner(System.in);
        System.out.print("What is the loan amount? ");
        double L = input.nextDouble();

        System.out.print("What is the interest rate (APR %) ");
        double j = input.nextDouble();

        System.out.print("Number of years: ");
        double n = input.nextDouble();
        input.nextLine();

        M = L * (((j/100)/12) / (1 - Math.pow(1 + ((j/100)/12), -(n*12))));

        System.out.format("\nMonthly payment for this loan = £%.2f", M);





    }
}
