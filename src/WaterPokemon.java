import java.util.Arrays;
import java.util.List;

public class WaterPokemon extends Pokemon{
    public WaterPokemon(String name, int level, int healthPoints, String food, String sound) {
        super(name, level, healthPoints, food, sound, "water");
    }
    List<String> attacks = Arrays.asList("surf", "hydroPump", "rainDance", "hydroCanon");
    @Override
    public List<String> getAttacks() {
        return attacks;
    }

    public void surf(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + " attacks " + gymPokemon.getName() + " with surf.");

        int damage = (int) (Math.random()*(50 - 30) + 30);
        System.out.println(damage + "Is het getal");
        switch (gymPokemon.getType()) {

            case ("grass"): {
                damage = (int) (damage * 1.5);
                Math.round(damage);
                System.out.println(gymPokemon.getName() + " loses " + damage + "hp");
                gymPokemon.setHp(getHp() - damage);
                System.out.println(gymPokemon.getName() + " has " + gymPokemon.getHp() + "hp left");
                break;
            }
            case ("water"): {
                Math.round(damage);
                System.out.println(gymPokemon.getName() + " loses " + damage + "hp");
                gymPokemon.setHp(getHp() - damage);
                System.out.println(gymPokemon.getName() + " has " + gymPokemon.getHp() + "hp left");
                break;
            }
            case ("electric"): {
                damage =(int) (damage *0.75);
                Math.round(damage);
                System.out.println(gymPokemon.getName() + " loses " + damage + "hp");
                gymPokemon.setHp(getHp() - damage);
                System.out.println(gymPokemon.getName() + " has " + gymPokemon.getHp() + "hp left");
                break;
            }
            case ("fire"): {
                damage =(int)(damage * 0.5);
                Math.round(damage);
                System.out.println(gymPokemon.getName() + " loses " + damage + "hp");
                gymPokemon.setHp(getHp() - damage);
                System.out.println(gymPokemon.getName() + " has " + gymPokemon.getHp() + "hp left");
                break;
            }
        }
    }

    public void hydroPump(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + " attacks " + gymPokemon.getName() + " with inferno.");

        int damage = (int) Math.random() * (50 - 30);
        switch (gymPokemon.getType()) {

            case ("grass"):
                damage = (damage / 100 * 150);
                Math.round(damage);
                System.out.println(gymPokemon.getName() + " loses " + damage + "hp");
                gymPokemon.setHp(getHp() - damage);
                System.out.println(gymPokemon.getName() + " has " + gymPokemon.getHp() + "hp left");

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

    public void hydroCanon(Pokemon pokemon, Pokemon gymPokemon) {
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

    public void rainDance(Pokemon pokemon, Pokemon gymPokemon) {
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
