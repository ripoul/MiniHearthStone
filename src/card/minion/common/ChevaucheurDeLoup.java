package card.minion.common;

import card.minion.Minion;
import card.minion.MinionChargeDecorator;

public class ChevaucheurDeLoup extends Minion {

  public ChevaucheurDeLoup() {
    super("ChevaucheurDeLoup", 3, 1, 3);
  }

  public static Minion createChevaucheurDeLoup(){
		return new MinionChargeDecorator(new ChevaucheurDeLoup());
	}

}
