import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the starting number from the user
        System.out.print("Enter a starting number: ");

        // Reading the number
        int num = scanner.nextInt();

        // Variable to count the first 15 numbers
        int count = 0;

        while (count < 15) {
            if (num % 3 == 0 && num % 5 == 0) {
                System.out.println(num);
                count++;
            }
            num++;
        }

        scanner.close();
    }
}
