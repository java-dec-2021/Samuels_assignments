public class Wizard extends Human {
    // Need a Constructor
    public Wizard() {
        this.health=50;
        this.intelligence=8;
    }
    // Instance Methods
    public void heal(Human otherHuman) {
        otherHuman.health += this.intelligence;
        System.out.println("This wizard healed another person by " + this.intelligence + " The persons health is now " + otherHuman.health);
    }

    public void fireball(Human otherHuman) {
        otherHuman.health -= (this.intelligence*3);
        System.out.println("This wizard shot a fireball and depleted the persons health by " + this.intelligence*3 + " The persons health is now " + otherHuman.health);
    }

}