package Interpreter.Component;

import Interpreter.Utils.Printable;

public abstract class Component implements Printable {
  public Integer EndPostition;

  public Component(Integer EndPosition) {
    this.EndPostition = EndPosition;
  }
}
