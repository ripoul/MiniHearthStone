package card.minion;

import mechanics.TargetableEntity;

public class MinionLifeLeechDecorator extends MinionDecorator {

  public MinionLifeLeechDecorator(Minion minion) {
		super(minion);
  }

  public void attack(TargetableEntity target){
		System.out.println("heal your hero");
	}

}
