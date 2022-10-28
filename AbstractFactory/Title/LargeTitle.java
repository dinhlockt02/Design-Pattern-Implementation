package Title;

/**
 * LargeTitle
 */
public class LargeTitle extends Title {

  public LargeTitle(String value) {
    super(value);
  }

  @Override
  public void display() {
    System.out.printf("\t %s \t", value.toUpperCase());
  }

}