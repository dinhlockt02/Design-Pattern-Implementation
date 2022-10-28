
import java.util.Scanner;

import Document.Document;
import Style.LargeStyleFactory;
import Style.SmallStyleFactory;

public class Client {

  private Document document;

  public Client() {
    this.document = new Document(null);
  }

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

  public void getUserInput() {
    Scanner sc = new Scanner(System.in);
    String title;
    System.out.print("Enter title: ");
    title = sc.nextLine();
    document.setTitle(title);
    String heading;
    String text;
    do {
      System.out.print("Enter heading or --done: ");
      heading = sc.nextLine();
      if (heading.equalsIgnoreCase("--done")) {
        break;
      }
      System.out.print("Enter text: ");
      text = sc.nextLine();
      document.setDocumentDetails(heading, text);
    } while (true);
  }

  public void print() {
    Scanner sc = new Scanner(System.in);
    String style;
    do {
      System.out.print("Enter style [small, large] or --done: ");
      style = sc.nextLine();
      if (style.equals("--done")) {
        break;
      }
      getStyleFromUser(style);
      displayDocument();
    } while (true);
  }
}
