package hero;

import java.util.Arrays;
import java.util.List;

import card.minion.Minion;
import card.minion.RecrueDeLaMainDArgent;

public class Paladin extends Hero {
	
	private static List<String> playable_cards_paladin = Arrays.asList("ChampionFrisselame", "BenedictionDePuissance", "Consecration");

	public Paladin() {
		super(0, 30, 30, "Paladin");
		playable_cards.addAll(playable_cards_paladin);
	}

	@Override
	public void useHeroPower() {
		Minion m = RecrueDeLaMainDArgent.createRecrueDeLaMainDArgent();
		m.summon();
	}

}
