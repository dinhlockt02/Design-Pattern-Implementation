package Style;

import Heading.Heading;
import Heading.SmallHeading;
import Title.SmallTitle;
import Title.Title;

public class SmallStyleFactory extends StyleFactory {

  @Override
  public Heading getAHeading(String headingString, int section) {
    return new SmallHeading(headingString, section);
  }

  @Override
  public Title getATitle(String titleString) {
    return new SmallTitle(titleString);
  }

}
