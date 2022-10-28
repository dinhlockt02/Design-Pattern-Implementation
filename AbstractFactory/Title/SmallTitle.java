package Title;

public class SmallTitle extends Title {

  public SmallTitle(String value) {
    super(value);
  }

  @Override
  public void display() {
    System.out.print(value.toLowerCase());
  }

}
