package card.spell;

public class Metamorphose extends Spell {

	public Metamorphose() {
		super("Metamorphose", 4);
	}

	@Override
	public void cast() {
		//Get minion targeted
		//remove targeted minion
		
	}
	
	public static Spell createMetamorphose(){
		  return new Metamorphose();
	}

}
