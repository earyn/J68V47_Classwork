import java.util.Scanner;

public class project {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int option = 0;
        do {
            System.out.println("Hello! What would you like to do today?");
            System.out.println("1. Add an entry to the library.");
            System.out.println("2. Remove an entry from the library.");
            System.out.println("3. Search for something in the library");
            System.out.println("4. Quit");
            System.out.println("Please enter a number...");

            option = scanner.nextInt();
            if (option == 1) {
                System.out.println("EARYN COME BACK AND DO THIS");
            } else if (option == 2) {
                System.out.println("Earyn please fill this in!!!");
            } else if (option == 3) {
                System.out.println("SEARCH FUNCTION");
            }else if (option == 4) {
                System.out.println("Bye!");
            } else {
                System.out.println("This isn't a valid option. Try another number.");
            }
        } while (option != 4);
    }
}