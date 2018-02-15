package card.minion;

import card.minion.decorator.MinionChargeDecorator;
import card.minion.decorator.MinionLifeLeechDecorator;

/**
 * 
 * @author gguillet lbrisjules
 * 
 * Concrete object Minion ChampionFrisselame
 *
 */

public class ChampionFrisselame extends Minion {

	/**
	 * ChampionFrisselame constructor
	 */
	public ChampionFrisselame() {
		super("ChampionFrisselame", 3, 2, 4);
	}

	/**
	 * @return a new ChampionFrisselame
	 */
	public static Minion createChampionFrisselame(){
		Minion champ = new MinionChargeDecorator(new ChampionFrisselame());
		champ = new MinionLifeLeechDecorator(champ);
		return champ;
	}
	
}
