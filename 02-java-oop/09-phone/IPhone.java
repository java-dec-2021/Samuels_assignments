// Defining the IPhone Class to Inherit(extends) the Abstract Class Phone and Implement(implements) the Interface, and All Regular Class MUST Implement and specify all Member Methods within the Interface, Unless an Abstract Class is to Implement it; then the Abstract Class can Implement some Member Methods of the Interface and leave the rest of the Methods to be Implemented by Subclasses that are Extending the Abstract Class
public class IPhone extends Phone implements Ringable {

// Defining the Constructor 
    public IPhone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        // Calling/Using the Constructor in my Phone Class by Using the "super(paramNames)" Keyword - Keeping my Code D.R.Y
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }

    // Using the "@Override" Annotation to Override the Abstract Methods from the Interface, So I can Compile with no Errors
    @Override
    public String ring() {
        // Using the Getter Method Functionality to get the Values of "this" Class
        return "IPhone " + this.getVersionNumber() + " Says " + this.getRingTone();
    }

    @Override
    public String unlock() {
        return "Unlocking Via Facial Recognition";
    }

    // Using the "@Override" Annotation to Override the Abstract Method from the Abstract Class
    @Override
    public void displayInfo() {
        // your code here
        System.out.println("IPhone " + this.getVersionNumber() + " From " + this.getCarrier());
    }

}