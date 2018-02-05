package hero;

public class Warrior extends Hero {

	public Warrior() {
		super(0, 30, 30, "Warrior");
	}

	@Override
	public void useHeroPower() {
		int current_armor = this.getArmor();
		this.setArmor(current_armor + 2);
	}

}
