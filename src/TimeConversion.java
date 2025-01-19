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
        int minutes = total_seconds / 60;  // 1 minute = 60 seconds
        int seconds = total_seconds % 60;  // Remainder in seconds

        // Display the result in MM:SS format
        System.out.printf("Time: %02d:%02d\n", minutes, seconds);

        // Close the scanner
        scanner.close();
    }
}