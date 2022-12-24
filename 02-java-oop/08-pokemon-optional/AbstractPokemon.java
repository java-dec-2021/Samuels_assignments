// Defining the Abstract Class, Must have Noun name with ALL Classes, MUST Explicitly use "abstract" Keyword
public abstract class AbstractPokemon implements PokemonInterface {
// Giving the "createPokemon" Method Definition
public Pokemon createPokemon(String name, int health, String type) {
    Pokemon poke = new Pokemon(name, health, type);
    return poke;
}
// Giving the "pokemonInfo" Method Definition
public String pokemonInfo(Pokemon pokemon) {
    return pokemon.toString();
}
}