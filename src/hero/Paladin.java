package hero;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import card.CardFactory;
import card.CardFactoryPaladin;
import card.minion.Minion;
import card.minion.RecrueDeLaMainDArgent;
import game.Observer.Observer;

public class Paladin extends Hero {
	private CardFactory cards;
	private static List<String> playable_cards_paladin = Arrays.asList("ChampionFrisselame", "BenedictionDePuissance", "Consecration"); // correspond to the special card of the paladin

	/**
	 * Paladin constructor
	 * Add all special card of the Paladin to his available cards
	 */
	public Paladin() {
		super(0, 30, 30, "Paladin");
		playable_cards.addAll(playable_cards_paladin);
		cards = new CardFactoryPaladin();
	}

	/**
	 * Override the useHeroPower abstract method of hero
	 * Add one RecrueDeLaMainDArgent minion to the board of the player
	 */
	@Override
	public void useHeroPower() {
		Minion m = new RecrueDeLaMainDArgent();
		m.setPlayer(this.getPlayer());
		m.summon();
	}
	
	/**
	 * Override the getPlayable_cards method of hero
	 */
	@Override
	public ArrayList<String> getPlayable_cards() {
		return playable_cards;
	}

	public CardFactory getCards() {
		return cards;
	}

}
