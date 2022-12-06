// Defining Class with a Noun as the name
public class Mammal {

    // Member Variable/Attribute/Column
    public int energyLevel;

    // Defining Constructor Method of Parent Class
    public Mammal(int energyLevel) {
        // Use "this" when using the same Variable name
        // "this" is the same as "self" in Python
        this.energyLevel = energyLevel;
    }

    // Defining Methods/Functionality/Behavior of the Class
    public int displayEnergy() {
        // Returning the current energy level of the Classes Instantiated Instance
        return this.energyLevel;
    }

}