import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Test11 {
    public static void main(String[] args) throws FileNotFoundException {
        // reading a text file and assigning the content to an array
        File input = new File("File1.txt");
        Scanner sc = new Scanner(input);
        String[] arr = new String[5];
        while (sc.hasNextLine()) {
            for (int i = 0; i < 5; i++) {
                arr[i] = sc.nextLine();
            }
        }
        System.out.println(Arrays.toString(arr));
    }


}
