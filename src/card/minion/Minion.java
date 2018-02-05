package card.minion;

import card.Card;
import mechanics.TargetableEntity;
import state.MinionSleepState;
import state.MinionState;

public abstract class Minion extends Card implements TargetableEntity{

  private String name;
  private int damage;
  private int health;
  private int mana;
  private MinionState state;

  public Minion (String name, int damage, int health, int mana) {
	super(name, mana);
    this.damage = damage;
    this.health = health;
    this.state = new MinionSleepState(this);
  }

  public Minion (Minion m) {
	super(m.name, m.damage);
    //For the sheep
    this.health = m.health;
    this.mana = m.mana;
	}

  public void summon() {
    //TO DO
  }

  public void remove() {
    //TO DO
  }

  public void attack(TargetableEntity target){
		//TO DO
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
	return mana;
}

public void setMana(int mana) {
	this.mana = mana;
}

public MinionState getState() {
	return state;
}

public void setState(MinionState state) {
	this.state = state;
}

  
  
}
