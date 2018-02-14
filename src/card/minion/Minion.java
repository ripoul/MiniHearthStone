package card.minion;

import java.util.ArrayList;

import card.Card;
import game.Player;
import mechanics.TargetableEntity;
import state.MinionSleepState;
import state.MinionState;

public abstract class Minion extends Card implements TargetableEntity{

	private String name;
	private int damage;
	private int health;
	private int manaCost;
	private MinionState state;
	private Player player;
	private boolean should_be_attacked;
	
	public Minion (String name, int damage, int health, int manaCost) {
		super(name, manaCost);
		this.name = name;
		this.manaCost = manaCost;
	    this.damage = damage;
	    this.health = health;
	    this.state = new MinionSleepState(this);
	    this.should_be_attacked = false;
	}
	
	public void takeDamage(int damage){
		health = health-damage;
		if (health <= 0){
			this.remove();
		}
	}
	
	public Minion (Minion m) {
		super(m.name, m.manaCost);
		this.name = m.name;
		this.manaCost = m.manaCost;
	    this.damage = m.damage;
	    this.health = m.health;
	    this.state = new MinionSleepState(this);
	    this.should_be_attacked = false;
	}
	
	@Override
	  public void use() {
		  player.setMana(player.getMana() - manaCost);
		  summon();
	  }
	
	public void summon() {
		ArrayList<Minion> actual_minions = player.getBoard().getMinions();
		actual_minions.add(this);
	}
	
	public void remove() {
		ArrayList<Minion> actual_minions = player.getBoard().getMinions();
		actual_minions.remove(this);
	}
	
	public void attack(TargetableEntity target){
		target.takeDamage(damage);
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getDamage() {
		return damage;
	}
	
	public void setDamage(int damage) {
		this.damage = damage;
	}
	
	public int getHealth() {
		return health;
	}
	
	public void setHealth(int health) {
		this.health = health;
	}
	
	public int getMana() {
		return manaCost;
	}
	
	public void setMana(int manaCost) {
		this.manaCost = manaCost;
	}
	
	public MinionState getState() {
		return state;
	}
	
	public void setState(MinionState state) {
		this.state = state;
	}

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}
	
	public int getManaCost() {
		return manaCost;
	}

	public void setManaCost(int manaCost) {
		this.manaCost = manaCost;
	}

	public boolean isShould_be_attacked() {
		return should_be_attacked;
	}

	public void setShould_be_attacked(boolean should_be_attacked) {
		this.should_be_attacked = should_be_attacked;
	}

	@Override
	public String toString() {
		return "Minion [name=" + this.name + ", damage=" + damage + ", health=" + health + ", manaCost=" + this.manaCost
				+ ", state=" + state + "]";
	}  
	
}
