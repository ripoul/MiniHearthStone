package card.spell;

import card.minion.Minion;

import java.util.ArrayList;

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
	public boolean cast() {
		ArrayList<Minion> ennemy_minions = getPlayer().getEnnemy_player().getBoard().getMinions();
		for (int i=0;i<ennemy_minions.size();i++) {
			Minion m = ennemy_minions.get(i);
			boolean b = m.getHealth() <= 1;
			m.takeDamage(1);

			if (b) {
				i--;
			}
		}
		return true;
	}
}
