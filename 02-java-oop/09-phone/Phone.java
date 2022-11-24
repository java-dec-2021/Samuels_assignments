// Defining the Abstract Class, My base Class that closely related Regular Class will be Inheriting
public abstract class Phone {

// Member Variables, These Fields are not "static" and "final" by default, Therefore Fields cannot be Constant in Abstract Classes
    private String versionNumber;
    private int batteryPercentage;
    private String carrier;
    private String ringTone;

// The Constructor Method can SET Default Values for the Attributes, (e.g. this.field = 0, or this.fieldName = fieldName, or field++), Also with Abstract Classes Member Methods; They are allowed to have all three levels of Access Modifiers
    public Phone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        this.versionNumber = versionNumber;
        this.batteryPercentage = batteryPercentage;
        this.carrier = carrier;
        this.ringTone = ringTone;
    }

// Abstract Method for Abstract Classes. This Method will be Implemented by the Subclasses, Also since this an Explicit Abstract Method Using the "abstract" Keyword; This Class must now be Abstract itself
    public abstract void displayInfo();

// Getters
    // Getter For version number
    public String getVersionNumber() {
        return this.versionNumber;
    }

    // Getter For battery percentage
    public int getBatteryPercentage() {
        return this.batteryPercentage;
    }

    // Getter For carrier
    public String getCarrier() {
        return this.carrier;
    }

    // Getter For ringtone
    public String getRingTone() {
        return this.ringTone;
    }

}