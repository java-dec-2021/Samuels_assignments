// Define Class With Noun name
// Using Java Inheritance
public class GiantBat extends Mammal {

    // Setting Constructor Method
    public GiantBat() {
        // Using "super()" Keyword to call the Mammal Superclass Constructor and pass 300 into it for Default GiantBat energyLevels' Value
        super(300);
    }

    // Setting up my Methods/Functionality/Behavior
    public int displayEnergy() {
        // Returning "this" classes Inherited Column (because its public in its Superclass, so I can use it) in Mammal
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