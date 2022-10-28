import java.util.ArrayList;
import java.util.List;

import Style.SmallStyleFactory;
import Style.StyleFactory;
import Text.Text;
import Utils.Displayable;

public class Document implements Displayable {

  private StyleFactory styleFactory;
  private String documentTitle;
  private List<DocumentDetail> documentDetails;

  public void setStyleFactory(StyleFactory styleFactory) {
    if (styleFactory.getClass() == this.styleFactory.getClass()) {
      return;
    }
    this.styleFactory = styleFactory;
  }

  public Document(StyleFactory styleFactory) {
    if (styleFactory == null) {
      styleFactory = new SmallStyleFactory();
    }
    this.styleFactory = styleFactory;
    documentDetails = new ArrayList<DocumentDetail>();
  }

  @Override
  public void display() {

    styleFactory.getATitle(documentTitle).display();
    System.out.println();

    for (int i = 0; i < documentDetails.size(); i++) {
      styleFactory.getAHeading(documentDetails.get(i).getHeading(), i).display();
      (new Text(documentDetails.get(i).getText())).display();
    }
  }

  public void setTitle(String title) {
    this.documentTitle = title;
  }

  public void setDocumentDetails(String heading, String text) {
    this.documentDetails.add(new DocumentDetail(heading, text));
  }
}
