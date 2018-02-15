package card.minion.decorator;

import card.minion.Minion;
import game.Main;
import mechanics.TargetableEntity;

/**
 * 
 * @author gguillet lbrisjules
 * 
 * Abstract decorator for a minion
 *
 */

public abstract class MinionDecorator extends Minion{

  protected Minion m;
	
  public MinionDecorator(Minion m) {
      super(m);
      this.m = m;
  }
  
  public void attack (TargetableEntity target) {
	  m.attack(target);
  }

}
