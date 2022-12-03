/* Methods Calls() For My classes Functionality,
** That My Test File Will Run */

// Import Array Modules to be able to use Arrays for Java
import java.util.Arrays;
import java.util.ArrayList;
// Defining the Class with Noun name
public class BasicJava {


    // Write a Method that Prints All Numbers from 1 to 255
    public void print255() {
        // Count up to 255
        for (int i = 1; i < 256; i++) {
            // Printing the results
            System.out.println(i);
        }
    }


// Write a Method that Prints All Odd Numbers from 1 to 255
    public void odd255() {
        // Count up to 255
        for (int i = 1; i < 256; i++) {
            // If Check for Odd Numbers
            if (i % 2 == 1){
            // Printing the results
            System.out.println(i);
            }
        }
    }


// Write a Method that Adds All the Numbers  from 1 to 255
    public void add255() {
        // Declare a Variable to Hold my Sum
        int sum = 0;
        // Count up to 255
        for (int i = 1; i < 256; i++) {
            // Adding all of the i's to my Variable Sum to sum
            sum += i;
            // Printing the results
            System.out.println(sum);
        }
    }


// Write a Method that Iterates through Each Index in the Array
    public void iterArr(int[] anyArray) {
        // Iterate through the Array Indices
        for (int i = 0; i < anyArray.length; i++) {
            // Printing the results
            System.out.println(anyArray[i]);
        }
        // Another way to Print Arrays - This way actually shows the results in Array form "[]"
        // System.out.println(Arrays.toString(anyArray));
    }


// Write a Method that Finds the Max for Any Given Array
    public void findMax() {
        // Declare an ArrayList, Make a Instance of ArrayList to hold all Inputs
        ArrayList<Integer> newArray = new ArrayList<Integer>();
        // Appending to ArrayList
        newArray.add(1);
        newArray.add(-3);
        newArray.add(5);
        newArray.add(-7);
        newArray.add(9);
        newArray.add(13);
        // Declare a Variable to hold the Max value
        int max = 0;
        // Iterate the ArrayList Indices
        for (int i = 1; i < newArray.size(); i++) {
            // If Check for the Max for any given number
            if (newArray.get(i) > max) {
                max = newArray.get(i);
            }
        }
            // Printing the results
            System.out.println(max);
    }


// write a method that puts All the Odd numbers into an Array
    public ArrayList<Integer> newArr() {
        // Declare an ArrayList, Make a Instance of ArrayList to hold all my Inputs
        ArrayList<Integer> array = new ArrayList<Integer>();
        // Iterate the ArrayList Indices
        for (int i = 1; i < 256; i++) {
            // If check for Odd numbers
            if (i % 2 == 1) {
                // Appending i (odd numbers) to the ArrayList
                array.add(i);
            }
        }
        // Printing the results
        System.out.println(array);
        // Returning the ArrayList
        return array;
    }
}