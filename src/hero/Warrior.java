package hero;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Warrior extends Hero {
	
	private static List<String> playable_cards_warrior = Arrays.asList("AvocatCommisDOffice", "MaitriseDeBlocage", "Tourbillon");

	public Warrior() {
		super(0, 30, 30, "Warrior");
		playable_cards.addAll(playable_cards_warrior);
	}

	@Override
	public void useHeroPower() {
		int current_armor = this.getArmor();
		this.setArmor(current_armor + 2);
	}
	
	@Override
	public ArrayList<String> getPlayable_cards() {
		return playable_cards;
	}

}
