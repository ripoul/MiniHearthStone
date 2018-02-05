package card.minion;

public class YetiNoroit extends Minion {

  public YetiNoroit() {
	  super("YetiNoroit", 4, 5, 4);
  }

  public static Minion createYetiNoroit(){
	  return new YetiNoroit();
  }

}
