public class FinancialAdapter extends Financial {

  private LegacySystem legacySystem;

  public FinancialAdapter(LegacySystem legacySystem) {
    this.legacySystem = legacySystem;
  }

  @Override
  public int amount() {
    try {
      return legacySystem.Principle();
    } catch (Exception e) {
      System.out.println("CALCULATE FAILED");
      return 0;
    }
  }

}
