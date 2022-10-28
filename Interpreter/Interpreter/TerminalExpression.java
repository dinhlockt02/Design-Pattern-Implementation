package Interpreter;

import Interpreter.Component.Component;
import Interpreter.Exception.SyntaxException;

public class TerminalExpression extends AbstractExpression {
  public Component interpret(String raw) throws SyntaxException {
    return super.interpret(raw);
  }
}
