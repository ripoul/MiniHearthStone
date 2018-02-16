package card.spell;

import card.Card;
import game.Player;

/**
 * 
 * @author gguillet lbrisjules
 * 
 * Abstract Spell object
 *
 */

public abstract class Spell extends Card {

  private Player player;
  private String name;
  private int manaCost;
  
 /**
 * @param name name of the spell
 * @param manaCost cost in mana of the spell
 * Spell constructor
 */
public Spell(String name, int manaCost) {
		super(name, manaCost);
		this.manaCost = manaCost;
		this.name = name;
  }
  
/**
 * abstract method cast
 */
  public abstract boolean cast();
  
  /**
   * Override of the method use of Card which remove the cost in mana of the spell
   * from the current mana of the player
   * Use cast method
   */
  @Override
  public boolean use() {

	  if(cast()){
          player.setMana(player.getMana() - manaCost);
          return true;
      }
      return false;
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
 * Override of the method toString of Card which display the spell info clearfully
 */
@Override
  public String toString() {
	  return "Spell [player=" + player + ", name=" + name + ", manaCost=" + manaCost + "]";
  }
  
  
  
}
