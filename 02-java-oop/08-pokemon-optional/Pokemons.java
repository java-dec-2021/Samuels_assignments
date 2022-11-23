// Defining the Class with Verb name
public class Pokemons {
// Member Variables
private String name;
private int health;
private String type;
// Static (Class) Member Variable
private static int pokemonCount;
// Constructor, This Constructor setup allow the Client to set Default Values upon Instantiation
public Pokemons(String name, int health, String type) {
    this.name=name;
    this.health=health;
    this.type=type;
    pokemonCount++;
}
// Member Methods
public void attackPokemon(Pokemons pokemon) {
    pokemon.health-=10;
    System.out.println("This Pokemon attacked another Pokemon by 10, The other Pokemon's health is now " + pokemon.health);
}

    // These Member Methods only provide access if they are exposed Publicly
// Getters
public String getName() {
    return this.name;
}
public int getHealth() {
    return this.health;
}
public String getType() {
    return this.type;
}
public static int getPokemonCount() {
    return pokemonCount;
}
// Setters
public void setName(String name) {
    this.name=name;
}
public void setHealth(int health) {
    this.health=health;
}
public void setType(String type) {
    this.type=type;
}
public static void setPokemonCount(int count) {
    pokemonCount = count;
}

}