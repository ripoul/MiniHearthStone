package card.minion;

/**
 * 
 * @author gguillet lbrisjules
 * 
 * Concrete object Minion SanglierBrocheroc
 *
 */

public class SanglierBrocheroc extends Minion {

	 /**
	 * SanglierBrocheroc constructor
	 */
	public SanglierBrocheroc() {
		super("SanglierBrocheroc", 1, 1, 1);
	}

	/**
	* @return a new SanglierBrocheroc
	*/
	public static Minion createSanglierBrocheroc(){
	  return new SanglierBrocheroc();
	}

}
