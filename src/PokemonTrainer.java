import java.util.List;

public class PokemonTrainer{
    private String name;
    private List<Pokemon> Pokemon;

    public PokemonTrainer(String userA, List<Pokemon> pokemons) {
        this.name = userA;
    }

    public String getName() {
        return name;
    }

    public List<Pokemon> getPokemons() {
        return Pokemon;
    }
}
