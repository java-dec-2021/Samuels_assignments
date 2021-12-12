// Set-up My IPhone class To Inherit My abstracted Phone class and Implement A Interface
public class IPhone extends Phone implements Ringable {

    // Set-up My Constructor 
    public IPhone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        // Calling/Using The Constructor In My Phone class By Using The "super(paramNames)" Keyword
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }

    // Using The "@Override" Annotation To Override abstract Methods From My Interface
    @Override
    public String ring() {
        // Using Getter Method Functionality To Get The Values For THIS class
        return "IPhone " + this.getVersionNumber() + " Says " + this.getRingTone();
    }

    @Override
    public String unlock() {
        // your code here
        return "Unlocking Via Facial Recognition";
    }

    // Using The "@Override" Annotation To Override A abstract Method From My abstracted class
    @Override
    public void displayInfo() {
        // your code here
        System.out.println("IPhone " + this.getVersionNumber() + " From " + this.getCarrier());
    }
}