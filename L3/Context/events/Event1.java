package L3.Context.events;

public class Event1 implements Event {
    @Override
    public String directionInfo() {
        return "1 - Event2\n2 - Event3";
    }

    @Override
    public Event getNextEvent(int i) {

        switch (i){
            case 1: return new Event2();
            case 2: return new Event3();
        }
        return null;
    }
}
