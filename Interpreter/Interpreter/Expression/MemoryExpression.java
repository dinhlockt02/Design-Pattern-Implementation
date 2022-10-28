package Interpreter.Expression;

import Interpreter.Component.Component;
import Interpreter.Exception.SyntaxException;

public class MemoryExpression extends AbstractExpression {
  public Component interpret() throws SyntaxException {
    return super.interpret("{{ (10 20)} (30 40)}");
  }
}
