/**
 * Client
 */
public class Client {

  public static void main(String[] args) {
    LegacySystem legacySystem = new LegacySystem();
    Financial financial = new FinancialAdapter(legacySystem);
    System.out.println("Calling Financial.amount() ...");
    int result = financial.amount();
    System.out.printf("The result of Financial.amount() is %s\n", result);
  }
}