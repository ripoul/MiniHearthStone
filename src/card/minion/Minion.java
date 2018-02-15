package card.minion;

import java.util.ArrayList;

import card.Card;
import game.Player;
import mechanics.TargetableEntity;
import state.MinionReadyState;
import state.MinionSleepState;
import state.MinionState;

/**
 * 
 * @author gguillet lbrisjules
 * 
 * Abstract Minion object
 *
 */

public abstract class Minion extends Card implements TargetableEntity{

	private String name;
	private int damage;
	private int health;
	private int manaCost;
	private MinionState state;
	private Player player;
	private boolean should_be_attacked;
	
	/**
	 * @param name name of the minion
	 * @param damage damage of the minion
	 * @param health health of the minion
	 * @param manaCost cost in mana of the minion
	 * Minion constructor
	 */
	public Minion (String name, int damage, int health, int manaCost) {
		super(name, manaCost);
		this.name = name;
		this.manaCost = manaCost;
	    this.damage = damage;
	    this.health = health;
	    this.state = new MinionSleepState(this);
	    this.should_be_attacked = false;
	}
	
	/**
	 * 
	 * @param damage
	 * 
	 * Deal damage to the current minion health
	 * 
	 */
	public void takeDamage(int damage){
		health = health-damage;
		if (health <= 0){
			this.remove();
		}
	}
	
	/**
	 * 
	 * @param m
	 * Minion constructor
	 * 
	 */
	public Minion (Minion m) {
		super(m.name, m.manaCost);
		this.name = m.name;
		this.manaCost = m.manaCost;
	    this.damage = m.damage;
	    this.health = m.health;
	    this.state = new MinionSleepState(this);
	    this.should_be_attacked = false;
	}
	
	/**
	 * 
	 * Use the minion card
	 * Remove the mana cost of the minion to the player
	 * call summon method
	 * 
	 */
	@Override
	  public void use() {
		  player.setMana(player.getMana() - manaCost);
		  summon();
	  }
	
	/**
	 * 
	 * Add the current minion to the board of the player
	 * 
	 */
	public void summon() {
		ArrayList<Minion> actual_minions = player.getBoard().getMinions();
		actual_minions.add(this);
	}
	
	/**
	 * 
	 * Remove the current minion to the board of the player
	 * 
	 */
	public void remove() {
		ArrayList<Minion> actual_minions = player.getBoard().getMinions();
		actual_minions.remove(this);
	}
	
	/**
	 * 
	 * @param target
	 * the target get damage by the current minion for the amount of his attack
	 * 
	 */
	public void attack(TargetableEntity target){
		if (state.getClass().equals(MinionReadyState.class)){
			target.takeDamage(damage);
		}else{
			System.out.println(this.name+" can't attack this turn wait next turn");
		}
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the damage
	 */
	public int getDamage() {
		return damage;
	}

	/**
	 * @param damage the damage to set
	 */
	public void setDamage(int damage) {
		this.damage = damage;
	}

	/**
	 * @return the health
	 */
	public int getHealth() {
		return health;
	}

	/**
	 * @param health the health to set
	 */
	public void setHealth(int health) {
		this.health = health;
	}

	/**
	 * @return the manaCost
	 */
	public int getManaCost() {
		return manaCost;
	}

	/**
	 * @param manaCost the manaCost to set
	 */
	public void setManaCost(int manaCost) {
		this.manaCost = manaCost;
	}

	/**
	 * @return the state
	 */
	public MinionState getState() {
		return state;
	}

	/**
	 * @param state the state to set
	 */
	public void setState(MinionState state) {
		this.state = state;
	}

	/**
	 * @return the player
	 */
	public Player getPlayer() {
		return player;
	}

	/**
	 * @param player the player to set
	 */
	public void setPlayer(Player player) {
		this.player = player;
	}

	/**
	 * @return the should_be_attacked
	 */
	public boolean isShould_be_attacked() {
		return should_be_attacked;
	}

	/**
	 * @param should_be_attacked the should_be_attacked to set
	 */
	public void setShould_be_attacked(boolean should_be_attacked) {
		this.should_be_attacked = should_be_attacked;
	}

	
	/**
	 * @return the string describing a minion
	 */
	@Override
	public String toString() {
		return "Minion [name=" + this.name + ", damage=" + damage + ", health=" + health + ", manaCost=" + this.manaCost
				+ ", state=" + state + "]";
	}  
	
}
