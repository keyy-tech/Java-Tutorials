import java.util.ArrayList;

public class ArrayLists {
    public static void main(String[] args) {
        // creating an array list
        ArrayList<String> animals = new ArrayList<>();
        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<Double> decimals = new ArrayList<>();

        // add content to the array list
        animals.add("Lion");
        animals.add("Tiger");
        animals.add("Elephant");
        animals.add("Dog");
        animals.add("Cat");

        // using loop to print the content of the array list
        for (int i = 0; i < animals.size(); i++) {
            System.out.println(animals.get(i));
        }

        //assignment - methods to play with  contain,remove and clear

    }
}
