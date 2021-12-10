// Set-up My Test File With Verb Name
public class MammalsTest {
    // Entry Point To Start My Application
    public static void main(String[] args) {
        // Creating A New Mammal Object
        Mammals animal = new Mammals(100);
        Mammals animal1 = new Mammals(100);
        System.out.println("First Animal Energy: " + animal.displayEnergy());
        System.out.println("Second Animal Energy: " + animal1.displayEnergy());

        // Creating A Gorilla Object
        Gorillas bob = new Gorillas(100);
        bob.throwFood();
        bob.throwFood();
        bob.throwFood();
        bob.eatBananas();
        bob.eatBananas();
        bob.climbTree();
        System.out.println("First Gorilla Energy: " + bob.displayEnergy());
    }
}