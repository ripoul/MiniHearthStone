package state;

import card.minion.Minion;

public class MinionSleepState implements MinionState {

	private Minion minion;

	public MinionSleepState(Minion minion) {
		super();
		this.minion = minion;
	}

	@Override
	public void attack() {
		System.out.println("can't attack wait next turn");
	}

}
