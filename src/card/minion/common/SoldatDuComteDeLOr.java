package card.minion.common;

import card.minion.Minion;

public class SoldatDuComteDeLOr extends Minion {

  public SoldatDuComteDeLOr() {
    super("SoldatDuComteDeLOr", 1, 2, 1);
  }

  public static Minion createSoldatDuComteDeLOr(){
		return new SoldatDuComteDeLOr();
	}

}
