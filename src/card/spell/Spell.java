package card.spell;

import card.Card;
import game.Player;

public abstract class Spell extends Card {

  private Player player;
  private String name;
  private int manaCost;
  
  public Spell(String name, int manaCost) {
		super(name, manaCost);
		this.manaCost = manaCost;
		this.name = name;
  }
  
  public abstract void cast();
  
  @Override
  public void use() {
	  player.setMana(player.getMana() - manaCost);
	  System.out.println("test : " + player.getMana());
	  cast();
  }

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
	  return manaCost;
  }

  public void setMana(int mana) {
	  this.manaCost = mana;
  }

  @Override
  public String toString() {
	  return "Spell [player=" + player + ", name=" + name + ", manaCost=" + manaCost + "]";
  }
  
  
  
}
