import java.util.Scanner;

/**
 * Application
 */
public class Application {
  public static void main(String[] args) {

    // Setup

    Scanner sc = new Scanner(System.in);
    Document doc = new Document(null);
    Client client = new Client(doc);

    // Create document

    String title;
    System.out.print("Enter title: ");
    title = sc.nextLine();
    doc.setTitle(title);
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
      doc.setDocumentDetails(heading, text);
    } while (true);

    // Print
    String style;
    do {
      System.out.print("Enter style [small, large] or --done: ");
      style = sc.nextLine();
      if (style.equals("--done")) {
        break;
      }
      client.getStyleFromUser(style);
      client.displayDocument();
    } while (true);
  }
}
