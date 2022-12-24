// Importing the Imports I need
import java.util.ArrayList;
// Defining the Class with Noun name, Extending the Abstract Class (Figure out why this class needs to be abstract), Does this Abstract Class need a Constructor?
public abstract class Pokedex extends AbstractPokemon {
// Member Variable or Attribute
    public ArrayList<String> myPokemon;
// Implementing "listPokemon" Member Method from Abstract Class
public void listPokemon() {
    for(String poke : myPokemon) {
        System.out.println(poke);
    }

}

}