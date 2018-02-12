package card.minion;

public class ChefDeRaid extends Minion {

  public ChefDeRaid() {
	  super("ChefDeRaid", 2, 2, 3);
  }

  public static Minion createChefDeRaid(){
	return new ChefDeRaid();
  }

  public void summon(){
    for (Minion m : getPlayer().getBoard().getMinions()) {
    	m.setDamage(m.getDamage() +1);
    }
  }

  
  public void remove() {
	  for (Minion m : getPlayer().getBoard().getMinions()) {
	    	m.setDamage(m.getDamage() -1);
	    }
  }

}
