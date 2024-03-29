// Define Class With Noun Name
public class Mammal {

    // Setting Attribute/Column
    public int energyLevel;

    // Setting Constructor Method
    public Mammal(int energyLevel) {
        // MUST use "this" when Variable names are the same as Member Variables
        // "this" same as "self" from Python
        this.energyLevel = energyLevel;
    }

    // Setting My Methods/Functionality/Behavior
    public int displayEnergy() {
        // Returning the current energyLevel for "this" Class
        // Same as "self" from Python
        return this.energyLevel;
    }

}