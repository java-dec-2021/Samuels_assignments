public class Galaxy extends Phone implements Ringable {
// Constructor
    public Galaxy(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
// Instance Methods being Implemented from the Interface and Abstract Classes Respectively 
    @Override
    public String ring() {
        return "Galaxy " + this.getVersionNumber() + " Says " + this.getRingTone();
    }

    @Override
    public String unlock() {
        return "Unlocking Via Finger Print";
    }

    @Override
    public void displayInfo() {
        System.out.println("Galaxy " + this.getVersionNumber() + " From " + this.getCarrier());
    }

}