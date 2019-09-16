package L3.Structure;

import L3.Structure.locations.Location;
import L3.Structure.locations.Manager;
import L3.Structure.utils.Keys;

public class Main {
    public static void main(String[] args) {
        Manager manager = new MyManager();
        Location home = manager.getHome(Keys.Locations.HOME);
        while (true){
            home.move();
        }

    }
}
