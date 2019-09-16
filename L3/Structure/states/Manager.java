package L3.Structure.states;

import java.util.HashMap;
import java.util.Map;

abstract class Manager {
    private final Map<String, Location> instance;


    public Manager() {
        instance = new HashMap<String, Location>();

        Provider provider = new Provider();
        registerLocations(provider);
    }

    abstract void registerLocations(Provider provider);

    private class Provider {
        public void register(Class<? extends Location> location, String key) {
            try {
                instance.put(key, location.newInstance());
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }

        public void registerDirection(Class<? extends Location> location, String...keys){
            Location current = instance.
        }
    }
}
