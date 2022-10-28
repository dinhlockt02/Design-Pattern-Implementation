package MyGameStateImpl;

/**
 * SettingCharacteristics
 */
public class SettingCharacteristics extends MyGameState {

  @Override
  public boolean handleClick() {
    System.out.println("Setting Characteristic Window has been open");
    return false;
  }

  @Override
  public boolean closeSetCharacteristicsWindow() {
    System.out.println("Closing Setting Characteristic Window");
    return true;
  }

}