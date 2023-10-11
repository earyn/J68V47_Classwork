import java.util.Scanner;

public class L7E1 {
    public static void showMenu() {
        System.out.println("1. Say hello");
        System.out.println("2. Tell me the time");
        System.out.println("3. Tell me a joke");
        System.out.println("4. Quit");
    }
    public static int getOption() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which option would you like (1-4)");
        return scanner.nextInt();
    }
    public static void printMessage() {
        System.out.println("Hello World");
    }
    public static void printTime() {
        System.out.println("14:22");
    }
    public static void printJoke() {
        System.out.println("Why do scuba divers fall backwards out of the boat? Because if they fell forward they'd still be in the boat.");
    }
    public static void printBye(){
        System.out.println("Bye!");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option = 0;
        do {
            showMenu();
            option = getOption();
            if (option == 1) {
                printMessage();
            } else if (option == 2) {
                printTime();
            } else if (option == 3) {
                printJoke();
            } else if (option == 4) {
                printBye();
            } else {
                System.out.println("This is not a valid option. Try a number between 1 and 4.");
            }
        } while (option != 4) ;
    }
}