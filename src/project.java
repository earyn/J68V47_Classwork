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
                System.out.println("Let's add an entry!");
                System.out.println(" ");
                System.out.println("Please enter the Title: ");
                String title = scanner.nextLine();
                System.out.println("Who is the Author: ");
                String author = scanner.nextLine();
                System.out.println("What is the Genre: ");
                String genre = scanner.nextLine();
                System.out.println("What is the Medium (eg. Prose, Poetry, etc.): ");
                String medium = scanner.nextLine();
                System.out.println("How many pages?: ");
                Integer noPage = scanner.nextInt();
                System.out.println("Rating (1-10): ");
                String rating = scanner.nextLine();
                System.out.println("Date Finished (Day - entered in 00 format, for example if it's the 14th, enter 14): ");
                String dateDay = scanner.nextLine();
                System.out.println("Date Finished (Month - entered in 00 format, for example if it is July, enter 07): ");
                String dateMonth = scanner.nextLine();
                System.out.println("Date Finished (Year - entered in 0000 format, for example if it is the year 2024, enter 2024): ");
                String dateYear = scanner.nextLine();
                System.out.print("Additional Comments: ");
                String comment = scanner.nextLine();


            } else if (option == 2) {
                System.out.println("Earyn please fill this in!!!");
            } else if (option == 3) {
                System.out.println("SEARCH FUNCTION");
            } else if (option == 4) {
                System.out.println("Bye!");
            } else {
                System.out.println("This isn't a valid option. Try another number.");
            }
        }while (option != 4);
    }
}