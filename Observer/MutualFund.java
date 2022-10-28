
public class MutualFund implements Observer {

  private Integer sharesOfAwesome;

  private Float nonAwesomeHolding;

  protected String FundName;

  public MutualFund(Integer sharesOfAwesome, Float nonAwesomeHolding, String FundName) {
    this.sharesOfAwesome = sharesOfAwesome;
    this.nonAwesomeHolding = nonAwesomeHolding;
    this.FundName = FundName;
  }

  public void Note() {
    System.out.printf(
        "Note: %s starts with %s shares of Awesome, assumes price of 1.0, and has non-Awesome holdings totalling %s\n",
        FundName, sharesOfAwesome, nonAwesomeHolding);
  }

  @Override
  public void update(Observable observable) {
    System.out.printf("Value of %s changed from %s to %s\n", FundName,
        nonAwesomeHolding + sharesOfAwesome * ((AwesomeInc) observable).getPrevPrice(),
        nonAwesomeHolding + sharesOfAwesome * ((AwesomeInc) observable).getPrice());
  }
}
