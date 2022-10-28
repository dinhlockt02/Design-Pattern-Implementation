package Title;

import Utils.Displayable;

public abstract class Title implements Displayable {
  protected String value;

  protected Title(String value) {
    this.value = value;
  }

  public String getValue() {
    return this.value;
  }
}
