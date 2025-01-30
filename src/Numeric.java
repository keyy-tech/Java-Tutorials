public class Numeric {
    public static void main(String[] args) {
        // Numeric Data Types
        // int
        int number = 10;

        // double
        double decimal = 10.5;

        // String
        String weight = "45.78kg";
        String weight2 = "45";

        // Conversion
        int NewNumber = (int) decimal;
//        double NewWeight = Double.parseDouble(weight);
        int NewWeight2 = Integer.parseInt(weight2);

        // Display the result
        System.out.println("NewDecimal: " + decimal);
        System.out.println("NewNumber: " + NewNumber);
//        System.out.println("NewWeight: " + NewWeight);
        System.out.println("NewWeight2: " + NewWeight2);


    }
}
