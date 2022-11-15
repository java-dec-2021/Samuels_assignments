public class Ninjas extends Humans {
    // Need a Constructor
    public Ninjas() {
        this.stealth=10;
    }
    // Instance Methods
    public void steal(Humans otherHuman) {
        otherHuman.health-=this.stealth;
        System.out.println("This ninja decreased the persons health by " + this.stealth + " The persons health is now " + otherHuman.health);
    }

    public void escape() {
        this.health-=this.stealth;
        System.out.println("The ninja got away by using " + this.stealth + "stealth " + "But their health is now " + this.health);
    }
}