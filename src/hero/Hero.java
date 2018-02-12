package hero;

import java.util.ArrayList;
import java.util.Arrays;

import mechanics.TargetableEntity;

public abstract class Hero implements TargetableEntity {

	private int armor;
	private int currentHealth;
	private int healthMax;
	private String name;
	protected ArrayList<String> playable_cards = new ArrayList<>(Arrays.asList("ChefDeRaid", "ChevaucheurDeLoup",
																			   "SanglierBrocheroc", "SoldatDuComteDeLOr",
																			   "YetiNoroit"));
	
	public Hero(int armor, int currentHealth, int healthMax, String name) {
		super();
		this.armor = armor;
		this.currentHealth = currentHealth;
		this.healthMax = healthMax;
		this.name = name;
	}
	
	public void takeDamage(int damage){
		currentHealth = currentHealth-damage;
		if (currentHealth <= 0){
			//Call sur le observer
		}
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

	public ArrayList<String> getPlayable_cards() {
		return playable_cards;
	}

	public static void setPlayable_cards(ArrayList<String> playable_cards) {
		playable_cards = playable_cards;
	}
	
}
