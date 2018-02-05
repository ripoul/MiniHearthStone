package card.spell;

public class MaitriseDeBlocage extends Spell {

	public MaitriseDeBlocage() {
		super("MaitriseDeBlocage", 3);
	}

	@Override
	public void cast() {
		int current_armor = this.getPlayer().getHero().getArmor();
		this.getPlayer().getHero().setArmor(current_armor + 5);
	}

}
