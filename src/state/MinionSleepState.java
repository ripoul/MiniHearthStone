package state;

import card.minion.Minion;
import mechanics.TargetableEntity;

/**
 * 
 * @author gguillet lbrisjules
 * 
 * Concrete Interface MinionSleepState
 *
 */

public class MinionSleepState implements MinionState {

	private Minion minion;

	/**
	 * 
	 * @param minion minion on which you want to applicate sleep state
	 * MinionSleepState constructor
	 * 
	 */
	public MinionSleepState(Minion minion) {
		super();
		this.minion = minion;
	}

	@Override
	public void attack(TargetableEntity target) {
		System.out.println("can't attack wait next turn");
	}

}
