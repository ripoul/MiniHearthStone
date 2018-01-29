package card.minion.common;

public class ChefDeRaid extends Minion {

  public ChefDeRaid() {
    super("ChefDeRaid", 2, 2, 3)
  }

  public static Minion createChefDeRaid(){
		return new ChefDeRaid();
	}

  public void summon(){
    //TO DO ADD +1 TO THE ATTACK OF OTHER ALLY MINION
  }

  
  public void remove() {
      //TO DO REMOVE 1 TO THE ATTACK OF OTHER ALLY MINION
  }

}
