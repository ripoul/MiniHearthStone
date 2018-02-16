package card.minion;

/**
 * 
 * @author gguillet lbrisjules
 * 
 * Concrete object Minion ChefDeRaid
 *
 */

public class ChefDeRaid extends Minion {

 /**
 * ChefDeRaid constructor
 */
  public ChefDeRaid() {
	  super("ChefDeRaid", 2, 2, 3);
  }

  /**
   * 
   * Override summon method of minion
   * Give +1 to the attack of all minions while placed on board
   * 
   */
  @Override
  public void summon(){
    for (Minion m : getPlayer().getBoard().getMinions()) {
    	m.setDamage(m.getDamage() +1);
    }
    super.summon();
  }

  /**
   * 
   * Override remove method of minion
   * Give -1 to the attack of all minions while removed on board
   * 
   */
  @Override
  public void remove() {
	  for (Minion m : getPlayer().getBoard().getMinions()) {
	    	m.setDamage(m.getDamage() -1);
	  }
	  super.remove();
  }

}
