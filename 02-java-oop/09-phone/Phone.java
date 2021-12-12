// Set-up My Abstract class
public abstract class Phone {

    // Setting Some Attributes
    private String versionNumber;
    private int batteryPercentage;
    private String carrier;
    private String ringTone;

    // Can Use Constructor Method To SET Default Values For My Attributes (i.e. this.field = 0, or this.fieldName = fieldName, or field++)
    public Phone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        this.versionNumber = versionNumber;
        this.batteryPercentage = batteryPercentage;
        this.carrier = carrier;
        this.ringTone = ringTone;
    }

    // abstract method. This method will be implemented by the subclasses
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