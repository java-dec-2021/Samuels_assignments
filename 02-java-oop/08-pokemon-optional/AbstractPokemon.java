// Defining the Abstract Class, MUST Explicitly use "abstract" Keyword
public abstract class AbstractPokemon implements PokemonInterface {
// Giving the "createPokemon" Method Definition
public Pokemons createPokemons(String name, int health, String type) {
    Pokemons poke = new Pokemons(name, health, type);
    return poke;
}
// Giving the "pokemonInfo" Method Definition
public String pokemonInfo(Pokemons pokemon) {
    return pokemon.toString();
}
}