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
	
	public void setName(String name) {
		m.setName(name);
	}
	
	public int getDamage() {
		return m.getDamage();
	}
	
	public void setDamage(int damage) {
		m.setDamage(damage);
	}
	
	public int getHealth() {
		return m.getHealth();
	}
	
	public void setHealth(int health) {
		m.setHealth(health);
	}
	
	public int getMana() {
		return m.getMana();
	}
	
	public void setMana(int manaCost) {
		m.setMana(manaCost);
	}
	
	public MinionState getState() {
		return m.getState();
	}
	
	public void setState(MinionState state) {
		m.setState(state);
	}

	public Player getPlayer() {
		return m.getPlayer();
	}

	public void setPlayer(Player player) {
		m.setPlayer(player);
	}

	public int getManaCost() {
		return m.getManaCost();
	}

	public void setManaCost(int manaCost) {
		m.setManaCost(manaCost);
	}

	public boolean isShould_be_attacked() {
		return m.isShould_be_attacked();
	}

	public void setShould_be_attacked(boolean should_be_attacked) {
		m.setShould_be_attacked(should_be_attacked);
	}	
	
	@Override
	public String toString() {
		return m.toString();
	}

}
