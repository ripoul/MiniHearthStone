package card.minion.decorator;

import card.minion.Minion;
import card.minion.decorator.MinionDecorator;
import game.Player;
import mechanics.TargetableEntity;
import state.MinionState;

public class MinionLifeLeechDecorator extends MinionDecorator {

	public MinionLifeLeechDecorator(Minion minion) {
		super(minion);
	}

  	public void attack(TargetableEntity target){
		m.attack(target);
		m.getPlayer().getHero().heal(m.getDamage());
  	}
  
    public void takeDamage(int damage){
		m.takeDamage(damage);
	}

    @Override
    public void use() {
	    m.use();
    }

    public void summon() {
		m.summon();
	}
	
	public void remove() {
		m.remove();
	}

	public String getName() {
		return m.getName();
	}
	
	public int getDamage() {
		return m.getDamage();
	}
	
	public int getHealth() {
		return m.getHealth();
	}
	
	public int getMana() {
		return m.getMana();
	}
	
	public MinionState getState() {
		return m.getState();
	}

	public Player getPlayer() {
		return m.getPlayer();
	}

	public int getManaCost() {
		return m.getManaCost();
	}

	public boolean isShould_be_attacked() {
		return m.isShould_be_attacked();
	}
	
	@Override
	public String toString() {
		return m.toString();
	}

}
