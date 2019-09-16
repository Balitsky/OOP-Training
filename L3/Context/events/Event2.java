package L3.Context.events;

public class Event2 implements Event {
    @Override
    public String directionInfo() {
        return "1 - Event1\n2 - Event3";
    }

    @Override
    public Event getNextEvent(int i) {
        switch (i){
            case 1: return new Event1();
            case 2: return new Event3();
        }
        return null;
    }
}
