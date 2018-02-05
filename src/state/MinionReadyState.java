package state;

import card.minion.Minion;

public class MinionReadyState implements MinionState {

	private Minion minion;

	public MinionReadyState(Minion minion) {
		super();
		this.minion = minion;
	}
	
	@Override
	public void attack() {
		System.out.println("attacking...");
	}

}
