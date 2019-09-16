package L3.Context;

import java.util.HashMap;
import java.util.Map;

public enum State {
    STATE(""," ");

    State(String...state){

    }
    private Map<String, State> map = new HashMap<>();
}
