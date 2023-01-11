import java.util.List;

public class GrassPokemon extends Pokemon{
    public GrassPokemon(String name, int level, int healthPoints, String food, String sound) {
        super(name, level, healthPoints, food, sound, "grass");
    }



    @Override
    public List<String> getAttacks() {
        return null;
    }

    public void leafStorm(Pokemon pokemon, Pokemon gymPokemon) {
    }

    public void solarBeam(Pokemon pokemon, Pokemon gymPokemon) {
    }

    public void leechSeed(Pokemon pokemon, Pokemon gymPokemon) {
    }

    public void leaveBlade(Pokemon pokemon, Pokemon gymPokemon) {
    }
}
