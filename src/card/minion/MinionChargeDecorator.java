package card.minion;

import state.MinionReadyState;

public class MinionChargeDecorator extends MinionDecorator {

  public MinionChargeDecorator(Minion minion) {
		super(minion);
		this.setState(new MinionReadyState(minion));
	}

}
