import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        /* Declaring the Scanner */
        Scanner check = new Scanner(System.in);

        // Taking the input from the user
        int number1;
        int number2;

        // Taking the first number
        System.out.print("Enter the first number: ");

        // Read the integer
        number1 = check.nextInt();

        // Taking the second number
        System.out.print("Enter the second number: ");

        // Read the integer
        number2 = check.nextInt();

        // Displaying the result
        System.out.println("Is the second number a multiple of the first number? " + (number2 % number1 == 0));

        // Closing the scanner
        check.close();

    }
}
