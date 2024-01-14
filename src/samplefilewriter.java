import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class samplefilewriter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter names (type 'exit' to finish):");

        try (FileWriter fileWriter = new FileWriter("entries.txt", true)) {
            while (true) {
                System.out.print("Enter a name: ");
                String input = scanner.nextLine();

                if ("exit".equalsIgnoreCase(input.trim())) {
                    break;
                }

                fileWriter.write(input + System.lineSeparator());
                System.out.println("Name '" + input + "' added to entries.txt");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }
}