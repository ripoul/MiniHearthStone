package card.minion.common;

import card.minion.Minion;

public class YetiNoroit extends Minion {

  public YetiNoroit() {
    super("YetiNoroit", 4, 5, 4);
  }

  public static Minion createYetiNoroit(){
		return new YetiNoroit();
	}

}
