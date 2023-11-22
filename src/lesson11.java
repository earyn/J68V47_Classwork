import java.io.*;

public class lesson11 {
    public static void main(String[] args) {
        try {
            FileWriter out = new FileWriter("output.txt");
            out.write("Hello World");
            out.close();
        } catch (Exception e) {
            System.out.println("this doesn't work");
        }

    }
}
