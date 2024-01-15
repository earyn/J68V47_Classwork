import java.io.*;
import java.util.Scanner;

public class project {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            switch (getValidMenuOption(scanner)) {
                case 1 -> saveEntryToFile(scanner);
                case 2 -> showJournalEntries();
                case 3 -> showTotalStats();
                case 4 -> terminateProgram();
            }
            continuePrompt(scanner);
        }
    }
    public static void continuePrompt(Scanner scanner) {
        System.out.println(" ");
        System.out.println("Would you like to continue? (Enter either Y / N)");
        String answer = scanner.nextLine();
        if (answer.equalsIgnoreCase("N")) {
            terminateProgram();
        }
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

    public static int booksPerYear(String year) {
        int totalYear = 0;
        try (
                BufferedReader br = new BufferedReader(new FileReader("journal.txt"))
        ) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] info = line.split(",");
                if (info[6].substring(info[6].length() - 4).contains(year)) {
                    totalYear++;
                }
            }
        } catch (IOException e) {
            System.out.println("Error occurred reading file: " + e.toString());
        }
        return totalYear;
    }

    public static int totalPagesRead() {
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

    public static int getValidMenuOption(Scanner scanner) {
        int option;

        while (true) {
            System.out.println("Hello! What would you like to do today?");
            System.out.println(" ");
            System.out.println("\uD83D\uDCD5 1. Add an entry to the library.");
            System.out.println("\uD83D\uDCD7 2. See Previous Journal Entries.");
            System.out.println("\uD83D\uDCD8 3. See My Statistics!");
            System.out.println("\uD83D\uDCD9 4. Quit");
            System.out.println("Please enter a number...");
            option = scanner.nextInt();

            if (option < 1 || option > 4) {
                    System.out.println("This isn't a valid option. Try another number.");
                    System.out.println(" ");
            } else {
                scanner.nextLine();
                return option;
            }
        }
    }

    public static int getNumberInRange(Scanner scanner, int min, int max) {
        while (true) {
            try{
                int number = scanner.nextInt();
                if (number >= min && number <= max) {
                    return number;
                }
                System.out.println("Invalid number. Please try again.");
            } catch (Exception e) {
                System.out.println("Invalid number. Please try again.");
                scanner.nextLine();
            }
        }
    }

    public static void saveEntryToFile(Scanner scanner) {
        System.out.println("Let's add an entry!");
        System.out.println(" ");
        String title = getBookTitle(scanner);
        String author = getBookAuthor(scanner);
        String genre = getBookGenre(scanner);
        String medium = getBookMedium(scanner);
        String noPage = getBookNoPage(scanner);
        String rating = getBookRating(scanner);
        String dateFinished = getBookFinishedDate(scanner);
        String comment = getBookComment(scanner);
        fileSaving(
                title,
                author,
                genre,
                medium,
                noPage,
                rating,
                dateFinished,
                comment
        );
    }

    public static String getBookTitle(Scanner scanner) {
        String title = "";
        do {
            System.out.print("Please enter the Title: ");
            title = scanner.nextLine();
        } while (title.isEmpty());
        return title;
    }

    public static String getBookAuthor(Scanner scanner) {
        String author = "";
        do {
            System.out.print("Who is the Author: ");
            author = scanner.nextLine();
        } while (author.isEmpty());
        return author;
    }

    public static String getBookGenre(Scanner scanner) {
        String genre = "";
        do {
            System.out.print("What is the Genre: ");
            genre = scanner.nextLine();
        } while (genre.isEmpty());
        return genre;
    }

    public static String getBookMedium(Scanner scanner) {
        String medium = "";
        do {
            System.out.print("What is the Medium (eg. Prose, Poetry, etc.): ");
            medium = scanner.nextLine();
        } while (medium.isEmpty());
        return medium;
    }

    public static String getBookNoPage(Scanner scanner) {
        System.out.print("How many pages?: ");
        return Integer.toString(getNumberInRange(scanner, 0, Integer.MAX_VALUE));
    }

    public static String getBookRating(Scanner scanner) {
        System.out.print("Rating (1-10): ");
        return Integer.toString(getNumberInRange(scanner, 1, 10));
    }

    public static String getBookFinishedDate(Scanner scanner) {
        String dateDay = getDayFinished(scanner);
        String dateMonth = getMonthFinished(scanner);
        String dateYear = getYearFinished(scanner);
        scanner.nextLine();
        return dateDay + "-" + dateMonth + "-" + dateYear;
    }

    public static String getDayFinished(Scanner scanner) {
        System.out.print("Day Finished (1-31): ");
        int day = getNumberInRange(scanner, 1, 31);
        if (day < 10) {
            return "0" + day;
        }
        return Integer.toString(day);
    }

    public static String getMonthFinished(Scanner scanner) {
        System.out.print("Month Finished (1-12): ");
        int month = getNumberInRange(scanner, 1, 12);
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        return months[month - 1];
    }

    public static String getYearFinished(Scanner scanner) {
        System.out.print("Year Finished: ");
        int year = getNumberInRange(scanner, 2023, 2025);
        return Integer.toString(year);
    }

    public static String getBookComment(Scanner scanner) {
        String comment = "";
        do {
            System.out.print("Additional Comments: ");
            comment = scanner.nextLine();
        } while (comment.isEmpty());
        return comment;
    }

    public static void fileSaving(
            String title,
            String author,
            String genre,
            String medium,
            String noPage,
            String rating,
            String dateFinished,
            String comment
    ) {
        try (
                PrintWriter print = new PrintWriter(new FileWriter("journal.txt", true))
        ) {
            print.println(
                    "Title: " + title + ",Author: " + author + ",Genre: " + genre + ",Medium: " + medium + ",No. of Pages: " + noPage + ",Rating: " + rating + ",Date: " + dateFinished + ",Comment: " + comment);
            System.out.println(" ");
            System.out.println("Entry added! ✅");
        } catch (Exception e) {
            System.out.println("Error occurred writing to file: " + e.toString());
        }
    }

    public static void showJournalEntries() {
        System.out.println("\uD83D\uDCD6 Here are your previous journal entries! \uD83D\uDCDA4");
        System.out.println(" ");
        try (
                BufferedReader br = new BufferedReader(new FileReader("journal.txt"))
        ) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] info = line.split(",");
                for (int i = 0; i < info.length; i++) {
                    System.out.println(info[i]);
                }
                System.out.println("--------------------");
            }
        } catch (IOException e) {
            System.out.println("Error occurred reading file: " + e.toString());
        }
    }

    public static void terminateProgram() {
        System.out.println("Bye! \uD83D\uDE00\uD83D\uDC4B");
        System.exit(0);
    }

    public static void showTotalStats() {
        System.out.println("Here are your statistics! \uD83D\uDCCA");
        System.out.println(" ");
        System.out.println("Books Read in January: " + booksPerMonth("January"));
        System.out.println("Books Read in February: " + booksPerMonth("February"));
        System.out.println("Books Read in March: " + booksPerMonth("March"));
        System.out.println("Books Read in April: " + booksPerMonth("April"));
        System.out.println("Books Read in May: " + booksPerMonth("May"));
        System.out.println("Books Read in June: " + booksPerMonth("June"));
        System.out.println("Books Read in July: " + booksPerMonth("July"));
        System.out.println("Books Read in August: " + booksPerMonth("August"));
        System.out.println("Books Read in September: " + booksPerMonth("September"));
        System.out.println("Books Read in October: " + booksPerMonth("October"));
        System.out.println("Books Read in November: " + booksPerMonth("November"));
        System.out.println("Books Read in December: " + booksPerMonth("December"));
        System.out.println(" ");
        System.out.println("Books Read in 2023: " + booksPerYear("2023"));
        System.out.println("Books Read in 2024: " + booksPerYear("2024"));
        System.out.println("Books Read in 2025: " + booksPerYear("2025"));
        System.out.println(" ");
        System.out.println("Total Pages Read: " + totalPagesRead());
        System.out.println(" ");
    }
}