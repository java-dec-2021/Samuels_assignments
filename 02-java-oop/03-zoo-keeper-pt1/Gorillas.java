// Define My class With A Verb
public class Gorillas extends Mammals {

    // Set A Constructor Method
    public Gorillas(int energyLevel) {
        // Using "SUPER" To Call The Mammals Constructor Method With Its Required Parameters.
        // Also Using Inheritance From The Superclass Here
        super(energyLevel);
    }

    // Set-up My Methods/Functionality/Behavior
    public void throwFood() {
        // Since The Superclass Attribute Is Public (or Protected),
        // I can Use Inheritance To Use The Mammals Attribute,
        // And Also "THIS" To Make It Now This Specific Classes Own Attribute
        this.energyLevel-=5;
    }

    public void eatBananas() {
        this.energyLevel+=10;
    }

    public void climbTree() {
        this.energyLevel-=10;
    }
}