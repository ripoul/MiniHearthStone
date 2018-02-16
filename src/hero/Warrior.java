package hero;

import card.CardFactory;
import card.CardFactoryWarrrior;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Warrior extends Hero {
	private CardFactory cards;
	private static List<String> playable_cards_warrior = Arrays.asList("AvocatCommisDOffice", "MaitriseDeBlocage", "Tourbillon"); // correspond to the special card of the warrior

	/**
	 * Warrior constructor
	 * Add all special card of the Warrior to his available cards
	 */
	public Warrior() {
		super(0, 30, 30, "Warrior");
		playable_cards.addAll(playable_cards_warrior);
		cards = new CardFactoryWarrrior();
	}

	/**
	 * Override the useHeroPower abstract method of hero
	 * The player gain 2 points of armor
	 */
	@Override
	public void useHeroPower() {
		int current_armor = this.getArmor();
		this.setArmor(current_armor + 2);
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
