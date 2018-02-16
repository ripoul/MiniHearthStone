package card.minion.decorator;

import card.minion.Minion;
import game.Player;
import mechanics.TargetableEntity;
import state.MinionReadyState;
import state.MinionState;

/**
 * 
 * @author gguillet lbrisjules
 * 
 * Concrete decorator which give ready state to the decorate minion
 *
 */

public class MinionChargeDecorator extends MinionDecorator {

	public MinionChargeDecorator(Minion m) {
		super(m);
		m.setState(new MinionReadyState(m));
	}
	@Override
	public void setPlayer(Player p){
		m.setPlayer(p);
	}
  
  	@Override
  	public void takeDamage(int damage){
		m.takeDamage(damage);
	}
  
  	@Override
  	public boolean use() {
  		return m.use();
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
	public void attack(TargetableEntity target){
		m.attack(target);
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
