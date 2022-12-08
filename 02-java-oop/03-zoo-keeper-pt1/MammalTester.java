// Defining Test File with Noun as its name
public class MammalTester {
    // Entry Point to Start my Application
    public static void main(String[] args) {
        // Off of the Mammal Class, Instantiating New Mammal Objects
        Mammal animal = new Mammal(100);
        Mammal animal1 = new Mammal(100);
        System.out.println("First Animal Energy: " + animal.displayEnergy());
        System.out.println("Second Animal Energy: " + animal1.displayEnergy());

        // Off of the Gorilla Class, Instantiating New Gorilla Objects
        Gorilla bob = new Gorilla(100);
        bob.throwFood();
        bob.throwFood();
        bob.throwFood();
        bob.eatBananas();
        bob.eatBananas();
        bob.climbTree();
        System.out.println("First Gorilla Energy: " + bob.displayEnergy());
    }

}