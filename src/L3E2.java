import java.util.Scanner;

public class L3E2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("What is the capital of Spain? ");
        String ansOne = input.nextLine();
        System.out.println(ansOne.toUpperCase().contains("MADRID"));

    }
}
