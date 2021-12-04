/* Methods Calls() For My classes Functionality,
** That My Test File Will Run */

// Import Array Module
import java.util.Arrays;
import java.util.ArrayList;
// Define the class
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
            // Adding All of the i's to my Variable Sum
            sum += i;
            // Printing the results
            System.out.println(sum);
        }
    }


// Write a Method that Iterates through Each Index in the Array
    public void iterArr(int[] anyArray) {
        // Iterate Through The Array Indices
        for (int i = 0; i < anyArray.length; i++) {
            // Printing the results
            System.out.println(anyArray[i]);
        }
        // Another Way To Print Arrays - This Way Actually Shows The Results In The Array Form "[]"
        // System.out.println(Arrays.toString(anyArray));
    }


// Write a Method that Finds the Max for Any Given Array
    public void findMax() {
        // Declare an ArrayList, Make new Instance of ArrayList To Hold all my Outputs
        ArrayList<Integer> newArray = new ArrayList<Integer>();
        // Adding to my ArrayList
        newArray.add(1);
        newArray.add(-3);
        newArray.add(5);
        newArray.add(-7);
        newArray.add(9);
        newArray.add(13);
        // Declaring a Variable to Hold my Max Value
        int max = 0;
        // Iterate the ArrayList Indices
        for (int i = 1; i < newArray.size(); i++) {
            // If Check for the Max of any given Array
            if (newArray.get(i) > max) {
                max = newArray.get(i);
            }
        }
            // Printing the results
            System.out.println(max);
    }


// write a method that puts All the Odd numbers into an Array
    public ArrayList<Integer> newArr() {
        // Declare an ArrayList, Make new Instance of ArrayList To Hold all my Outputs
        ArrayList<Integer> array = new ArrayList<Integer>();
        // Iterate the Array Indices
        for (int i = 1; i < 256; i++) {
            // If check for Odd numbers
            if (i % 2 == 1) {
                // Adding i to my ArrayList
                array.add(i);
            }
        }
        // Printing the results
        System.out.println(array);
        // Returning the Array
        return array;
    }
}