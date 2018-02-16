package card;

import game.Player;

public abstract class Card {

  private String name;
  private int manaCost;
  private Player player;

  /**
	 * @param name name of the card
	 * @param manaCost cost in mana of the card
	 * Card constructor
  */
  public Card(String name, int manaCost) {
	  super();
	  this.manaCost = manaCost;
	  this.name = name;
  }
  
  /**
	* Abstract method use
	*/
  public abstract boolean use();

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

  
}
