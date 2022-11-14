public class Humans {
// Member Variables or Attributes
    private int health;
    private int strength;
    private int stealth;
    private int intelligence;
// Constructors with default values do not need to have parameters
    public Humans() {
        this.health=100;
        this.strength=3;
        this.stealth=3;
        this.intelligence=3;
    }
// public Humans() {
    //this(100, 3, 3, 3);
    // }
// Instance Methods
    public void attack(Humans otherHuman) {
        // Now the "otherHuman" object can access its own attributes via Dereferencing
        otherHuman.health-=this.strength;
        System.out.println("This human attacked another human by " + this.strength + " The other humans health is now " + otherHuman.health);
    }

}