import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = 0, y = 0, z = 0;
        int counter = 3;

        while (counter > 0) {
            System.out.print("Enter x: ");
            try {
                x = scanner.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter an integer.");
                scanner.next();
                counter--;
                System.out.println("You have " + counter + " attempts left.");
                if (counter == 0) {
                    scanner.close();
                    return;
                }
            }
        }

        counter = 3;

        while (counter > 0) {
            System.out.print("Enter y: ");
            try {
                y = scanner.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter an integer.");
                scanner.next();
                counter--;
                System.out.println("You have " + counter + " attempts left.");
                if (counter == 0) {
                    scanner.close();
                    return;
                }
            }
        }

        try {
            z = x / y;
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Execution completed.");
        }

        System.out.println("The value of x is " + x + ", y is " + y + ", and z is " + z);
        scanner.close();
    }
}