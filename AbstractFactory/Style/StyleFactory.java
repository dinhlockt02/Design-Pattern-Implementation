package Style;

import Heading.Heading;
import Title.Title;

public abstract class StyleFactory {
  abstract public Heading getAHeading(String headingString, int section);

  abstract public Title getATitle(String titleString);
}
