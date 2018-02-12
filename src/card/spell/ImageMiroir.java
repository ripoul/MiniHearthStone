package card.spell;

import card.CardFactory;
import card.minion.TokenImageMiroir;

public class ImageMiroir extends Spell {
	
	public ImageMiroir() {
		super("ImageMiroir", 1);
	}

	@Override
	public void cast() {
		TokenImageMiroir.createImageMiroir().summon();
		TokenImageMiroir.createImageMiroir().summon();
	}
	
	public static Spell createImageMiroir(){
		  return new ImageMiroir();
	}
	
}
