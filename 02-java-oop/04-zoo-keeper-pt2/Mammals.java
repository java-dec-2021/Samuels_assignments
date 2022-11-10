// Define Class With Verb Name
public class Mammals {

    // Setting Attributes/Column
    public int energyLevel;

    // Setting Constructor Method
    public Mammals(int energyLevel) {
        // MUST use "THIS" when variable names are the same
        // Same As "SELF" From Python
        this.energyLevel = energyLevel;
    }

    // Setting My Methods/Functionality/Behavior
    public int displayEnergy() {
        // Returning the current energyLevel for "this" Class
        // Same As "SELF" From Python
        return this.energyLevel;
    }

}