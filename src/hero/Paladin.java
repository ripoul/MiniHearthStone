package hero;

import card.minion.Minion;
import card.minion.RecrueDeLaMainDArgent;

public class Paladin extends Hero {

	public Paladin() {
		super(0, 30, 30, "Paladin");
	}

	@Override
	public void useHeroPower() {
		Minion m = RecrueDeLaMainDArgent.createRecrueDeLaMainDArgent();
		m.summon();
	}

}
