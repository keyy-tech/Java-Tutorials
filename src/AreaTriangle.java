import java.util.Scanner;

public class AreaTriangle {
    public static void main(String[] args) {

        // Declaring the Scanner Variable
        Scanner scanner = new Scanner(System.in);

        // Read the base and height of the triangle
        int base;
        double height;

        // Ask the user to enter the base of the triangle
        System.out.print("Enter the base of the triangle: ");

        // Read the base
        base = scanner.nextInt();

        // Ask the user to enter the height of the triangle
        System.out.print("Enter the height of the triangle: ");

        // Read the height
        height = scanner.nextDouble();

        // Perform Calculations
        double area;
        area = 0.5 * base * height;

        // Display results
        System.out.println("Area of the triangle: " + area);

        // Close the scanner
        scanner.close();

    }
}
