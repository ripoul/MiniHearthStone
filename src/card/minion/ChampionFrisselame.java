package card.minion;

import card.minion.decorator.MinionChargeDecorator;
import card.minion.decorator.MinionLifeLeechDecorator;

public class ChampionFrisselame extends Minion {

	public ChampionFrisselame() {
		super("ChampionFrisselame", 3, 2, 4);
	}

	public static Minion createChampionFrisselame(){
		Minion champ = new MinionChargeDecorator(new ChampionFrisselame());
		champ = new MinionLifeLeechDecorator(champ);
		return champ;
	}
	
}
