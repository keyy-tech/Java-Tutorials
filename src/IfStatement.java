import java.util.Scanner;

public class IfStatement {
    public static void main(String[] args) {
        // print if a number is odd or even
        // Division by % if results == 0, even, !=0, odd

        // Declaring your scanner variable
        Scanner scanner = new Scanner(System.in);

        // Declaring the variable to holder the inputted value
        int number;

        // Read input from the user
        System.out.print("Enter the number: ");

        // Storing the integer value
        number = scanner.nextInt();

        // Perform Calculations
        if(number % 2 == 0) {
            System.out.println("The number is even");
        }
        else {
            System.out.println("The number is odd");
        }

        // Close the scanner variable
        scanner.close();
    }
}
