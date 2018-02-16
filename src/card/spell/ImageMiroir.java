package card.spell;

import card.CardFactory;
import card.minion.Minion;
import card.minion.TokenImageMiroir;
import card.minion.decorator.MinionTauntDecorator;

/**
 * 
 * @author gguillet lbrisjules
 * 
 * Concrete Spell object ImageMiroir
 *
 */

public class ImageMiroir extends Spell {
	
	/**
	 * 
	 *ImageMiroir constructor
	 *
	 */
	public ImageMiroir() {
		super("ImageMiroir", 1);
	}

	/**
	 * 
	 *Override of the cast method of Spell
	 *Add two TokenImageMiroir to the player board
	 *
	 */
	@Override
	public void cast() {
		Minion m1 = new MinionTauntDecorator(new TokenImageMiroir());
		Minion m2 = new MinionTauntDecorator(new TokenImageMiroir());

		m1.setPlayer(this.getPlayer());
		m2.setPlayer(this.getPlayer());

		m1.summon();
		m2.summon();
	}
}
