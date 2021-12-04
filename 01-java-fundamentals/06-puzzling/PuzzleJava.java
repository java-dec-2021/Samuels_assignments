// Add my imports
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Random;
// Defining my class Functionality
public class PuzzleJava {
    // write a method to Iterate 1 - 20 Inclusive
    public void arrRandom() {
        // create an instance of Random
        // Random randMachine = new Random();
        // Using next nextInt to print a number between 1 and 20 Inclusive. (Fixed-Number)
        // int num = randMachine.nextInt(21);
        // int[] array = new int[] {new Random().nextInt(21)};
            // int[] array = new int[] {};
        // for (int i = 1; i < 11; i++) {
            // array[i] = new Random().nextInt(21);
            int[] array = new int[] {new Random().nextInt(21)};
            System.out.println(Arrays.toString(array));
            // System.out.println(new Random().nextInt(21));
        // }
        // Printing The Results
        // System.out.println(num);
    }
}