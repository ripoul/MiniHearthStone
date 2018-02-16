package card.minion.decorator;

import card.minion.Minion;
import game.Player;
import mechanics.TargetableEntity;
import state.MinionState;

/**
 * 
 * @author gguillet lbrisjules
 * 
 * Concrete decorator which give a leech on life while attacking to the decorate minion
 *
 */

public class MinionLifeLeechDecorator extends MinionDecorator {

	public MinionLifeLeechDecorator(Minion m) {
		super(m);
	}

	@Override
  	public void attack(TargetableEntity target){
		m.attack(target);
		m.getPlayer().getHero().heal(m.getDamage());
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

	@Override
	public void setPlayer(Player p){
		m.setPlayer(p);
	}

}
