import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WritingFiles {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("Text.txt");
        PrintWriter printWriter = new PrintWriter(fileWriter);
        printWriter.println("Hello World");
        printWriter.println("Writing to file in Java");
        printWriter.close();
    }
}
