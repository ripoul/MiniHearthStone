package card.minion;

import card.minion.decorator.MinionTauntDecorator;

/**
 * 
 * @author gguillet lbrisjules
 * 
 * Concrete object Minion AvocatCommisDOffice
 *
 */

public class AvocatCommisDOffice extends Minion {
	
	/**
	 * AvocatCommisDOffice constructor
	 */
	public AvocatCommisDOffice() {
		super("AvocatCommisDOffice", 0, 7, 2);
	}

	/**
	 * @return a new AvocatCommisDOffice
	 */
	public static Minion createAvocatCommisDOffice(){
		return new MinionTauntDecorator(new AvocatCommisDOffice());
	}

}
