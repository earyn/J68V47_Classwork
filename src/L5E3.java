import java.util.Scanner;

public class L5E3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;

        for(int count = 1; count <= 10; count++) {
            System.out.print("What is 10 + 5? ");
            double ans1 = scanner.nextDouble();
            if (ans1 == 15) {
                System.out.println("Correct!");
                score++;
            }
        }
        System.out.println("Your score is: "+score);
    }
}
