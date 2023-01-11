import java.util.List;

public abstract class Pokemon {
    private final String name;
    private final int level;
    private int hp;
    private final String food;
    private final String sound;
    private final String type;

    public Pokemon(String name, int level, int healthPoints, String food, String sound, String type) {
        this.name = name;
        this.level = level;
        this.type = type;
        this.food = food;
        this.sound = sound;
        this.hp = healthPoints;
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public String getType() {
        return type;
    }

    public int getLevel() {
        return level;
    }

    public String getFood() {
        return food;
    }

    public String getSound() {
        return sound;
    }


    public abstract List<String> getAttacks();
}

