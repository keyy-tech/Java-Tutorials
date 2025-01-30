public class Arithmetic {
    public static void main(String[] args) {
//        DECLARATION
        double decimal1 = 23.2;
        double decimal2 = 3.5;
        int number1 = 11;
        int number2 = 5;
        float dec = 2;


//        ADDITION
        System.out.println("Decimal1 + Decimal2: " + (decimal1 + decimal2));
        System.out.println("Int1 + Int2: " + (number1 + number2));
        System.out.println("Decimal1 + Int1: " + (decimal1 + number1));
        System.out.println("Float + Int1: " + (dec + number1));
        System.out.println("Float + Decimal: " + (dec + decimal1));
        System.out.println("\n");

//        SUBTRACTION
        System.out.println("Decimal1 - Decimal2: " + (decimal1 - decimal2));
        System.out.println("Int1 + Int2: " + (number1 + number2));
        System.out.println("Decimal1 + Int1: " + (decimal1 + number1));
        System.out.println("Float + Int1: " + (dec + number1));
        System.out.println("Float + Decimal: " + (dec + decimal1));
        System.out.println("\n");

//        REMINDER
        System.out.println("Decimal1 % Decimal2: " + (decimal1 % decimal2));
        System.out.println("Int1 % Int2: " + (number1 % number2));
        System.out.println("Decimal1 % Int1: " + (decimal1 % number1));
        System.out.println("Float % Int1: " + (dec % number1));
        System.out.println("Float % Decimal: " + (dec % decimal1));


    }
}
