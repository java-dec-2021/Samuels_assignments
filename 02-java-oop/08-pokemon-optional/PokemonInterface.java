// Defining Interface, MUST Explicitly write the Keyword "interface"
public interface PokemonInterface {
// Interfaces' Definition and/or Member Methods, Which all MUST be Implement and Specified if a Class is to Implement any Interface - Unless the Methods are "default" and "static" or if an Abstract Class is Implementing the Interface, Then the Subclass Extending the Abstract Class MUST Implement the rest of the Methods
// Abstract Method to create a Pokemon
Pokemon createPokemon(String name, int health, String type);
// Default "Abstract" Method for Interfaces to Display a Pokemon's name, health, and type
String pokemonInfo(Pokemon pokemon);
// Default "Abstract" Method for Interfaces to list all the Pokemon in the Pokedex
void listPokemon();
}