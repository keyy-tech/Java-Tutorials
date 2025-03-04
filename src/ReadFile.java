import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) throws FileNotFoundException {
        File inputfile = new File("File.txt");
        Scanner check = new Scanner(inputfile);
        while (check.hasNextLine()) {
            System.out.println(check.nextLine());
        }
        check.close();
    }
}


