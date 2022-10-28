package MyGameStateImpl;

public class Engaging extends MyGameState {

  @Override
  public boolean handleClick() {
    System.out.println("Please wait until user stop engaging");
    return false;
  }

  @Override
  public boolean closeSetCharacteristicsWindow() {
    System.out.println("Characteristics Window has not been open");
    return false;
  }

}
