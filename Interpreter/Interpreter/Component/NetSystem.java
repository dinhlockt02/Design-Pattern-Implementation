package Interpreter.Component;

import java.util.ArrayList;

public class NetSystem extends Component {
  private ArrayList<Component> components;

  public NetSystem(Integer EndPosition) {
    super(EndPosition);
    this.components = new ArrayList<>();
  }

  public NetSystem AddToList(Component component) {
    components.add(component);
    return this;
  }

  @Override
  public void print(Integer depth) {
    for (int i = 0; i < depth; i++) {
      System.out.print("--");
    }
    System.out.printf("This net system has %s component, includes: \n", this.components.size());
    for (Component component : components) {
      component.print(depth + 1);
    }
  }
}
