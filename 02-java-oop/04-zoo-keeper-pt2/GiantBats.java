// Define The class With A Verb
public class GiantBats extends Mammals {

    // Set Constructor Method
    public GiantBats() {
        // Using The "SUPER" Keyword To Call The Mammals Constructor And Pass 300 Into It
        // Also Using Inheritance From The SuperClass Here
        super(300);
    }

    // Set-up My Methods/Functionality/Behavior
    public int displayEnergy() {
        // Returning "THIS" class Specific Inherited Attribute From Mammals
        return this.energyLevel;
    }

    public void fly() {
        System.out.println("This Is The Sound Of The Bat Taking Off " + "Energy Level: " + this.energyLevel);
        this.energyLevel-=50;
    }

    public void eatHumans() {
        System.out.println("He Gone! " + "Energy Level: " + this.energyLevel);
        this.energyLevel+=25;
    }

    public void attackTown() {
        System.out.println("AHHHHHHHHH " + "Energy Level: " + this.energyLevel);
        this.energyLevel-=100;
    }
}