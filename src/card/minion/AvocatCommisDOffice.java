package card.minion;

import card.minion.decorator.MinionTauntDecorator;

public class AvocatCommisDOffice extends Minion {
	
	public AvocatCommisDOffice() {
		super("AvocatCommisDOffice", 0, 7, 2);
	}

	public static Minion createAvocatCommisDOffice(){
		return new MinionTauntDecorator(new AvocatCommisDOffice());
	}

}
