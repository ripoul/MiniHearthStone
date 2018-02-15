package card.minion;

/**
 * 
 * @author gguillet lbrisjules
 * 
 * Concrete object Minion YetiNoroit
 *
 */

public class YetiNoroit extends Minion {

	 /**
	 * YetiNoroit constructor
	 */
	public YetiNoroit() {
		super("YetiNoroit", 4, 5, 4);
	}

	/**
	* @return a new YetiNoroit
	*/
  public static Minion createYetiNoroit(){
	  return new YetiNoroit();
  }

}
