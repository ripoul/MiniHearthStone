package card.spell;

import java.util.Scanner;

import card.minion.Minion;
import card.minion.Mouton;
import game.Affichage;

public class Metamorphose extends Spell {

	public Metamorphose() {
		super("Metamorphose", 4);
	}

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
	
	public static Spell createMetamorphose(){
		  return new Metamorphose();
	}

}
