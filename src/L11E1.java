import java.io.FileWriter;
import java.util.Scanner;

public class L11E1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Input a base number: ");
        int base = scanner.nextInt();

        try {
            FileWriter out = new FileWriter("output.txt");
            for (int count=1; count<11; count++) {
                int answer = (base * count);
                out.write(base + " x " + count + " = " + answer);
            }
            out.close();
        } catch (Exception e) {
            System.out.println("this doesn't work");
        }

    }
}