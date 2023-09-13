import java.util.Scanner;

public class L3E2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("What is the capital of Spain? ");
        String ansOne = input.nextLine();
        System.out.println(ansOne.toUpperCase().contains("MADRID"));
        System.out.println("What is the largest big cat? ");
        String ansTwo = input.nextLine();
        System.out.println(ansTwo.toUpperCase().contains("TIGER"));
        System.out.println("How many bones are there typically in the adult human body? ");
        String ansThree= input.nextLine();
        System.out.println(ansThree.toUpperCase().contains("206"));
    }
}
