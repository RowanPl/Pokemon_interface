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

    public void electroBall(Pokemon pokemon, Pokemon gymPokemon) {
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

    public void thunder(Pokemon pokemon, Pokemon gymPokemon) {
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

    public void voltTackle(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + " attacks " + gymPokemon.getName() + " with inferno.");

        int damage = (int) Math.random() * (50 - 30);
        switch (gymPokemon.getType()) {

            case ("grass"):{
                damage = (damage / 100 * 150);
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
