import java.util.List;

public class WaterPokemon extends Pokemon{
    public WaterPokemon(String name, int level, int healthPoints, String food, String sound) {
        super(name, level, healthPoints, food, sound, "water");
    }

    @Override
    public List<String> getAttacks() {
        return null;
    }

    public void surf(Pokemon pokemon, Pokemon gymPokemon) {
    }

    public void hydroPump(Pokemon pokemon, Pokemon gymPokemon) {
    }

    public void hydroCanon(Pokemon pokemon, Pokemon gymPokemon) {
    }

    public void rainDance(Pokemon pokemon, Pokemon gymPokemon) {
    }
}
