package card.minion;

public class Mouton extends Minion {

	public Mouton() {
		super("Mouton", 1, 1, 0);
	}

	public static Minion createMouton(){
		return new Mouton();
	}
}
