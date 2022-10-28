package Interpreter.Component;

public class Computer extends Component {
  private Integer ram;
  private Integer cpu;

  public Computer(Integer ram, Integer cpu, Integer EndPosition) {
    super(EndPosition);
    this.ram = ram;
    this.cpu = cpu;
  }

  @Override
  public void print(Integer depth) {
    for (int i = 0; i < depth; i++) {
      System.out.print("--");
    }
    System.out.printf(" This computer has %s RAM and %s CPU\n", this.ram, this.cpu);
  }
}
