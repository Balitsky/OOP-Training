package L1.Pirate.logic;

public class Pirate {
    private String name;
    private String runk;
    private int weight;

    public Pirate(String name, String runk){
        this.name = name;
        this.runk = runk;
        weight = (int) (Math.random()*60+60);

    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return name + " - " + runk;

    }
}
