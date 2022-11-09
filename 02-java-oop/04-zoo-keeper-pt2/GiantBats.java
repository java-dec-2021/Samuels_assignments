// Define Class With Verb name
// Using Java Inheritance
public class GiantBats extends Mammals {

    // Setting Constructor Method
    public GiantBats() {
        // Using "SUPER" Keyword to call the Mammals Superclass Constructor and pass 300 into it for default GiantBats energyLevel
        // Also using Constructor Overloading
        super(300);
    }

    // Setting up my Methods/Functionality/Behavior
    public int displayEnergy() {
        // Returning "this" classes Inherited Column (because its public in its Superclass, so I can use it) in Mammals
        return this.energyLevel;
    }

    // Defining Member Methods/behavior/functionality
    public void fly() {
        this.energyLevel-=50;
        System.out.println("This Is The Sound Of The Bat Taking Off " + "Energy Level: " + this.energyLevel);
    }

    public void eatHumans() {
        this.energyLevel+=25;
        System.out.println("He Gone! " + "Energy Level: " + this.energyLevel);
    }

    public void attackTown() {
        this.energyLevel-=100;
        System.out.printf("AHHHHHHHHH now the energyLevel is: %d", this.energyLevel);
    }

}