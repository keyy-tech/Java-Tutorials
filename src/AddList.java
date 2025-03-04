import java.util.Arrays;

public class AddList {
    public static void main(String[] args) {
        // creating dd = double dimensional array
        double[][] marks = new double[5][5];
        // [5][5] means 5 rows and 5 columns
        int[][] age = new int[5][5];
        System.out.println("Marks: " + Arrays.deepToString(marks));
        System.out.println("Age: " + Arrays.deepToString(age));

        // sorting a multidimensional array
        int[][] numbers = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        marks[0][0] = 1;
        marks[0][1] = 2;
        marks[0][2] = 3;
        marks[0][3] = 4;
        marks[0][4] = 5;
        marks[1][0] = 6;
        marks[1][1] = 7;
        marks[1][2] = 8;
        marks[1][3] = 9;
        marks[1][4] = 10;
        marks[2][0] = 11;
        marks[2][1] = 12;
        marks[2][2] = 13;
        marks[2][3] = 14;
        marks[2][4] = 15;
        marks[3][0] = 16;
        marks[3][1] = 17;
        marks[3][2] = 18;

        System.out.println("Marks: " + Arrays.deepToString(marks));
        System.out.println(marks.length);
        System.out.println(marks[0].length);

        for (int i = 0; i < marks.length; i++) {
            for (int j = 0; j < marks[i].length; j++) {
                System.out.println(marks[i][j]);
            }
        }

        // java jagged multidimensional array
    }
}
