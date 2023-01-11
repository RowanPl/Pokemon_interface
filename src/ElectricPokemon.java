import java.util.List;

public class ElectricPokemon extends Pokemon{
    public ElectricPokemon(String name, int level, int healthPoints, String food, String sound) {
        super(name, level, healthPoints, food, sound, "Electric");
    }

    @Override
    public List<String> getAttacks() {
        return null;
    }

    public void thunderPunch(Pokemon pokemon, Pokemon gymPokemon) {
    }

    public void electroBall(Pokemon pokemon, Pokemon gymPokemon) {
    }

    public void thunder(Pokemon pokemon, Pokemon gymPokemon) {
    }

    public void voltTackle(Pokemon pokemon, Pokemon gymPokemon) {
    }
}
