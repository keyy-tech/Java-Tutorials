import java.util.Scanner;

public class Pratical {
    public static void main(String[] args) {
        // Declaring the Scanner Variable
        Scanner scanner = new Scanner(System.in);

        // Read the two numbers
        int number1;
        int number2;

        // Ask the user to enter the first number
        System.out.print("Enter the first number: ");

        // Read the first number
        number1 = scanner.nextInt();

        // Ask the user to enter the second number
        System.out.print("Enter the second number: ");

        // Read the second number
        number2 = scanner.nextInt();

        // Display the result
        System.out.println(number1 % number2 == 0);

        // Close the scanner
        scanner.close();
    }
}
