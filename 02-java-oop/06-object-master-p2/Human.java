public class Human {
// Member Variables or Attributes, Since this Superclass will be Inherited by Derived Classes I want those Child Class to be able to have access to the Attributes
    protected int health;
    protected int strength;
    protected int stealth;
    protected int intelligence;
// Constructors with Default Values do not need to have parameters
    public Human() {
        this.health=100;
        this.strength=3;
        this.stealth=3;
        this.intelligence=3;
    }
// public Human() {
    //     this(100, 3, 3, 3);
    // }
// Instance Methods
    public void attack(Human otherHuman) {
        // Now the "otherHuman" object can access its own attributes via Dereferencing
        otherHuman.health-=this.strength;
        System.out.println("This human attacked another human by " + this.strength + " The other humans health is now " + otherHuman.health);
    }

}