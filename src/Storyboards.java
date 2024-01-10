import java.util.Scanner;

public class Storyboards {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Create a New Entry");
        System.out.println(" ");
        System.out.println("Please enter the following information when prompted, pressing return after each one.");
        System.out.print("Title: ");
       String Title = input.nextLine();
        System.out.print("Author: ");
        String Author = input.nextLine();
        System.out.print("Genre: ");
        String Genre = input.next();
        System.out.print("Medium: ");
        String Medium = input.next();
        System.out.print("Number of Pages: ");
      String noPages = input.next();
       System.out.print("Rating (out of 10): ");
        String Rating = input.next();
       System.out.print("Date Finished (Day - entered in 00 format, for example if it's the 14th, enter 14): ");
//        String dateDay = input.next();
//        System.out.print("Date Finished (Month - entered in 00 format, for example if it's July, enter 07): ");
//        String dateMonth = input.next();
//        System.out.print("Date Finished (Day - entered in 0000 format, for example if it is 2023, enter 2023): ");
//        String dateYear = input.next();
//        System.out.print("Additional Comments: ");
//        String Comment = input.next();
//
//        System.out.println(" ");
//        System.out.println(" ");
//        System.out.println("Previous Entries");
//        System.out.println("Title: " + Title);
//        System.out.println("Author: " + Author);
//        System.out.println("Genre: " + Genre);
//        System.out.println("Medium: " + Medium);
//        System.out.println("No. of Pages: " + noPages);
//        System.out.println("Rating: " + Rating);
//        System.out.println("Date Finished: " + dateDay + " / "+dateMonth+" / "+dateYear);
//        System.out.println("Additional Comments: fav book, love Darcy bc he's an idiot");

        System.out.println("Here's your statistics!");
        System.out.println(" ");
        System.out.println("Books Read in December: 3");
        System.out.println("Books Read in January: 2");
        System.out.println("Books Read in February: 2");
        System.out.println("Books Read in March: 1");
        System.out.println("Books Read in April: 3");
        System.out.println("Books Read in May: 2");
        System.out.println("Books Read in June: 4");
        System.out.println("Books Read in 2023: 12");
        System.out.println("Books Read in 2024: 14");
        System.out.println("Total Number of Pages Read: 10,495");
        System.out.println("Approximately How Many Words: 5,247,500");
    }
}
