package card.minion.decorator;

import card.minion.Minion;
import mechanics.TargetableEntity;

public abstract class MinionDecorator extends Minion{

  protected Minion m;
	
  public MinionDecorator(Minion m) {
		super(m);
  }
  
  public void attack (TargetableEntity target) {
	  m.attack(target);
  }

}
