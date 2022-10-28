import java.util.Scanner;

/**
 * Client
 */
public class Client {

  public static void main(String[] args) {
    MutualFund hiGrowthFund = new MutualFund(3, 400.0f, "Hi growth Fund");
    MutualFund mediumTermFund = new MutualFund(2, 300.0f, "Med growth Fund");
    MutualFund longTermFund = new MutualFund(1, 200.0f, "Low growth Fund");

    hiGrowthFund.Note();
    mediumTermFund.Note();
    longTermFund.Note();

    AwesomeInc awesomeInc = new AwesomeInc();

    awesomeInc.addObserver(longTermFund);
    awesomeInc.addObserver(hiGrowthFund);
    awesomeInc.addObserver(mediumTermFund);

    Scanner sc = new Scanner(System.in);

    do {
      System.out.print("Enter 'quit': Any other input to continue: ");

      String input = sc.nextLine();
      if (input.equalsIgnoreCase("quit")) {
        break;
      }
      System.out.print("Enter the current price of Awesome Inc. in decimal form: ");
      Float inputFloat = sc.nextFloat();
      if (sc.hasNextLine())
        sc.nextLine();
      awesomeInc.changePrice(inputFloat);
    } while (true);
  }
}