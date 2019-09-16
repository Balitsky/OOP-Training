package L1.Pirate.logic;

public class Bar {
    public Pirate gatCap() {
        return new Pirate("Vasia","cap");
    }

    public Pirate[] getPirates() {
        Pirate[] pirates = new Pirate[7];
        pirates[0] = new Pirate("p1","matros");
        pirates[1] = new Pirate("p2","matros");
        pirates[2] = new Pirate("p3","botsman");
        pirates[3] = new Pirate("p4","younga");
        pirates[4] = new Pirate("p5","coock");
        pirates[5] = new Pirate("p6","shkiper");
        pirates[6] = new Pirate("p7","baba na korable!!");
        return pirates;

    }
}
