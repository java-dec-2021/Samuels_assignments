// Set-up My Test File For My GiantBats Objects/Instances
public class GiantBatsTest {
    // Entry Point Method
    public static void main(String[] args) {
        // Creating A GiantBats Object
        GiantBats bat = new GiantBats();
        bat.attackTown();
        bat.attackTown();
        bat.attackTown();
        bat.eatHumans();
        bat.eatHumans();
        bat.fly();
        bat.fly();
        System.out.println("First GiantBats Energy: " + bat.displayEnergy());
    }
}