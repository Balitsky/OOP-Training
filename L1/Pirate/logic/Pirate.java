package L1.Pirate.logic;

public class Pirate {
    private String name;
    Pirate(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
