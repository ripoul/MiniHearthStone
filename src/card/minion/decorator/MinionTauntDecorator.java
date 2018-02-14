package card.minion.decorator;

import card.minion.Minion;
import card.minion.decorator.MinionDecorator;
import game.Player;
import mechanics.TargetableEntity;
import state.MinionState;

public class MinionTauntDecorator extends MinionDecorator {

  public MinionTauntDecorator (Minion m) {
	  super(m);
	  m.setShould_be_attacked(true);
  }
  
  @Override
  public void attack(TargetableEntity target){
		m.attack(target);
	}

  @Override
  public void takeDamage(int damage){
		m.takeDamage(damage);
	}

  @Override
  public void use() {
	    m.use();
  }
  
  @Override
  public void summon() {
		m.summon();
	}
	
  @Override
	public void remove() {
		m.remove();
	}
	
	@Override
	public String getName() {
		return m.getName();
	}
	
	@Override
	public int getDamage() {
		return m.getDamage();
	}
	
	@Override
	public int getHealth() {
		return m.getHealth();
	}
	
	@Override
	public int getMana() {
		return m.getMana();
	}
	
	@Override
	public MinionState getState() {
		return m.getState();
	}
	
	@Override
	public Player getPlayer() {
		return m.getPlayer();
	}

	@Override
	public int getManaCost() {
		return m.getManaCost();
	}
	
	@Override
	public boolean isShould_be_attacked() {
		return m.isShould_be_attacked();
	}
	
	@Override
	public String toString() {
		return m.toString();
	}

}
