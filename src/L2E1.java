import java.util.*;

public class L2E1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("What is your name? ");
        String firstName = input.nextLine();
        System.out.print("What is your favourite hobby? ");
        String hobby = input.nextLine();
        System.out.print("Hello " + firstName + "." + " Your favourite hobby is " + hobby + "." + " That sounds very interesting and fun!");
    }

}