public class PokemonTest {
    public static void main(String[] args) {
        // Off of the Pokemons Class I am Instantiating 2 Instances or Objects
        Pokemons newPoke = new Pokemons("Sammy", 100, "Dragon");
        Pokemons newPokie = new Pokemons("Sammie", 100, "Beast");
        // Testing the Pokemons Instance Method, Getters, and Setters
        newPoke.attackPokemon(newPokie);
        System.out.println(newPoke.getHealth());
        newPoke.setHealth(500);
        System.out.println(newPoke.getHealth());
        System.out.println(Pokemons.getPokemonCount());
    }

}