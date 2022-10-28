import Heading.Heading;

public class DocumentDetail {
  private String heading;
  private String text;

  public DocumentDetail(String heading, String text) {
    this.heading = heading;
    this.text = text;
  }

  public String getHeading() {
    return heading;
  }

  public String getText() {
    return text;
  }
}
