package hero;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import card.minion.Minion;

public class Mage extends Hero {
	
	private static List<String> playable_cards_mage = Arrays.asList("ExplosionDesArcanes", "ImageMiroir", "Metamorphose");

	public Mage() {
		super(0, 30, 30, "Mage");
		playable_cards.addAll(playable_cards_mage);
	}

	@Override
	public void useHeroPower() {
		System.out.println("Selectionner l'index de l'entite a attaquer");
		Scanner reader = new Scanner(System.in);
		if (getPlayer().getEnnemy_player().getBoard().getMinions().size() == 0){
			System.out.println("Type 1 to attack the ennemy hero");
			int n = reader.nextInt();
			if (n == 1){
				getPlayer().getEnnemy_player().getHero().takeDamage(1);
			}
		}else{
			getPlayer().getEnnemy_player().getBoard().displayMinionAsList();
			getPlayer().displayEnnemyHero();
			Minion m = null;
			Hero h = null;
			while(m == null || h == null) {
				int n = reader.nextInt();
				try {
					m = getPlayer().getBoard().getMinions().get(n);
					if (n == (getPlayer().getBoard().getMinions().size() + 1)) {
						h = this.getPlayer().getEnnemy_player().getHero();;
					}
				}catch (IndexOutOfBoundsException e) {
					System.out.println("Veuillez re entrer a nouveau un des index affiches plus haut");
				}
				reader.close();
			}
			if (m != null) {
				m.takeDamage(1);
			}
			if (h != null) {
				h.takeDamage(1);
			}
		}
	}
	
	@Override
	public ArrayList<String> getPlayable_cards() {
		return playable_cards;
	}

}
