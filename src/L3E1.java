import java.util.Scanner;

public class L3E1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your first name ");
        String firstName = input.nextLine();
        System.out.print("Enter your surname ");
        String Surname = input.nextLine();
        System.out.print("Enter your year of birth YYYY ");
        String birthYear = input.nextLine();

        System.out.println("Username: " + firstName.substring(0,1).toUpperCase() + Surname.toLowerCase());
        System.out.println("Password: " + Surname.substring(0,1).toLowerCase() + firstName.substring(0,3).toUpperCase() + birthYear);
    }
}

