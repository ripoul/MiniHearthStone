package card.spell;

import java.util.ArrayList;

import card.minion.Minion;
import game.Player;

/**
 * 
 * @author gguillet lbrisjules
 * 
 * Concrete Spell object ExplosionDesArcanes
 *
 */

public class ExplosionDesArcanes extends Spell {
	
	/**
	 * 
	 *ExplosionDesArcanes constructor
	 *
	 */
	public ExplosionDesArcanes() {
		super("ExplosionDesArcanes", 2);
	}

	/**
	 * 
	 *Override of the cast method of Spell
	 *Give 1 damage to all the enemy minion on the enemy board
	 *
	 */
	@Override
	public void cast() {
		ArrayList<Minion> ennemy_minions = ((Player) getPlayer()).getEnnemy_player().getBoard().getMinions();
		 for (Minion minion : ennemy_minions) {
			 minion.takeDamage(1);
		 }
	}
	
	/**
	 * @return a new ExplosionDesArcanes
	 */
	public static Spell createExplosionDesArcanes(){
		  return new ExplosionDesArcanes();
	}

}
