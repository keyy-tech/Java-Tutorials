public class PraticalQuiz {
    public static void main(String[] args) {
        double firstNumber, secondNumber, sum, thirdNumber;
        firstNumber = 1 / (1 + Math.sqrt(2));
        secondNumber = 1 / (Math.sqrt(3) + Math.sqrt(5));
        thirdNumber = Math.pow(1 / (Math.sqrt(2) + Math.sqrt(3)), 3);
        sum = firstNumber + secondNumber + thirdNumber;
        System.out.println(sum);

    }
}