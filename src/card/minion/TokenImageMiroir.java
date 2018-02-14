package card.minion;

import card.minion.decorator.MinionTauntDecorator;

/**
 * 
 * @author gguillet lbrisjules
 * 
 * Concrete object Minion TokenImageMiroir
 *
 */

public class TokenImageMiroir extends Minion {
	
	 /**
	 * TokenImageMiroir constructor
	 */
	public TokenImageMiroir() {
	    super("ImageMiroir", 0, 2, 0);
	}

	
	/**
	* @return a new TokenImageMiroir
	*/
	public static Minion createImageMiroir(){
		return new MinionTauntDecorator(new TokenImageMiroir());
	}

}
