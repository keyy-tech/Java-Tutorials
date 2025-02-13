import java.util.Scanner;

public class GradingSystem {
    public static void main(String[] args) {
        // Declaring the Scanner variable
        Scanner grade = new Scanner(System.in);

        // Display the output
        System.out.print("Enter cwa of student: ");

        // Declare the variable to store the value
        double cwa;

        cwa = grade.nextDouble();

        // Perform logics
        if (cwa > 100 || cwa < 0){
            System.out.println("Grade out of range");
        } else {
           if (cwa >= 80){
               System.out.println("First Class");
           }
           else if (cwa >= 70){
               System.out.println("Second Class Upper");
           }
           else if (cwa >= 60){
               System.out.println("Second Class Lower");
           }
           else if (cwa >= 50){
               System.out.println("Pass");
           }
           else {
               System.out.println("Fail");
           }
        }

        // close scanner
        grade.close();
    }
}
