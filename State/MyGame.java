import MyGameStateImpl.MyGameState;
import MyGameStateImpl.SettingCharacteristics;

public class MyGame {

  private MyGameState prevState;

  private MyGameState state;

  public void setGameState(MyGameState state) {
    if (this.state instanceof SettingCharacteristics) {
      System.out.println("Please close setting characteristics window first");
      return;
    }
    this.prevState = this.state;
    this.state = state;
  }

  public void setCharacteristics() {
    if (state.handleClick()) {
      setGameState(new SettingCharacteristics());
    }
  }

  public void closeSetCharacteristicsWindow() {
    if (state.closeSetCharacteristicsWindow()) {
      this.state = this.prevState;
    }
  }
}
