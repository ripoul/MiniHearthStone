package card.spell;

public class Tourbillon extends Spell {

	public Tourbillon() {
		super("Tourbillon", 1);
	}

	@Override
	public void cast() {
		// Deal 1 damage to all minions on each board
	}
	
	public static Spell createTourbillon(){
		  return new Tourbillon();
	}

}
