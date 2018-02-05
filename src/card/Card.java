package card;

import game.Player;

public abstract class Card {

  private String name;
  private int manaCost;
  private Player player;

  public Card(String name, int manaCost) {
	  super();
	  this.manaCost = manaCost;
	  this.name = name;
  }

  public String getName() {
	  return name;
  }
	
  public void setName(String name) {
	  this.name = name;
  }
	
  public int getManaCost() {
	  return manaCost;
  }
	
  public void setManaCost(int manaCost) {
	  this.manaCost = manaCost;
  }
	
  public Player getPlayer() {
	  return player;
  }
	
  public void setPlayer(Player player) {
	  this.player = player;
  }
  
}
