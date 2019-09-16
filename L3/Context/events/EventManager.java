package L3.Context.events;

import java.util.Scanner;

public class EventManager {
    public static void main(String[] args) {
        Event home = new Event1();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println(home.directionInfo());
            home = home.getNextEvent(sc.nextInt());
        }
    }
}
