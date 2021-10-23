package players;

public class Grendel extends Player {
  public static final int startingHealth = 35;

    public Grendel(Game game) {
        super(startingHealth, game);
    }

    public Card pickCard() {
      return Card.pickCard(false);
    }

    public void turnAction(Card card, int stack, int damage, Player opponent) {
      stack = Math.min(stack, numberOfCardType(card));

      for (int i = 0; i < stack; i++) {
        removeCard(indexOf(card));

        if (card.equals(Card.DOUBLE_DAMAGE)) damage *= 2;
        else if (card.equals(Card.LOSE_DEFENSE)) {
            if (game.defenses > 0) {
              game.defenses--;
            }
        }
      }

      opponent.damageBy(damage);
    }
}
