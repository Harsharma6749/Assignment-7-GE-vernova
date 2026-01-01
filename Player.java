import java.util.LinkedList;
import java.util.Queue;

public class Player {
    String name;
    Queue<String> cards = new LinkedList<>();

    void addcard(String card) {
        cards.add(card);
    }

    void showcards() {
        System.out.println(name + " cards : ");
        for (String c : cards) {
            System.out.println(c);
        }
        System.out.println();
    }
}
