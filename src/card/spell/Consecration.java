package card.spell;

import java.util.ArrayList;

import card.minion.Minion;
import game.Player;

public class Consecration extends Spell {

	public Consecration() {
		super("Consecration", 4);
	}

	@Override
	public void cast() {
		 ArrayList<Minion> ennemy_minions = ((Player) getPlayer()).getEnnemy_player().getBoard().getMinions();
		 for (Minion minion : ennemy_minions) {
			 minion.setHealth(minion.getHealth() - 2);
		 }
	}
	
}
