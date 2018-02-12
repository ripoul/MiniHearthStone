package card.spell;

import java.util.ArrayList;

import card.minion.Minion;
import game.Player;

public class Tourbillon extends Spell {

	public Tourbillon() {
		super("Tourbillon", 1);
	}

	@Override
	public void cast() {
		ArrayList<Minion> ennemy_minions = ((Player) getPlayer()).getEnnemy_player().getBoard().getMinions();
		 for (Minion minion : ennemy_minions) {
			 minion.takeDamage(1);
		 }
		ArrayList<Minion> minions = getPlayer().getBoard().getMinions();
		for (Minion minion : minions) {
			 minion.takeDamage(1);
		 }
	}
	
	public static Spell createTourbillon(){
		  return new Tourbillon();
	}

}
