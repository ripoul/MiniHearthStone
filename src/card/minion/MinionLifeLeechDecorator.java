package card.minion;

public class MinionLifeLeechDecorator extends MinionDecorator {

  public MinionLifeLeechDecorator(Minion minion) {
		super(minion);
	}

  public void attack(TargetableEntity target){
		System.out.println("heal your hero for "+str(minion.damage));
	}

}
