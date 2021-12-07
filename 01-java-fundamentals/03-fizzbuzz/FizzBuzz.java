// Defining My Class
public class FizzBuzz {
    // Defining My Methods Or Functionality For My class
    public String fizzBuzz(int args) {
        if (args % 3 == 0 && args % 5 == 0) {
            return "FizzBuzz";
        }
        else if (args % 3 == 0) {
            return "Fizz";
        }
        else if (args % 5 == 0) {
            return "Buzz";
        }
        else {
            return Integer.toString(args);
        }
    }

    // Overloaded Method
    public String fizzBuzz(int args, String multOf15Word, String multOf3Word, String multOf5Word) {
        if (args % 3 == 0 && args % 5 == 0) {
            return multOf15Word;
        }
        else if (args % 3 == 0) {
            return multOf3Word;
        }
        else if (args % 5 == 0) {
            return multOf5Word;
        }
        else {
            return Integer.toString(args);
        }
    }
}