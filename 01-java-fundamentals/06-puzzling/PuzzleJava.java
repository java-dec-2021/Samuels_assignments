// Add my imports
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Random;
// Defining The classes Functionality
public class PuzzleJava {
    // Write a Method to Print 10 Random Numbers out of 20 Into an Array
    public void getTenRolls() {
        // Initializing an Array
        int[] array;
        // Setting Its Length Or Number Of Indices
        array = new int[10];
        // Generating A Random Number for Each Index up to 20
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
        // How I Have To Print The Array
        System.out.println(Arrays.toString(array));
    }

    // Write a Method to Select One Random Letter from the Alphabet
    public String getRandomLetter() {
        // Initialize an Array and Seeded Its Indices
        String[] array = new String[] {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "w", "x", "y", "z"};
        // Returning a String Telling Me What Letter It Is By Creating a Random Generator And Using The nextInt Method for it
        return " Random Letter from the array = " + array[new Random().nextInt(array.length)];
    }

    // Write a Method to Generate a String of 8 Characters
    public String getPassword() {
        // An Empty String To Hold My 8 Characters
        String password = "";
        // A FOR loop To Produce 8 Characters
        for (int i = 0; i < 8; i++) {
            // Setting my password String To Be Populated By a Letter Each Iteration Through Using My "getRandomLetter()" Method
            password += getRandomLetter();
        }
        // Printing My 8 Character String
        System.out.println(password);
        // Returning My 8 Character String
        return password;
    }

    // Write a Method to Create a passwordset Using the int "length" as the Parameter
    public ArrayList<String> getNewPasswordSet(int length) {
        // Using ArrayList Because I can Manipulate (Add/Remove) ArrayList's
        ArrayList<String> password = new ArrayList<String>();
        // FOR loop Iterating through the "length" of my Parameter
        for (int i = 0; i < length; i++) {
            // Each Iteration Add a Random letter To My ArrayList Using my "getRandomLetter" Method
            password.add(getRandomLetter());
        }
        // Printing The Results
        System.out.println(password);
        //returning The Output
        return password;
    }
}