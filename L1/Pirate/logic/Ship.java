package L1.Pirate.logic;

import java.util.Arrays;

public class Ship {
    private Pirate cap;
    private Pirate[] pirates;
    private int gold;
    private String name;
    private int capacity;


    public Ship(String name){
        this.name = name;
        capacity = 250;
    }

    public void setCap(Pirate cap) {
        this.cap = cap;
    }

    public void setPirates(Pirate[] pirates) {
        this.pirates = pirates;
    }

    public Pirate getCap() {
        return cap;
    }

    public Pirate[] getPirates() {
        return pirates;
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public int getCapacity() {
        return capacity;
    }

    public void info() {
        System.out.println("---------------");
        System.out.println("Ship: " + this);
        System.out.println("max" + capacity);
        System.out.println("cap: " + cap);
        System.out.println("pirates: ");
        System.out.println(Arrays.toString(pirates));
        System.out.println();
        System.out.println("Gold: " + gold);
        System.out.println("---------------");
    }

    @Override
    public String toString() {
        return name;
    }
}
