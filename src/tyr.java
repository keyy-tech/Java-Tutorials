import java.util.Scanner;

public class tyr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the grade: ");
        char grade = sc.next().charAt(0);
        if (grade == 'A') {
            System.out.println(1);
        } else if (grade == 'B') {
            System.out.println(2);
        } else if (grade == 'C') {
            System.out.println(3);
        } else if (grade == 'D') {
            System.out.println(4);
        } else if (grade == 'F') {
            System.out.println(5);
        } else {
            System.out.println("Invalid");
        }
        sc.close();
    }
}