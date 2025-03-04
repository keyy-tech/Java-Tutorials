import java.util.Arrays;

public class List {
    public static void main(String[] args) {
        // creating sd = single dimensional array
        double[] marks = new double[5];
        int[] age = new int[5];
        String[] name = new String[5];
        double[] marks1 = {1, 2, 3, 4, 5};


        // loop to add content
        for (int i = 0; i < marks.length; i++) {
            marks[i] = i + 1;
        }
        for (int i = 0; i < age.length; i++) {
            age[i] = i + 1;
        }
        for (int i = 0; i < name.length; i++) {
            name[i] = "Student" + i;
        }
        System.out.println("Marks: " + Arrays.toString(marks));
        System.out.println("Age: " + Arrays.toString(age));
        System.out.println("Name: " + Arrays.toString(name));

        // add exception handling


    }
}
