import java.util.Scanner;

public class TimeConversion {
    public static void main(String[] args) {
        // Scanner Variable
        Scanner scanner = new Scanner(System.in);

        // Read time
        int total_seconds;

        // Ask the user to enter time in seconds
        System.out.print("Enter time in seconds: ");

        // Read the time using the scanner variable
        total_seconds = scanner.nextInt();

        // Perform Calculations
        int days = total_seconds / 86400;
        int hours = (total_seconds % 86400) / 3600;
        int minutes = ((total_seconds % 86400) % 3600) / 60;
        int seconds = ((total_seconds % 86400) % 3600) % 60;

        // Display the result in MM:SS format
        System.out.printf("Time: %02d:%02d:%02d:%02d\n", days, hours, minutes, seconds);
        // Close the scanner
        scanner.close();
    }
}