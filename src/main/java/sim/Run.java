package sim;

public class Run {
    public static void main(String[] args) {
      double games = 50000;
      Stats.games = (int) games;
      Stats.roundsPerGame = new int[(int) games];

      for (int i = 0; i < games; i++) {
        new Game().begin();
      }

      System.out.println("Beowulf wins: " + Stats.beowulfWins + "    Grendel wins:" + Stats.grendelWins);
      System.out.println((double) Stats.beowulfWins / Stats.grendelWins);
      System.out.println("Average Soldiers Gained: " + Stats.soldiersGained/games);
      System.out.println("Average Rounds Per Game: " + Stats.totalRounds/games);
      System.out.println("All Defenses Destroyed: " + 100 * Stats.allDefensesDestroyed/games + "%");
      System.out.println("Average Defenses Destroyed: " + Stats.totalDefensesDestroyed/games);
      System.out.println("HP Limit Reached: " + Stats.reachedHpCap);
    }
}
