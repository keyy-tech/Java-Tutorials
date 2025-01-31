import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        // Declaring the scanner
        Scanner random = new Scanner(System.in);

        // Declaring variables
        int number;

        // Display the message
        System.out.println("Enter your number: ");

        // Read the integer
        number = random.nextInt();

        // Perform Calculations
        int randomNumber;
        randomNumber = (int) (Math.random() * 5);

        // Display the result
        System.out.println((number == randomNumber) ? "Congratulations, you won" : "You guessed the wrong number!");
    }
}
