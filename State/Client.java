import MyGameStateImpl.Engaging;
import MyGameStateImpl.SettingCharacteristics;
import MyGameStateImpl.SettingUp;
import MyGameStateImpl.Waiting;

/**
 * Client
 */
public class Client {

  public static void main(String[] args) {
    MyGame myGame = new MyGame();

    System.out.println("Setting Up...");
    myGame.setGameState(new SettingUp());
    myGame.setCharacteristics();

    System.out.println("Close Setting Characteristics...");
    myGame.closeSetCharacteristicsWindow();

    System.out.println("Move to Waiting...");
    myGame.setGameState(new Waiting());
    myGame.setCharacteristics();

    System.out.println("Close Setting Characteristics...");
    myGame.closeSetCharacteristicsWindow();

    System.out.println("Engaging with another NPC...");
    myGame.setGameState(new Engaging());
    myGame.setCharacteristics();
  }
}