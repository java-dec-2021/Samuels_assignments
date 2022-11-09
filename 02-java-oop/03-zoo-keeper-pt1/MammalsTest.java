// Defining Test File with Verb as its name
public class MammalsTest {
    // Entry Point to Start my Application
    public static void main(String[] args) {
        // Off of the Mammal Class, Instantiating New Mammal Objects
        Mammals animal = new Mammals(100);
        Mammals animal1 = new Mammals(100);
        System.out.println("First Animal Energy: " + animal.displayEnergy());
        System.out.println("Second Animal Energy: " + animal1.displayEnergy());

        // Off of the Gorilla Class, Instantiating New Gorilla Objects
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