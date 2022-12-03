// Importing Libraries I need
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Random;
// Defining The class with Noun name
public class PuzzleJava {
    // Write a Method to Print 10 Random Numbers out of 20 Into an Array
    public void getTenRolls() {
        // Initializing an Array
        int[] array;
        // Specifying the Length or Number of Indices, So I receive no Error
        array = new int[10];
        // Generating a Random Number for each Index up to 20 (exclusive)
        array[0] = new Random().nextInt(20);
        array[1] = new Random().nextInt(20);
        array[2] = new Random().nextInt(20);
        array[3] = new Random().nextInt(20);
        array[4] = new Random().nextInt(20);
        array[5] = new Random().nextInt(20);
        array[6] = new Random().nextInt(20);
        array[7] = new Random().nextInt(20);
        array[8] = new Random().nextInt(20);
        array[9] = new Random().nextInt(20);
        // How I have to Print the Array
        System.out.println(Arrays.toString(array));
    }

    // Write a Method to Select One Random Letter from the Alphabet
    public String getRandomLetter() {
        // Initialize an Array and Seeded Its Indices
        String[] array = new String[] {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "w", "x", "y", "z"};
        // Returning a String telling me the Letter it is, by Creating a Random Generator utilizing the nextInt Instance Method from the Random Class
        return " Random Letter from the array = " + array[new Random().nextInt(array.length)];
    }

    // Write a Method to Generate a String of 8 Characters
    public String getPassword() {
        // Declaring an Empty String to hold the 8 Characters
        String password = "";
        // Utilizing a For Loop to produce 8 characters
        for (int i = 0; i < 8; i++) {
            // Appending to my Password String on each Iteration with a random Letter by using getRandomLetter() Instance Method
            password += getRandomLetter();
        }
        // Printing my 8 character String to see if it populated correctly
        System.out.println(password);
        // Returning my 8 character String
        return password;
    }

    // Write a Method to Create a passwordset Using the int "length" as the Parameter
    public ArrayList<String> getNewPasswordSet(int length) {
        // Declaring a new ArrayList because I can Manipulate ArrayList (Add/Remove)/ also utilizing Generics<>
        ArrayList<String> password = new ArrayList<String>();
        // For Loop Iterating through the "length" of the Parameter
        for (int i = 0; i < length; i++) {
            // On each Iteration, add a Random letter to the ArrayList Utilizing getRandomLetter() Instance Method
            password.add(getRandomLetter());
        }
        // Printing The Results to check if the ArrayList populated correctly
        System.out.println(password);
        //returning The Output
        return password;
    }
}