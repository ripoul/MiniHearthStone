package card.minion;

public class TokenImageMiroir extends Minion {
	
	public TokenImageMiroir() {
	    super("ImageMiroir", 0, 2, 0);
	}

	public static Minion createImageMiroir(){
		return new MinionTauntDecorator(new TokenImageMiroir());
	}

}
