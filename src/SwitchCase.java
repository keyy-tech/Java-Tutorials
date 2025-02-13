import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        // Declaring the scanner
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year = sc.nextInt();
        int zodic = year % 12;
        switch (zodic) {
            case 1:
                System.out.println("monkey");
                break;
            case 2:
                System.out.println("rooster");
                break;
            case 3:
                System.out.println("pig");
                break;
            case 4:
                System.out.println("rat");
                break;
            case 5:
                System.out.println("ox");
                break;
            case 6:
                System.out.println("tiger");
                break;
            case 7:
                System.out.println("rabbit");
                break;
            case 8:
                System.out.println("dragon");
                break;
            case 9:
                System.out.println("snake");
                break;
            case 10:
                System.out.println("horse");
                break;
//            case 11:
//                System.out.println("pig");
//                break;
            default:
                System.out.println("Invalid year");


        }
    }
}
