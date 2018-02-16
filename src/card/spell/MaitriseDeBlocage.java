package card.spell;

/**
 * 
 * @author gguillet lbrisjules
 * 
 * Concrete Spell object MaitriseDeBlocage
 *
 */

public class MaitriseDeBlocage extends Spell {

	/**
	 * 
	 *MaitriseDeBlocage constructor
	 *
	 */
	public MaitriseDeBlocage() {
		super("MaitriseDeBlocage", 3);
	}

	/**
	 * 
	 *Override of the cast method of Spell
	 *Add 5 point of armor to the player
	 *
	 */
	@Override
	public boolean cast() {
		int current_armor = this.getPlayer().getHero().getArmor();
		this.getPlayer().getHero().setArmor(current_armor + 5);
		return true;
	}
}
