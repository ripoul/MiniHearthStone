package hero;

import java.util.ArrayList;
import java.util.Arrays;

import card.Card;
import card.CardFactory;
import game.Observer.Observer;
import game.Observer.Sujet;
import game.Player;
import mechanics.TargetableEntity;

/**
 * 
 * @author gguillet lbrisjules
 * 
 * Abstract class Hero
 *
 */

public abstract class Hero implements TargetableEntity, Sujet {

	private int armor;
	private int currentHealth;
	private int healthMax;
	private String name;
	private Player player;
	protected ArrayList<String> playable_cards = new ArrayList<>(Arrays.asList("ChefDeRaid", "ChevaucheurDeLoup",
																			   "SanglierBrocheroc", "SoldatDuComteDeLOr",
																			   "YetiNoroit"));  //List of string which correspond to all common cards
	protected ArrayList<Observer> obs;
	
	/**
	 * @param armor armor of the hero
	 * @param currentHealth current health of the hero
	 * @param healthMax maximum health of the hero
	 * @param name name of the hero
	 * Hero constructor
	 */
	public Hero(int armor, int currentHealth, int healthMax, String name) {
		this.armor = armor;
		this.currentHealth = currentHealth;
		this.healthMax = healthMax;
		this.name = name;
		this.obs = new ArrayList<>();
	}
	
	/**
	 * @param damage damage which will be taken by our hero
	 * The hero life is reduced by x damage
	 */
	public void takeDamage(int damage){
		currentHealth = currentHealth-damage;
		notifierObs();
	}
	
	/**
	 * abstract method useHeroPower
	 */
	public abstract void useHeroPower();

	
	/**
	 * @return the armor
	 */
	public int getArmor() {
		return armor;
	}

	/**
	 * @param armor the armor to set
	 */
	public void setArmor(int armor) {
		this.armor = armor;
	}

	/**
	 * @return the currentHealth
	 */
	public int getCurrentHealth() {
		return currentHealth;
	}

	/**
	 * @param currentHealth the currentHealth to set
	 */
	public void setCurrentHealth(int currentHealth) {
		this.currentHealth = currentHealth;
	}

	/**
	 * @return the healthMax
	 */
	public int getHealthMax() {
		return healthMax;
	}

	/**
	 * @param healthMax the healthMax to set
	 */
	public void setHealthMax(int healthMax) {
		this.healthMax = healthMax;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the player
	 */
	public Player getPlayer() {
		return player;
	}

	/**
	 * @param player the player to set
	 */
	public void setPlayer(Player player) {
		this.player = player;
	}

	/**
	 * @return the playable_cards
	 */
	public ArrayList<String> getPlayable_cards() {
		return playable_cards;
	}

	/**
	 * @param playable_cards the playable_cards to set
	 */
	public void setPlayable_cards(ArrayList<String> playable_cards) {
		this.playable_cards = playable_cards;
	}

	
	/**
	 * @param heal increase your current hero life by x
	 */
	public void heal(int heal){
		this.setCurrentHealth(currentHealth + heal);
	}

	public abstract CardFactory getCards();


	public void enregistrerObs(Observer o){
		obs.add(o);
	}
	public void supprierObs(Observer o){
		obs.remove(o);
	}
	public void notifierObs(){
		for (Observer ob : obs) {
			ob.actualiser(this.getCurrentHealth());
		}
	}
		
}
