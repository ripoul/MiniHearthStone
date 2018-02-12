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
		System.out.println("Entrer l'index du serviteur à cibler afin de lui accorder benediction de puissance");
		Minion m = null;
		while(m == null) {
			Scanner reader = new Scanner(System.in);
			int n = reader.nextInt();
			reader.close();
			m = getPlayer().getBoard().getMinions().get(n);
			reader.close();
		}
		m.setDamage(m.getDamage() + 1);
	}
	
	public static Spell createBenedictionDePuissance(){
		  return new BenedictionDePuissance();
	}

}
