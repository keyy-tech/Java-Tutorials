import java.util.HashMap;

public class Test13 {
    public static void main(String[] args) {
        HashMap<String, double[]> map = new HashMap<>();
        map.put("John", new double[]{67, 57, 54});
        map.put("Kofi", new double[]{69, 54, 60});
        // union of the values and add it to the HashpMap with key a
        double[] a = new double[3];
        for (double[] value : map.values()) {
            for (int i = 0; i < value.length; i++) {
                a[i] += value[i];
            }
        }


    }
}
