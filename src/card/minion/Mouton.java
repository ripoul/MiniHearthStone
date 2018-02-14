package card.minion;

/**
 * 
 * @author gguillet lbrisjules
 * 
 * Concrete object Minion Mouton
 *
 */

public class Mouton extends Minion {

	 /**
	 * Mouton constructor
	 */
	public Mouton() {
		super("Mouton", 1, 1, 0);
	}
	
	/**
	* @return a new Mouton
	*/
	public static Minion createMouton(){
		return new Mouton();
	}
}
