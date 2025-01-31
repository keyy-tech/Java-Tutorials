public class Question4 {
    public static void main(String[] args) {
        // Playing with atan,acos,asin
        double x = 0.5;
        double y = 0.5;
        double z = 0.5;
        System.out.println("atan(" + x + ") = " + Math.atan(x));
        System.out.println("acos(" + y + ") = " + Math.acos(y));
        System.out.println("asin(" + z + ") = " + Math.asin(z));

        double x1 = 1.0 / 3;
        double factor = Math.pow(10, 4);
        System.out.println(Math.round(x1 * factor) / factor);

        // Playing with max, min, abs functions
        System.out.println(Math.max(10, 20));
        System.out.println(Math.min(10, 20));
        System.out.println(Math.abs(-10));

        // Random number generation
        double randnum = Math.random() * 3 + 1;
        System.out.println("Random number: " + (int) randnum);

        System.out.println();
    }
}
