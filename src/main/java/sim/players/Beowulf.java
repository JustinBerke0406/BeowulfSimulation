package players;

import java.util.PriorityQueue;

public class Beowulf extends Player {
    public static final int startingSoldiers = 30;

    public Beowulf(Game game) {
        super(startingSoldiers, game);
    }

    public Card pickCard() {
      return Card.pickCard(true);
    }

    public void turnAction(Card card, int stack, int damage, Player opponent) {
      stack = Math.min(stack, numberOfCardType(card));

      for (int i = 0; i < stack; i++) {
        removeCard(indexOf(card));

        if (card.equals(Card.GIANTS_SWORD)) damage *= 2;
        else if (card.equals(Card.THREE_SOLDIERS)) {
            if (game.defenses > 0) {
              if (health < 40) {
                health = Math.min(40, health + 3);
              }
              else {
                addCard(card);
              }
            }
        }
      }

      opponent.damageBy(damage);
    }
}
