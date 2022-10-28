package Interpreter;

import java.util.List;
import java.util.Stack;

import Interpreter.Component.Component;
import Interpreter.Component.Computer;
import Interpreter.Component.NetSystem;
import Interpreter.Exception.SyntaxException;

public abstract class AbstractExpression {

  public Component interpret(String s) throws SyntaxException {
    return interpret(s.trim(), 0);
  }

  public Component interpret(String s, Integer position) throws SyntaxException {

    if (s.charAt(position) == '{') {
      NetSystem netSystem = new NetSystem(-1);
      while (s.charAt(position) != '}') {
        position++;
        if (s.charAt(position) == '{') {
          Component tempComp = interpret(s, position);
          netSystem.AddToList(tempComp);
          position = tempComp.EndPostition + 1;
        } else if (s.charAt(position) == '(') {
          int tempPos = position + 1;
          char tempChar = s.charAt(tempPos);
          while (Character.compare(tempChar, '{') != 0 && Character.compare(tempChar, '}') != 0
              && Character.compare(tempChar, '(') != 0
              && Character.compare(tempChar, ')') != 0) {
            tempChar = s.charAt(++tempPos);
          }

          if (s.charAt(tempPos) != ')')
            throw new SyntaxException();
          Computer computer = interpretComputer(s, position, tempPos);
          position = computer.EndPostition;
          netSystem.AddToList(computer);
        }
      }
      netSystem.EndPostition = position;
      return netSystem;
    }

    return null;
  }

  public Computer interpretComputer(String s, Integer start, Integer end)
      throws SyntaxException, NumberFormatException {
    String[] splited = s.substring(start + 1, end).trim().split(" +");
    if (splited.length != 2) {
      throw new SyntaxException();
    }
    return new Computer(Integer.parseInt(splited[0]), Integer.parseInt(splited[1]), end);
  }

}
