package MyGameStateImpl;

public class SettingUp extends MyGameState {

  @Override
  public boolean handleClick() {
    System.out.println("Open set characteristic window");
    return true;
  }

  @Override
  public boolean closeSetCharacteristicsWindow() {
    System.out.println("Characteristics Window has not been open");
    return false;
  }

}
