import java.util.Scanner;

public class L5E1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Input a base number: ");
        int base = scanner.nextInt();

        for (int count=1; count<=10; count++)
        {
            int answer = (base * count);
            System.out.println(base + " x " + count + " = " + answer);
        }






    }
}
