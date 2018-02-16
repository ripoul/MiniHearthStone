package card.spell;

import java.util.Scanner;

import card.minion.Minion;
import card.minion.Mouton;
import game.Affichage;

/**
 * 
 * @author gguillet lbrisjules
 * 
 * Concrete Spell object Metamorphose
 *
 */

public class Metamorphose extends Spell {

	/**
	 * 
	 *Metamorphose constructor
	 *
	 */
	public Metamorphose() {
		super("Metamorphose", 4);
	}

	/**
	 * 
	 * Override of the cast method of Spell
	 * Ask the player to select a target minion on the enemy board
	 * remove the targeted minion and replace him by a sheep minion
	 * If there is no minions on the enemy board the spell is canceled
	 *
	 */
	@Override
	public void cast() {
		getPlayer().getBoard().displayMinionAsList();
		System.out.println("Entrer l'index du serviteur � cibler par metamorphose");
		Minion m = null;
		while(m == null) {
			int n = Affichage.lireInt();
			try {
				m = getPlayer().getBoard().getMinions().get(n);
			}catch (IndexOutOfBoundsException e) {
				System.out.println("No ennemy minion you can't use this spell");
				getPlayer().setMana(getManaCost()+ getPlayer().getMana());
				break;
			}
		}
		if (m != null){
			m.remove();
			getPlayer().getBoard().getMinions().add(new Mouton());
		}
	}
}
