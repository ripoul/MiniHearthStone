package card.spell;

import java.util.ArrayList;
import java.util.Scanner;

import card.minion.Minion;
import game.Board;

public class BenedictionDePuissance extends Spell {

	public BenedictionDePuissance() {
		super("BenedictionDePuissance", 1);
	}

	@Override
	public void cast() {
		getPlayer().getBoard().displayMinionAsList();
		System.out.println("Entrer l'index du serviteur � cibler afin de lui accorder benediction de puissance");
		Minion m = null;
		Scanner reader = new Scanner(System.in);
		while(m == null) {
			int n = reader.nextInt();
			try {
				m = getPlayer().getBoard().getMinions().get(n);
			}catch (IndexOutOfBoundsException e) {
				
			}
		}
		m.setDamage(m.getDamage() + 1);
	}
	
	public static Spell createBenedictionDePuissance(){
		  return new BenedictionDePuissance();
	}

}
