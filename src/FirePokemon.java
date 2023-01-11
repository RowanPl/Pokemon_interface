import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class FirePokemon extends Pokemon {
    List<String> attacks = Arrays.asList("inferno", "pyroBall", "fireLash", "flameThrower");

    public FirePokemon(String name, int level, int healthPoints, String food, String sound) {
        super(name, level, healthPoints, food, sound, "fire");
    }

    public void inferno(Pokemon pokemon, Pokemon gymPokemon) {
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
            }
            case ("electric"): {
                damage = (damage / 100 * 75);
                Math.round(damage);
                System.out.println(gymPokemon.getName() + " loses " + damage + "hp");
                gymPokemon.setHp(getHp() - damage);
                System.out.println(gymPokemon.getName() + " has " + gymPokemon.getHp() + "hp left");
            }
            case ("fire"): {
                damage = (damage / 100 * 50);
                Math.round(damage);
                System.out.println(gymPokemon.getName() + " loses " + damage + "hp");
                gymPokemon.setHp(getHp() - damage);
                System.out.println(gymPokemon.getName() + " has " + gymPokemon.getHp() + "hp left");
            }
        }
    }

    public void flameThrower(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + " attacks " + gymPokemon.getName() + " with flamethrower.");
        int damage = (int) Math.random() * (40 - 25);
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
            }
            case ("electric"): {
                damage = (damage / 100 * 75);
                Math.round(damage);
                System.out.println(gymPokemon.getName() + " loses " + damage + "hp");
                gymPokemon.setHp(getHp() - damage);
                System.out.println(gymPokemon.getName() + " has " + gymPokemon.getHp() + "hp left");
            }
            case ("fire"): {
                damage = (damage / 100 * 50);
                Math.round(damage);
                System.out.println(gymPokemon.getName() + " loses " + damage + "hp");
                gymPokemon.setHp(getHp() - damage);
                System.out.println(gymPokemon.getName() + " has " + gymPokemon.getHp() + "hp left");
            }
        }
    }

        public void fireLash(Pokemon pokemon, Pokemon gymPokemon){
            System.out.println(pokemon.getName() + " attacks " + gymPokemon.getName() + " with firelash.");
            int damage = (int) Math.random() * (60 - 10);
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
                }
                case ("electric"): {
                    damage = (damage / 100 * 75);
                    Math.round(damage);
                    System.out.println(gymPokemon.getName() + " loses " + damage + "hp");
                    gymPokemon.setHp(getHp() - damage);
                    System.out.println(gymPokemon.getName() + " has " + gymPokemon.getHp() + "hp left");
                }
                case ("fire"): {
                    damage = (damage / 100 * 50);
                    Math.round(damage);
                    System.out.println(gymPokemon.getName() + " loses " + damage + "hp");
                    gymPokemon.setHp(getHp() - damage);
                    System.out.println(gymPokemon.getName() + " has " + gymPokemon.getHp() + "hp left");
                }
            }
        }

        public void pyroBall(Pokemon pokemon, Pokemon gymPokemon){
            System.out.println(pokemon.getName() + " attacks " + gymPokemon.getName() + " with pyroball.");
            int damage = (int) Math.random() * (30 - 25);
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
                }
                case ("electric"): {
                    damage = (damage / 100 * 75);
                    Math.round(damage);
                    System.out.println(gymPokemon.getName() + " loses " + damage + "hp");
                    gymPokemon.setHp(getHp() - damage);
                    System.out.println(gymPokemon.getName() + " has " + gymPokemon.getHp() + "hp left");
                }
                case ("fire"): {
                    damage = (damage / 100 * 50);
                    Math.round(damage);
                    System.out.println(gymPokemon.getName() + " loses " + damage + "hp");
                    gymPokemon.setHp(getHp() - damage);
                    System.out.println(gymPokemon.getName() + " has " + gymPokemon.getHp() + "hp left");
                }
            }
        }

        @Override
        public List<String> getAttacks () {
            return attacks;
        }




    }