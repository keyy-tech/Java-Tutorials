import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        /* Declaring the Scanner */
        Scanner degree = new Scanner(System.in);

        // Taking the input from the user
        double fahrenheit;
        double celsius;

        // Taking the temperature in Fahrenheit
        System.out.print("Enter the temperature in Fahrenheit: ");

        // Read the integer
        celsius = degree.nextDouble();

        // Convert Celsius to Fahrenheit
        fahrenheit = (celsius * 9 / 5) + 32;

        // Displaying the result
        System.out.println("The temperature in Fahrenheit is: " + fahrenheit);

        // Closing the scanner
        degree.close();

    }
}
