public class Humans {
// Attributes, since I will be interacting with objects of the same type I want the children of this superclass to be able to have access to their own attributes
    protected int health;
    protected int strength;
    protected int stealth;
    protected int intelligence;
// Constructors with default values do not need to take have parameters
    public Humans() {
        this.health=100;
        this.strength=3;
        this.stealth=3;
        this.intelligence=3;
    }
// public Humans() {
    //     this(100, 3, 3, 3);
    // }
// Methods
    public void attack(Humans otherHuman) {
        // Now the "otherHuman" object can access its own attributes
        otherHuman.health-=this.strength;
        System.out.println("This human attacked another human by " + this.strength + " The other humans health is now " + otherHuman.health);
    }

}