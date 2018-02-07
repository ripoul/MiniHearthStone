package card.spell;

import card.minion.SanglierBrocheroc;

public class BenedictionDePuissance extends Spell {

	public BenedictionDePuissance() {
		super("BenedictionDePuissance", 1);
	}

	@Override
	public void cast() {
		//get target only minion
		//add 1 damage to target
	}
	
	public static Spell createBenedictionDePuissance(){
		  return new BenedictionDePuissance();
	}

}
