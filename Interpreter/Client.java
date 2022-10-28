import Interpreter.MemoryExpression;
import Interpreter.TerminalExpression;
import Interpreter.Component.Component;

/**
 * Client
 */
public class Client {
  public static void main(String[] args) {
    try {
      Component result = (new TerminalExpression()).interpret(args[0]);
      result.print(0);
    } catch (Exception e) {
      System.out.print("Syntax error");
    }
  }
}