package card.spell;

import java.util.ArrayList;

import card.minion.Minion;
import game.Player;

/**
 * 
 * @author gguillet lbrisjules
 * 
 * Concrete Spell object Tourbillon
 *
 */

public class Tourbillon extends Spell {

	/**
	 * 
	 *Tourbillon constructor
	 *
	 */
	public Tourbillon() {
		super("Tourbillon", 1);
	}

	/**
	 * 
	 *Override of the cast method of Spell
	 *Deal 1 damage to every minions on the board of each player
	 *
	 */
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
}
