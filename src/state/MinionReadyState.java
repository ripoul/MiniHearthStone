package state;

import cards.minion.Minion;

public class MinionReadyState implements MinionState {

	private Minion minion;

	public MinionAwakeState(Minion minion) {
		super();
		this.minion = minion;
	}
	@Override
	public void attack() {
		System.out.println("attacking...");
	}

}
