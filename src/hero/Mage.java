package hero;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import card.Card;

public class Mage extends Hero {
	
	private static List<String> playable_cards_mage = Arrays.asList("ExplosionDesArcanes", "ImageMiroir", "Metamorphose");

	public Mage() {
		super(0, 30, 30, "Mage");
		playable_cards.addAll(playable_cards_mage);
	}

	@Override
	public void useHeroPower() {
		//get Target
		//Deal 1 damage to target
	}

}
