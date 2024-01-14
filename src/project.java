import java.io.*;
import java.util.Scanner;

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
                System.out.print(
                        "Date Finished (Day - entered in 00 format, for example if it's the 14th, enter 14): "
                );
                String dateDay = scanner2.nextLine();
                System.out.print(
                        "Date Finished (Month - entered in text format, for example if it is July, enter July): "
                );
                String dateMonth = scanner2.nextLine();
                System.out.print(
                        "Date Finished (Year - entered in 0000 format, for example if it is the year 2024, enter 2024): "
                );
                String dateYear = scanner2.nextLine();
                System.out.print("Additional Comments: ");
                String comment = scanner2.nextLine();

                // write totalPage to value which becomes saved Page ?

                try (FileWriter fileWriter = new FileWriter("journal.txt", true)) {
                    fileWriter.write(
                            "Title: " +
                                    title +
                                    " ,Author: " +
                                    author +
                                    " ,Genre: " +
                                    genre +
                                    " ,Medium: " +
                                    medium +
                                    " ,No. of Pages: " +
                                    noPage +
                                    " ,Rating: " +
                                    rating +
                                    " ,Date: " +
                                    dateDay +
                                    "-" +
                                    dateMonth +
                                    "-" +
                                    dateYear +
                                    " ,Comment: " +
                                    comment +
                                    System.lineSeparator()
                    );
                } catch (IOException e) {
                    System.out.println("Error occurred writing to file: " + e.toString());
                } finally {
                    System.out.println("Entry added!");
                }
                scanner2.close();
            } else if (option == 2) {
                System.out.println("Here are your previous journal entries!");
                try (
                        BufferedReader br = new BufferedReader(new FileReader("journal.txt"))
                ) {
                    String line;
                    while ((line = br.readLine()) != null) {
                        String[] info = line.split(",");
                        for (int i = 0; i < info.length; i++) {
                            System.out.println(info[i]);
                        }
                    }
                } catch (IOException e) {
                    System.out.println("Error occurred reading file: " + e.toString());
                }
            } else if (option == 3) {
                System.out.println("Here are your statistics!");

                System.out.println("Books Read in December: " + booksPerMonth("December"));
                System.out.println("Books Read in January: " + booksPerMonth("January"));
                System.out.println("Books Read in February: " + booksPerMonth("February"));
                System.out.println("Books Read in March: " + booksPerMonth("March"));
                System.out.println("Books Read in April: " + booksPerMonth("April"));
                System.out.println("Books Read in May: " + booksPerMonth("May"));
                System.out.println("Books Read in June: " + booksPerMonth("June"));
                System.out.println("Books Read in 2023: " + booksPerYear("2023"));
                System.out.println("Books Read in 2024: " + booksPerYear("2024"));
                System.out.println("Books Read in 2022: " + booksPerYear("2022"));
            } else if (option == 4) {
                System.out.println("Bye!");
            } else {
                System.out.println("This isn't a valid option. Try another number.");
            }
        } while (option != 4);
        scanner.close();
    }

    public static int booksPerMonth(String month) {
        int totalMonth = 0;
        try (
                BufferedReader br = new BufferedReader(new FileReader("journal.txt"))
        ) {
            String line;
            while ((line = br.readLine()) != null) {
                if (line.contains(month)) {
                    totalMonth++;
                }
            }
        } catch (IOException e) {
            System.out.println("Error occurred reading file: " + e.toString());
        }
        return totalMonth;
    }
    public static int booksPerYear(String year){
        int totalYear = 0;
        try (
                BufferedReader br = new BufferedReader(new FileReader("journal.txt"))
        ) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] info = line.split(",");
                if(info[6].substring(info[6].length()-4).contains(year)){
                    totalYear++;
                }
            }
        } catch (IOException e) {
            System.out.println("Error occurred reading file: " + e.toString());
        }
        return totalYear;
    }
    public static int totalPagesRead(){
        int totalPage = 0;
        try (
                BufferedReader br = new BufferedReader(new FileReader("journal.txt"))
        ) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] info = line.split(",");
                totalPage += Integer.parseInt(info[4].substring(14));
            }
        } catch (IOException e) {
            System.out.println("Error occurred reading file: " + e.toString());
        }
        return totalPage;
    }
}