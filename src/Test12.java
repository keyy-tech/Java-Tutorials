import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test12 {
    public static void main(String[] args) throws FileNotFoundException {
        File input = new File("File1.txt");
        Scanner scanner = new Scanner(input);
        Double[][] list = new Double[3][4];
        while (scanner.hasNextLine()) {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 4; j++) {
                    list[i][j] = scanner.nextDouble();
                }
            }
        }
        System.out.println("The 2D array is: ");

    }
}
