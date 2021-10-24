package players;

import java.util.PriorityQueue;

public class Beowulf {
    public static final int startingSoldiers = 30;

    private int soldiers;
    private PriorityQueue<Integer> cards = new PriorityQueue<>();

    public Beowulf() {
        soldiers = startingSoldiers;
    }
}
