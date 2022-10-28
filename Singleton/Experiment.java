/**
 * Singleton
 */
public class Experiment {

  private int referencedTimes;

  private static Experiment theExperiment;

  private Experiment() {
    this.referencedTimes = 0;
  }

  public void reportResults() {
    System.out.println("The analysis shows that the experiment was a resounding success");
  }

  public static Experiment getExperiment() {
    if (theExperiment == null) {
      theExperiment = new Experiment();
    }
    System.out
        .println(String.format("Noting that the Experiment singleton referenced %s", ++theExperiment.referencedTimes));
    return theExperiment;
  }
}