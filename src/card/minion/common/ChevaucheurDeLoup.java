package card.minion.common;

public class ChevaucheurDeLoup extends Minion {

  public ChevaucheurDeLoup() {
    super("ChevaucheurDeLoup", 3, 1, 3)
  }

  public static Minion createChevaucheurDeLoup(){
		return new MinionChargeDecorator(new ChevaucheurDeLoup());
	}

}
