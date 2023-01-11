import java.util.Arrays;
import java.util.List;

public class GrassPokemon extends Pokemon{
    public GrassPokemon(String name, int level, int healthPoints, String food, String sound) {
        super(name, level, healthPoints, food, sound, "grass");
    }

    List<String> attacks = Arrays.asList("leafStorm", "solarBeam", "leechSeed", "leaveBlade");

    @Override
    public List<String> getAttacks() {
        return attacks;
    }

    public void leafStorm(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + " attacks " + gymPokemon.getName() + " with inferno.");

        int damage = (int) Math.random() * (50 - 30);
        switch (gymPokemon.getType()) {

            case ("grass"):
                damage = (damage / 100 * 150);
                Math.round(damage);
                System.out.println(gymPokemon.getName() + " loses " + damage + "hp");
                gymPokemon.setHp(getHp() - damage);
                System.out.println(gymPokemon.getName() + " has " + gymPokemon.getHp() + "hp left");
                break;

            case ("water"): {
                Math.round(damage);
                System.out.println(gymPokemon.getName() + " loses " + damage + "hp");
                gymPokemon.setHp(getHp() - damage);
                System.out.println(gymPokemon.getName() + " has " + gymPokemon.getHp() + "hp left");
                break;
            }
            case ("electric"): {
                damage = (damage / 100 * 75);
                Math.round(damage);
                System.out.println(gymPokemon.getName() + " loses " + damage + "hp");
                gymPokemon.setHp(getHp() - damage);
                System.out.println(gymPokemon.getName() + " has " + gymPokemon.getHp() + "hp left");
                break;
            }
            case ("fire"): {
                damage = (damage / 100 * 50);
                Math.round(damage);
                System.out.println(gymPokemon.getName() + " loses " + damage + "hp");
                gymPokemon.setHp(getHp() - damage);
                System.out.println(gymPokemon.getName() + " has " + gymPokemon.getHp() + "hp left");
                break;
            }
        }
    }


    public void solarBeam(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + " attacks " + gymPokemon.getName() + " with inferno.");

        int damage = (int) Math.random() * (50 - 30);
        switch (gymPokemon.getType()) {

            case ("grass"):
                damage = (damage / 100 * 150);
                Math.round(damage);
                System.out.println(gymPokemon.getName() + " loses " + damage + "hp");
                gymPokemon.setHp(getHp() - damage);
                System.out.println(gymPokemon.getName() + " has " + gymPokemon.getHp() + "hp left");
                break;

            case ("water"): {
                Math.round(damage);
                System.out.println(gymPokemon.getName() + " loses " + damage + "hp");
                gymPokemon.setHp(getHp() - damage);
                System.out.println(gymPokemon.getName() + " has " + gymPokemon.getHp() + "hp left");
                break;
            }
            case ("electric"): {
                damage = (damage / 100 * 75);
                Math.round(damage);
                System.out.println(gymPokemon.getName() + " loses " + damage + "hp");
                gymPokemon.setHp(getHp() - damage);
                System.out.println(gymPokemon.getName() + " has " + gymPokemon.getHp() + "hp left");
                break;
            }
            case ("fire"): {
                damage = (damage / 100 * 50);
                Math.round(damage);
                System.out.println(gymPokemon.getName() + " loses " + damage + "hp");
                gymPokemon.setHp(getHp() - damage);
                System.out.println(gymPokemon.getName() + " has " + gymPokemon.getHp() + "hp left");
                break;
            }
        }
    }


    public void leechSeed(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + " attacks " + gymPokemon.getName() + " with inferno.");

        int damage = (int) Math.random() * (50 - 30);
        switch (gymPokemon.getType()) {

            case ("grass"):
                damage = (damage / 100 * 150);
                Math.round(damage);
                System.out.println(gymPokemon.getName() + " loses " + damage + "hp");
                gymPokemon.setHp(getHp() - damage);
                System.out.println(gymPokemon.getName() + " has " + gymPokemon.getHp() + "hp left");
                break;

            case ("water"): {
                Math.round(damage);
                System.out.println(gymPokemon.getName() + " loses " + damage + "hp");
                gymPokemon.setHp(getHp() - damage);
                System.out.println(gymPokemon.getName() + " has " + gymPokemon.getHp() + "hp left");
                break;
            }
            case ("electric"): {
                damage = (damage / 100 * 75);
                Math.round(damage);
                System.out.println(gymPokemon.getName() + " loses " + damage + "hp");
                gymPokemon.setHp(getHp() - damage);
                System.out.println(gymPokemon.getName() + " has " + gymPokemon.getHp() + "hp left");
                break;
            }

            case ("fire"): {
                damage = (damage / 100 * 50);
                Math.round(damage);
                System.out.println(gymPokemon.getName() + " loses " + damage + "hp");
                gymPokemon.setHp(getHp() - damage);
                System.out.println(gymPokemon.getName() + " has " + gymPokemon.getHp() + "hp left");
                break;
            }
        }
    }

    public void leaveBlade(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + " attacks " + gymPokemon.getName() + " with inferno.");

        int damage = (int) Math.random() * (50 - 30);
        switch (gymPokemon.getType()) {

            case ("grass"):
                damage = (damage / 100 * 150);
                Math.round(damage);
                System.out.println(gymPokemon.getName() + " loses " + damage + "hp");
                gymPokemon.setHp(getHp() - damage);
                System.out.println(gymPokemon.getName() + " has " + gymPokemon.getHp() + "hp left");
                break;

            case ("water"): {
                Math.round(damage);
                System.out.println(gymPokemon.getName() + " loses " + damage + "hp");
                gymPokemon.setHp(getHp() - damage);
                System.out.println(gymPokemon.getName() + " has " + gymPokemon.getHp() + "hp left");
                break;
            }
            case ("electric"): {
                damage = (damage / 100 * 75);
                Math.round(damage);
                System.out.println(gymPokemon.getName() + " loses " + damage + "hp");
                gymPokemon.setHp(getHp() - damage);
                System.out.println(gymPokemon.getName() + " has " + gymPokemon.getHp() + "hp left");
                break;
            }
            case ("fire"): {
                damage = (damage / 100 * 50);
                Math.round(damage);
                System.out.println(gymPokemon.getName() + " loses " + damage + "hp");
                gymPokemon.setHp(getHp() - damage);
                System.out.println(gymPokemon.getName() + " has " + gymPokemon.getHp() + "hp left");
                break;
            }
        }
    }
}
