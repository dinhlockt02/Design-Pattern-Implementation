package Interpreter.Expression;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

import Interpreter.Component.Component;
import Interpreter.Exception.SyntaxException;

public class FileExpression extends AbstractExpression {
  public Component interpretFile(Path path) throws SyntaxException, IOException {
    String content = Files.readString(path);
    return super.interpret(content);
  }
}
