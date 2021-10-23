public class Run {
    public static void main(String[] args) {
      int games = 100;
      Stats.games = games;

      for (int i = 0; i < games; i++) {
        new Game().begin();
      }

      System.out.println((double) Stats.beowulfWins / Stats.grendelWins);
    }
}
