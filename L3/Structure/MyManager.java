package L3.Structure;

import L3.Structure.locations.*;
import static L3.Structure.utils.Keys.Locations.*;

public class MyManager extends Manager {

    @Override
    public void registerLocations(Manager.Provider provider) {
        provider.registerLocations(Home.class, HOME);
        provider.registerLocations(Bight.class, BIGHT);
        provider.registerLocations(Pub.class, PUB);
        provider.registerLocations(OpenSea.class, OPEN_SEA);
    }

    @Override
    public void registerDirections(Manager.Provider provider) {
        provider.registerDirections(HOME, BIGHT, PUB, OPEN_SEA);
        provider.registerDirections(PUB, HOME);
        provider.registerDirections(BIGHT, HOME);
        provider.registerDirections(OPEN_SEA, HOME);
    }
}
