import java.util.Scanner;

public class L6E2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int option = 0;

        do {
          System.out.println("1. Say hello");
          System.out.println("2. Tell me the time");
          System.out.println("3. Tell me a joke");
          System.out.println("4. Quit");

          System.out.println("Which option would you like? (1-4) ");
          option = scanner.nextInt();
          if (option ==1){
              System.out.println("Hello");
          } else if (option ==2){
              System.out.println("15:12");
          } else if (option ==3) {
              System.out.println("Why do scuba divers fall backwards out of the boat? Because if they fell forward they'd still be in the boat.");
          }

        }while (option != 4);

    }
}
