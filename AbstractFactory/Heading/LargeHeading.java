package Heading;

/**
 * LargeHeading
 */
public class LargeHeading extends Heading {

  public LargeHeading(String value, Integer section) {
    super(value, section);
  }

  @Override
  public void display() {
    System.out.printf("Section %s. --- %s ---", section, value.toUpperCase());
    System.out.println();
  }

}