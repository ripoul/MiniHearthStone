package state;

import card.minion.Minion;

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
		minion.setState(this);
	}
	
	@Override
	public void attack() {
		System.out.println("attacking...");
		// MAYBE TO DELETE
	}

}
