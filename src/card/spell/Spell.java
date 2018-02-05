package card.spell;

import card.Card;
import game.Player;

public abstract class Spell extends Card {

  private Player player;
  private String name;
  private int mana;
  
  public Spell(String name, int manaCost) {
		super(name, manaCost);
		// TODO Auto-generated constructor stub
  }
  
  public abstract void cast();

  public Player getPlayer() {
	  return player;
  }

  public void setPlayer(Player player) {
	  this.player = player;
  }

  public String getName() {
	  return name;
  }

  public void setName(String name) {
	  this.name = name;
  }

  public int getMana() {
	  return mana;
  }

  public void setMana(int mana) {
	  this.mana = mana;
  }
  
}
