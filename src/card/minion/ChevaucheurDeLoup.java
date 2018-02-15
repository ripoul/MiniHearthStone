package card.minion;

/**
 * 
 * @author gguillet lbrisjules
 * 
 * Concrete object Minion ChevaucheurDeLoup
 *
 */

import card.minion.decorator.MinionChargeDecorator;

public class ChevaucheurDeLoup extends Minion {

  /**
  * ChevaucheurDeLoup constructor
  */
  public ChevaucheurDeLoup() {
	  super("ChevaucheurDeLoup", 3, 1, 3);
  }

  /**
  * @return a new ChevaucheurDeLoup
  */
  public static Minion createChevaucheurDeLoup(){
	  return new MinionChargeDecorator(new ChevaucheurDeLoup());
  }

}
