package card.minion.state;

import card.minion.Minion;
import mechanics.TargetableEntity;

/**
 * 
 * @author gguillet lbrisjules
 * 
 * Concrete Interface MinionReadyState
 *
 */

public class MinionReadyState implements MinionState {

	private Minion minion;

	/**
	 * 
	 * @param minion minion on which you want to applicate ready state
	 * MinionReadyState constructor
	 * 
	 */
	public MinionReadyState(Minion minion) {
		super();
		this.minion = minion;
	}

	@Override
	public void attack(TargetableEntity target) {
		System.out.println("attacking...");
		target.takeDamage(minion.getDamage());
	}

}
