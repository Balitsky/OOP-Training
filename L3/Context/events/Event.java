package L3.Context.events;

public interface Event {
    String directionInfo();
    Event getNextEvent(int i);
}
