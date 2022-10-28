package Text;

import Utils.Displayable;

public class Text implements Displayable {

  private String value;

  public Text(String value) {
    this.value = value;
  }

  @Override
  public void display() {
    System.out.println(value);
  }

}
