package card.minion;

public class SoldatDuComteDeLOr extends Minion {

  public SoldatDuComteDeLOr() {
	  super("SoldatDuComteDeLOr", 1, 2, 1);
  }

  public static Minion createSoldatDuComteDeLOr(){
	  return new MinionTauntDecorator(new SoldatDuComteDeLOr());
  }

}
