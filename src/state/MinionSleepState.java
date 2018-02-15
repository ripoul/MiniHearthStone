package state;

import card.minion.Minion;

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
		minion.setState(this);;
	}

	@Override
	public void attack() {
		System.out.println("can't attack wait next turn");
	}

}
