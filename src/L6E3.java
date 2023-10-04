import java.util.Scanner;

public class L6E3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int score = 0;
        int lives = 3;
        int question = 0;
        do {
            question ++;
            System.out.print("What is 10 + 5? ");
            double ans1 = scanner.nextDouble();
            if (ans1 == 15) {
                System.out.println("Correct!");
                score++;
            }
            if (ans1 != 15) {
                lives--;
            }

        } while (lives>0 && question <= 9);

        System.out.println("Your score is: "+score);
        System.out.println("Your lives: "+lives);
    }
}