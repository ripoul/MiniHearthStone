package card.spell;

public class ExplosionDesArcanes extends Spell {
	
	public ExplosionDesArcanes() {
		super("ExplosionDesArcanes", 2);
	}

	@Override
	public void cast() {
		//Get opponent
		//Deal 1 damage to all the enemy board
	}
	
	public static Spell createExplosionDesArcanes(){
		  return new ExplosionDesArcanes();
	}

}
