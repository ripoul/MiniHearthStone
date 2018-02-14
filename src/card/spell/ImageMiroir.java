package card.spell;

import card.CardFactory;
import card.minion.TokenImageMiroir;

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
		TokenImageMiroir.createImageMiroir().summon();
		TokenImageMiroir.createImageMiroir().summon();
	}
	
	/**
	 * @return a new ImageMiroir
	 */
	public static Spell createImageMiroir(){
		  return new ImageMiroir();
	}
	
}
