import java.util.Scanner;

public class L7E2 {
    public static void calculateSum(int x, int y) {
        System.out.println("The answer is " + String.valueOf(x) + " + " + String.valueOf(y) + " = " + (x+y));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("What is the first number? ");
        int num1 = input.nextInt();
        System.out.print("What is the second number? ");
        int num2 = input.nextInt();
        calculateSum(num1, num2);
    }
}
