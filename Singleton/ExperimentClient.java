public class ExperimentClient {
  public static void main(String[] args) {
    highlightAction("Get experiment");
    Experiment.getExperiment();

    highlightAction("Get Report result");
    getReportResult();

    highlightAction("Get experiment again");
    Experiment.getExperiment();

    highlightAction("Is the same object?");
    boolean isTheSame = Experiment.getExperiment() == Experiment.getExperiment();
    System.out.println("Is the same object: " + isTheSame);

  }

  public static void getReportResult() {
    Experiment e = Experiment.getExperiment();
    e.reportResults();
  }

  public static void highlightAction(String actString) {
    System.out.println("----------------");
    System.out.println(actString);
  }
}
