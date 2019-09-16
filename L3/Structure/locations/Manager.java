package L3.Structure.locations;

import java.util.HashMap;
import java.util.Map;

public abstract class Manager {
    private final Map<String, Location> instance;

    public Manager() {
        instance = new HashMap<>();

        Provider provider = new Provider();
        registerLocations(provider);
        registerDirections(provider);
    }

    public Location getHome(String key){
        return instance.get(key);
    }

    public abstract void registerLocations(Provider provider);

    public abstract void registerDirections(Provider provider);

    public class Provider {

        private Provider(){}

        public void registerLocations(Class<? extends Location> location, String key) {
            try {
                instance.put(key, location.newInstance());
            } catch (InstantiationException | IllegalAccessException e) {
                e.printStackTrace();
            }
        }

        public void registerDirections(String location, String...keys){
            Location current = instance.get(location);
            for (String key: keys){
                current.addDirect(key, instance.get(key));
            }
        }
    }
}
