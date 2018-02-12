package card.spell;

import java.util.ArrayList;

import card.minion.Minion;
import game.Player;

public class ExplosionDesArcanes extends Spell {
	
	public ExplosionDesArcanes() {
		super("ExplosionDesArcanes", 2);
	}

	@Override
	public void cast() {
		ArrayList<Minion> ennemy_minions = ((Player) getPlayer()).getEnnemy_player().getBoard().getMinions();
		 for (Minion minion : ennemy_minions) {
			 minion.takeDamage(1);
		 }
	}
	
	public static Spell createExplosionDesArcanes(){
		  return new ExplosionDesArcanes();
	}

}
