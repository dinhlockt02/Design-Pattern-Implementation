import Style.LargeStyleFactory;
import Style.SmallStyleFactory;

public class Client {

  private Document document;

  public Client(Document document) {
    this.document = document;
  }

  public void getStyleFromUser(String style) {
    if (style.equalsIgnoreCase("small")) {
      document.setStyleFactory(new SmallStyleFactory());
    } else if (style.equalsIgnoreCase("large")) {
      document.setStyleFactory(new LargeStyleFactory());
    }
  }

  public void displayDocument() {
    document.display();
  }
}
