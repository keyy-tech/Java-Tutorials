import java.io.File;
import java.io.IOException;

public class ReadingFiles {
    public static void main(String[] args) throws IOException {
        // Reading a text file in the project url path
        File inputfile = null;
        inputfile = new File("src/Text.txt");

        File fileDelete = new File("src/File.txt");

        // Writing to a text file in the project url path
        File desktopFile = new File("C:\\Users\\Administrator\\Desktop\\Check.txt");

        // find the use of deleteOnExit() method

        // Checking methods
        System.out.println(inputfile.exists());
        System.out.println(inputfile.delete());

    }
}
