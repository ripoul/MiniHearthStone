package card.spell;

import java.util.ArrayList;
import java.util.Scanner;

import card.minion.Minion;
import game.Affichage;
import game.Board;

/**
 * 
 * @author gguillet lbrisjules
 * 
 * Concrete Spell object BenedictionDePuissance
 *
 */

public class BenedictionDePuissance extends Spell {

	/**
	 * 
	 *BenedictionDePuissance constructor
	 *
	 */
	public BenedictionDePuissance() {
		super("BenedictionDePuissance", 1);
	}

	/**
	 * 
	 *Override of the cast method of Spell
	 *Ask the player to select a target minion of his board
	 *give the selected minion +1 to attack
	 *
	 */
	@Override
	public void cast() {
		getPlayer().getBoard().displayMinionAsList();
		System.out.println("Entrer l'index du serviteur � cibler afin de lui accorder benediction de puissance");
		Minion m = null;
		while(m == null) {
			int n = Affichage.lireInt();
			try {
				m = getPlayer().getBoard().getMinions().get(n);
			}catch (IndexOutOfBoundsException e) {
				
			}
		}
		m.setDamage(m.getDamage() + 1);
	}
	
	/**
	 * @return a new BenedictionDePuissance
	 */
	public static Spell createBenedictionDePuissance(){
		  return new BenedictionDePuissance();
	}

}
