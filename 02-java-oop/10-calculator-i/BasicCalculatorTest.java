// Defining Test File
public class BasicCalculatorTest {
    // Entry Point Method
    public static void main(String[] args) {
        // Off of the BasicCalculator JavaBean I am Instantiating an Object
        BasicCalculator calculator = new BasicCalculator();
        // Testing the Member Methods, Getter, and Setters
        calculator.setOperandOne(55.5);
        calculator.setOperandTwo(2.5);
        calculator.setOperand("-");
        System.out.println(calculator.performOperation());
        System.out.println(calculator.getResult());
    }
}