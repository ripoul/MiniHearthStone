package card;

public abstract class Card {

  private int mana;
  private String name;
  private int manaCost;

  public Card(String name, int mana) {
		super();
		this.manaCost = mana;
		this.name = name;
	}

}
