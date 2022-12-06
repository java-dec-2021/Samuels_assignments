// Defining Class with a Noun as the name
public class Gorilla extends Mammal {

    // Defining Constructor Method of this Class that is Inheriting the Mammal Class
    public Gorilla(int energyLevel) {
        // Using "super" to call on the Mammal Parent Classes Constructor. Must include all Parameters in Parent Constructor. Using "superclass" Constructor AKA Parent Class.
        super(energyLevel);
    }

    // Defining Methods/Functionality/Behavior of this Class
    public void throwFood() {
        // Since this "superclass" member Variable is Public (or Protected),
        // I can use Inheritance to use the Column in the Mammal superclass,
        // also using "this" to make it Specific to this Class.
        this.energyLevel-=5;
    }

    public void eatBananas() {
        this.energyLevel+=10;
    }

    public void climbTree() {
        this.energyLevel-=10;
    }

}