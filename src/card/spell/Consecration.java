package card.spell;

import java.util.ArrayList;

import card.minion.Minion;
import game.Player;

/**
 * 
 * @author gguillet lbrisjules
 * 
 * Concrete Spell object Consecration
 *
 */

public class Consecration extends Spell {

	/**
	 * 
	 *Consecration constructor
	 *
	 */
	public Consecration() {
		super("Consecration", 4);
	}

	/**
	 * 
	 *Override of the cast method of Spell
	 *Deal 2 damages to all the minions of the enemy board
	 *
	 */
	@Override
	public void cast() {
		 ArrayList<Minion> ennemy_minions = ((Player) getPlayer()).getEnnemy_player().getBoard().getMinions();
		 for (Minion minion : ennemy_minions) {
			 minion.takeDamage(2);
		 }
		 getPlayer().getEnnemy_player().getHero().takeDamage(2);
	}
}
