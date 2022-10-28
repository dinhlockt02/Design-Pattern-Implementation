package Heading;

import Utils.Displayable;

public abstract class Heading implements Displayable {
  protected String value;
  protected Integer section;

  protected Heading(String value, Integer section) {
    this.value = value;
    this.section = section;
  }

  public String getValue() {
    return this.value;
  }

  public Integer getSection() {
    return this.section;
  }
}
