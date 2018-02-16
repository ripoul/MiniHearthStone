package card.spell;

import card.minion.Minion;

import java.util.ArrayList;

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
	public boolean cast() {
		ArrayList<Minion> ennemy_minions = getPlayer().getEnnemy_player().getBoard().getMinions();
		 for (int i=0; i<ennemy_minions.size(); i++){
			 Minion m = ennemy_minions.get(i);
			 boolean b = m.getHealth()<=1;
			 m.takeDamage(1);

			 if (b){
				 i--;
			 }
		 }

		ArrayList<Minion> myminions = getPlayer().getBoard().getMinions();
		for (int i=0; i<myminions.size(); i++){
			Minion m = myminions.get(i);
			boolean b = m.getHealth()<=1;
			m.takeDamage(1);

			if (b){
				i--;
			}
		}
		 return true;
	}
}
