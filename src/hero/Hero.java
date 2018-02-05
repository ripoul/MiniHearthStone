package hero;

import mechanics.TargetableEntity;

public abstract class Hero implements TargetableEntity {

	private int armor;
	private int currentHealth;
	private int healthMax;
	private String name;
	
	public Hero(int armor, int currentHealth, int healthMax, String name) {
		super();
		this.armor = armor;
		this.currentHealth = currentHealth;
		this.healthMax = healthMax;
		this.name = name;
	}
	
	public abstract void useHeroPower();

	public int getArmor() {
		return armor;
	}

	public void setArmor(int armor) {
		this.armor = armor;
	}

	public int getCurrentHealth() {
		return currentHealth;
	}

	public void setCurrentHealth(int currentHealth) {
		this.currentHealth = currentHealth;
	}

	public int getHealthMax() {
		return healthMax;
	}

	public void setHealthMax(int healthMax) {
		this.healthMax = healthMax;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
