package card.minion.decorator;

import card.minion.Minion;
import state.MinionReadyState;

public class MinionChargeDecorator extends MinionDecorator {

  public MinionChargeDecorator(Minion minion) {
		super(minion);
		this.setState(new MinionReadyState(minion));
	}

}
