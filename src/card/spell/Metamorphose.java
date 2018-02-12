package card.spell;

import java.util.Scanner;

import card.minion.Minion;
import card.minion.Mouton;

public class Metamorphose extends Spell {

	public Metamorphose() {
		super("Metamorphose", 4);
	}

	@Override
	public void cast() {
		getPlayer().getBoard().displayMinionAsList();
		System.out.println("Entrer l'index du serviteur à cibler par metamorphose");
		Minion m = null;
		while(m == null) {
			Scanner reader = new Scanner(System.in);
			int n = reader.nextInt();
			reader.close();
			try {
				m = getPlayer().getBoard().getMinions().get(n);
			}catch (IndexOutOfBoundsException e) {
				
			}
			reader.close();
		}
		m.remove();
		getPlayer().getBoard().getMinions().add(new Mouton());
	}
	
	public static Spell createMetamorphose(){
		  return new Metamorphose();
	}

}
