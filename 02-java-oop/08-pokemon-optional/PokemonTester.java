// Defining Java Class with Noun name
public class PokemonTester {
    public static void main(String[] args) {
        // Off of the Pokemon Class I am Instantiating 2 Instances or Objects
        Pokemon newPoke = new Pokemon("Sammy", 100, "Dragon");
        Pokemon newPokie = new Pokemon("Sammie", 100, "Beast");
        // Testing the Pokemon Instance Method, Getters, and Setters
        newPoke.attackPokemon(newPokie);
        System.out.println(newPoke.getHealth());
        newPoke.setHealth(500);
        System.out.println(newPoke.getHealth());
        System.out.println(Pokemon.getPokemonCount());
    }

}