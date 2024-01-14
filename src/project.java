import java.util.Scanner;
import java.io.*;

public class project {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
      //  Integer savedPage = [value from txt file];

        int option = 0;
        do {

            System.out.println("Hello! What would you like to do today?");
            System.out.println("1. Add an entry to the library.");
            System.out.println("2. See Previous Journal Entries.");
            System.out.println("3. See My Statistics!");
            System.out.println("4. Quit");
            System.out.println("Please enter a number...");

            option = scanner.nextInt();

            if (option == 1) {
                Scanner scanner2 = new Scanner(System.in);
                System.out.println("Let's add an entry!");
                System.out.println(" ");
                System.out.print("Please enter the Title: ");
                String title = scanner2.nextLine();
                System.out.print("Who is the Author: ");
                String author = scanner2.nextLine();
                System.out.print("What is the Genre: ");
                String genre = scanner2.nextLine();
                System.out.print("What is the Medium (eg. Prose, Poetry, etc.): ");
                String medium = scanner2.nextLine();
                System.out.print("How many pages?: ");
                String noPage = scanner2.nextLine();
               // String totalPage = savedPage + noPage;
                System.out.print("Rating (1-10): ");
                String rating = scanner2.nextLine();
                System.out.print("Date Finished (Day - entered in 00 format, for example if it's the 14th, enter 14): ");
                String dateDay = scanner2.nextLine();
                System.out.print("Date Finished (Month - entered in 00 format, for example if it is July, enter 07): ");
                String dateMonth = scanner2.nextLine();
                System.out.print("Date Finished (Year - entered in 0000 format, for example if it is the year 2024, enter 2024): ");
                String dateYear = scanner2.nextLine();
                System.out.print("Additional Comments: ");
                String comment = scanner2.nextLine();

                // write totalPage to value which becomes saved Page ?

                try {
                    FileWriter out = new FileWriter("journal.txt");
                    out.write("Title: " + title + " Author: " + author + " Genre: " + genre + " Medium: " + medium + " No. of Pages: " + noPage + " Rating: " + rating + " Date: " + dateDay + "/" + dateMonth + "/" + dateYear + " Comment: " + comment);
                    out.close();
                } catch (IOException e) {
                    System.out.println("Error occurred writing to file: " + e.toString());
                }


            } else if (option == 2) {
                System.out.println("Here are your previous journal entries!");
                BufferedReader in = new BufferedReader( new FileReader("journal.txt"));

                try {

                    do {
                        String line = in.readLine();
                    } while (in.readLine() != null);
                    in.close();
                } catch (Exception e) {
                    System.err.println("Error: Target File Cannot Be Read");
                }

            } else if (option == 3) {
                System.out.println("Here are your statistics!");


            } else if (option == 4) {
                System.out.println("Bye!");
            } else {
                System.out.println("This isn't a valid option. Try another number.");
            }
        }while (option != 4);
    }
}