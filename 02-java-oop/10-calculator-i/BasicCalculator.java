// Defining JavaBean, Moreover to be a JavaBean I will need Member Variables, and need to Implement a Serializable Interface
public class BasicCalculator implements java.io.Serializable {
// Member Variables
    private double numOne;
    private double numTwo;
    private String operand;
    private double result;
// Defining Constructor (Must have a No Args constructor for this class to be considered a JavaBean)
public BasicCalculator() {}
// Member Methods
public double performOperation() {
    if(this.operand == "+") {
        this.result = this.numOne + this.numTwo;
    }
    else if(this.operand == "-") {
        this.result = this.numOne - this.numTwo;
    }
    else {
        return this.result = 0.0;
    }
    return this.result;
}
// Getter
public double getResult() {
    return this.result;
}
// Setters
public void setOperandOne(double input) {
    this.numOne=input;
}
public void setOperandTwo(double input) {
    this.numTwo=input;
}
public void setOperand(String input) {
    this.operand=input;
}
}