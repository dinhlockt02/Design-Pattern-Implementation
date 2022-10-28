import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

import Interpreter.Component.Component;
import Interpreter.Expression.FileExpression;

/**
 * Client
 */
public class Client {
  public static void main(String[] args) {
    try {
      Path path = Paths.get("example.txt");
      Component component = (new FileExpression()).interpretFile(path);
      component.print(0);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}