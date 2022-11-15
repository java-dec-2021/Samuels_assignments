public class Samurais extends Humans {
    // Class Variable
    private static int howMany = 0;
    // Need a Constructor
    public Samurais() {
        this.health=200;
        howMany++;
    }
    // Instance Methods
    public void deathBlow(Humans otherHuman) {
        this.health/=2;
        otherHuman.health = 0;
        System.out.println("Samurais Health " + this.health + " " + "Other persons Health " + otherHuman.health);
    }

    public void meditate() {
        System.out.println("Before meditate health " + this.health);
        this.health=200;
        System.out.println("After meditate health " + this.health);
    }
    // Class Method
    public static int howmany() {
        return howMany;
    }
}