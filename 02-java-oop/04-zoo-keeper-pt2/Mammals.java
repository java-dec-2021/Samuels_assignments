// Define My Class With Verb Name
public class Mammals {

    // Set Some Attributes/Fields
    public int energyLevel;

    // Set A Constructor Method
    public Mammals(int energyLevel) {
        // Calling On "THIS" classes Attribute
        // Same As "SELF" From Python
        this.energyLevel = energyLevel;
    }

    // Set-up My Methods/Functionality/Behavior
    public int displayEnergy() {
        // Returning What The Current Energy Level Is For "THIS" Class Attribute Only
        // Same As "SELF" From Python
        return this.energyLevel;
    }
}