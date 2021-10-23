package sim;

public class Game {
  private int defenses;

  private Beowulf beowulf;
  private Grendel grendel;

  public Game() {
    beowulf = new Beowulf(this);
    grendel = new Grendel(this);

    defenses = 4;
  }

  public void setDefenses(int defenses) {
    this.defenses = defenses;
  }
  
  public int getDefenses() {
    return defenses;
  }

  public void begin() {
    while (!beowulf.isDead() && !grendel.isDead()) {
      beowulf.takeTurn(grendel, beowulf.peekTopCard(), 1);
      grendel.takeTurn(beowulf, grendel.peekTopCard(), 1);
    }

    if (grendel.isDead()) Stats.beowulfWin++;
    else Stats.grendelWin++;
  }
}