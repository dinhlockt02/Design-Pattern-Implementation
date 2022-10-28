import java.util.Random;

public class LegacySystem {
  public int Principle() throws InterruptedException {
    System.out.println("---- VERY COMPLEX CALCULATION BY LEGACY SYSTEM ----");
    Thread.sleep(1000);
    System.out.println("---- CALCULATING ----");
    Thread.sleep(1000);
    Random rn = new Random();
    int n = 1000 - 100 + 1;
    int i = rn.nextInt() % n;
    System.out.println("---- LEGACY SYSTEM HAS CALCULATED SUCCESSFUL ----");
    return 100 + i;
  }
}
