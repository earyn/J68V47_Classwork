import java.util.Scanner;
public class L4E2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("What is the capital of Spain? ");
        String ansOne = input.nextLine();
        if (ansOne.toLowerCase().contains("madrid")==false) {
            System.out.println("Sorry, the correct answer is Madrid.");
        }
        System.out.print("What is the largest big cat? ");
        String ansTwo = input.nextLine();
        if (ansTwo.toLowerCase().contains("tiger")==false) {
            System.out.println("Sorry, the correct answer is Tiger.");
        }
        System.out.print("How many bones are there typically in the adult human body? ");
        String ansThree = input.nextLine();
        if (ansThree.toLowerCase().contains("206")==false) {
            System.out.println("Sorry, the correct answer is 206.");
        }
    }
}
