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
	
	public Minion (String name, int damage, int health, int manaCost) {
		super(name, manaCost);
	    this.damage = damage;
	    this.health = health;
	    this.state = new MinionSleepState(this);
	}
	
	public void takeDamage(int damage){
		health = health-damage;
		if (health <= 0){
			this.remove();
		}
	}
	
	public Minion (Minion m) {
		super(m.name, m.damage);
	    this.health = m.health;
	    this.manaCost = m.manaCost;
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

	@Override
	public String toString() {
		return "Minion [name=" + name + ", damage=" + damage + ", health=" + health + ", manaCost=" + manaCost
				+ ", state=" + state + "]";
	}  
	
}
