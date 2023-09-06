import java.util.*;

public class L2E2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("What is the first number? ");
        int num1 = input.nextInt();
        System.out.print("What is the second number? ");
        int num2 = input.nextInt();

        float divResult = (float) num1 / (float) num2;

        System.out.println("Addition = " + (num1 + num2));
        System.out.println("Subtraction = " + (num1 - num2));
        System.out.println("Multiplication = " + (num1 * num2));
        System.out.println("Division = " + (divResult));
        System.out.println("Modulo = " + (num1 % num2));
        System.out.println("Power = " + (int) Math.pow(num1, num2));

    }
}
