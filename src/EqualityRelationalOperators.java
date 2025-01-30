public class EqualityRelationalOperators {
    public static void main(String[] args) {
        // ==, !=, <, >, <=, >=
        int number1 = 2;
        int number2 = 20;

        // Equality
        System.out.println("number1 == number2: " + (number1 == number2));

        // Inequality
        System.out.println("number1 != number2: " + (number1 != number2));

        // Less than
        System.out.println("number1 < number2: " + (number1 < number2));

        // Greater than
        System.out.println("number1 > number2: " + (number1 > number2));

        // Ternary Operator
        String result = (number1 > number2) ? "Number1 is greater" : "Number2 is greater";


    }
}