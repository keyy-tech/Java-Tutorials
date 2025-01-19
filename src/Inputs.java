import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {

        // Create to read from keyboard
        Scanner input = new Scanner(System.in);

        // Read a string
        String name;
        int age;
        String hostel;

        // Ask the user to enter a name
        System.out.print("Enter your name: ");
        // Read the name using the scanner variable
        name = input.nextLine();

        // Ask the user to enter age
        System.out.print("Enter your age: ");
        // Read the age using the scanner variable
        age = input.nextInt();


        input.nextLine();

        // Ask the user to enter hostel
        System.out.print("Enter your hostel: ");
        // Read the hostel using the scanner variable
        hostel = input.nextLine();

        // Print the name
        System.out.println("Hello " + name + " " + age + "!" + hostel);

        // Close the scanner
        input.close();
    }
}