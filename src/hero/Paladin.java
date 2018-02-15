package hero;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import card.CardFactory;
import card.CardFactoryPaladin;
import card.minion.Minion;
import card.minion.RecrueDeLaMainDArgent;

public class Paladin extends Hero {
	
	private static List<String> playable_cards_paladin = Arrays.asList("ChampionFrisselame", "BenedictionDePuissance", "Consecration");
	private CardFactory cards;

	public Paladin() {
		super(0, 30, 30, "Paladin");
		playable_cards.addAll(playable_cards_paladin);
		cards = new CardFactoryPaladin();
	}

	@Override
	public void useHeroPower() {
		Minion m = RecrueDeLaMainDArgent.createRecrueDeLaMainDArgent();
		m.setPlayer(this.getPlayer());
		m.summon();
	}
	
	@Override
	public ArrayList<String> getPlayable_cards() {
		return playable_cards;
	}

	public CardFactory getCards() {
		return cards;
	}

}
