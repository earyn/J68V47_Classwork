import java.util.Scanner;
public class L7E3 {
    public static int askQuestion(int number1, int number2) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is " + number1 + " + " + number2 + "?");
        int userAnswer = scanner.nextInt();
        return userAnswer;
    }
    public static int correctAnswer(int score) {
        System.out.println("Correct!");
        score++;
        return score;
    }
    public static int wrongAnswer(int answer, int lives) {
        System.out.println("Wrong! The answer is " + answer);
        lives--;
        System.out.println("You have " + lives + " lives left.");
        return lives;
    }
    public static void gameOver(int score, int lives) {
        System.out.println("Game over. Your score is " + score);
        if (lives > 0) {
            System.out.print("Well done!");
        } else ;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;
        int lives = 3;
        int userAnswer = 0;
        int answer = 0;
        int count = 1;
        do {
            userAnswer = askQuestion(count, count*count);
            answer = count + (count*count);
            if (answer == userAnswer) {
                score = correctAnswer(score);
            } else {
                lives = wrongAnswer(answer, lives);
            }
            count+=1;
        } while (count <=10 && lives >0);
        gameOver(score, lives);
    }
}
