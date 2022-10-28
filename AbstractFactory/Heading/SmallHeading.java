package Heading;

public class SmallHeading extends Heading {

  public SmallHeading(String value, Integer section) {
    super(value, section);
  }

  @Override
  public void display() {
    System.out.println(value.toLowerCase());
  }

}
