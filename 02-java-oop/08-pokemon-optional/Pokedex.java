// Importing the Imports I need
import java.util.ArrayList;
// Defining the Class with Verb name, Extending the Abstract Class (Figure out why this class needs to be abstract)
public abstract class Pokedex extends AbstractPokemon {
// Member Variable or Attribute
    public ArrayList<String> myPokemons;
// Implementing "listPokemon" Member Method from Abstract Class
public void listPokemon() {
    for(String poke : myPokemons) {
        System.out.println(poke);
    }

}

}