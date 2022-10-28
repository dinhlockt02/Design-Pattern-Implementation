package Style;

import Heading.Heading;
import Heading.LargeHeading;
import Title.LargeTitle;
import Title.Title;

public class LargeStyleFactory extends StyleFactory {

  @Override
  public Heading getAHeading(String headingString, int section) {
    return new LargeHeading(headingString, section);
  }

  @Override
  public Title getATitle(String titleString) {
    return new LargeTitle(titleString);
  }

}
