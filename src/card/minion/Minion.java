package card.minion;

import cards.Card;
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
    this.name = name;
    this.damage = damage;
    this.health = health;
    this.mana = mana;
    this.state = MinionSleepState(this);
  }

  public Minion(Minion m) {
    //For the sheep
    this.name = m.name;
    this.damage = m.damage;
    this.health = m.health;
    this.mana = m.mana;
    this.can_attack = m.can_attack;
    this.taunt = m.taunt;
    this.charge = m.charge;
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

}
