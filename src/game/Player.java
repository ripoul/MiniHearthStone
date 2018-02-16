package game;

import java.util.ArrayList;
import java.util.Random;
import card.Card;
import card.minion.Minion;
import hero.Hero;
import card.minion.state.MinionReadyState;

public class Player {

	private ArrayList<Card> hand; //List of cards in hand
	private Board board;
	private String name;
	private int mana; //Mana of the turn
	private int mana_max; //Mana restored every turn
	private Hero hero;
	private Player ennemy_player;
	private boolean used_hero_power; //boolean which indicate if we already use our hero power this turn
	
	/**
	 * @param name Name of the player
	 * @param hero Hero of the player
	 * Player constructor
	 */
	public Player(String name, Hero hero) {
		super();
		this.hero = hero;
		this.hand = new ArrayList<Card>();
		this.board = new Board(hero);
		this.name = name;
		this.mana = 0;
		this.used_hero_power = false;
	}
	
	/**
	 * 
	 * Use our hero power
	 * only one utilisation per turn
	 * the use of the hero power cost 2 mana points
	 * 
	 */
	public void useHeroPower(){
		if (mana < 2) {
			System.out.println("Not enough mana");
		}
		else if (used_hero_power == true){
			System.out.println("Hero power already used this turn");
		}else{
			hero.useHeroPower();
			this.setMana(this.getMana() - 2 );
			used_hero_power = true;
		}
	}
	
	/**
	 * 
	 * Generate first hand
	 * which correspond to draw three times
	 * 
	 */
	public void generateHand(){
		for (int i=0; i<3; i++){
			draw();
		}
	}
	
	/**
	 * 
	 * @param card Card object
	 * If the user have enough mana to use the card
	 * then this amount of mana is removed to the player mana
	 * the card is removed from the hand
	 * the use method of card is called
	 * 
	 */
	public void playCard(Card card){
		if (mana >= card.getManaCost()){
			card.setPlayer(this);
			Boolean b = card.use();
			if(b){
				hand.remove(card);
			}
		}else{
			System.out.println("Not enough mana !");
		}
	}
	
	/**
	 * 
	 * Add one point of mana to mana max of the player
	 * if he have less than 10 max mana points
	 * 
	 */
	public void gainMana(){
		if (mana_max < 10){
			this.mana_max = mana_max + 1;
		}
	}
	
	/**
	 * 
	 * Draw a random card and add it the the hand of the player
	 * 
	 */
	public void draw(){
		Random rand = new Random();
		String str_card = this.hero.getPlayable_cards().get(rand.nextInt(hero.getPlayable_cards().size()));
		Card new_card = this.getHero().getCards().getCard(str_card);
		new_card.setPlayer(this);
		hand.add(new_card);
	}
	
	/**
	 * 
	 * Display in the console every cards present in the player hand 
	 * 
	 */
	public void displayHand(){
		System.out.println("Cards in your hand");
		int i = 0;
		for (Card card : hand){
			System.out.println("Index "+i+"\n"+card.toString());
			i++;
		}
	}

	public void displayBoard(){
		board.displayMinionAsList();
	}

	/**
	 * @return the hand
	 */
	public ArrayList<Card> getHand() {
		return hand;
	}

	/**
	 * @param hand the hand to set
	 */
	public void setHand(ArrayList<Card> hand) {
		this.hand = hand;
	}

	/**
	 * @return the board
	 */
	public Board getBoard() {
		return board;
	}

	/**
	 * @param board the board to set
	 */
	public void setBoard(Board board) {
		this.board = board;
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
	 * @return the mana
	 */
	public int getMana() {
		return mana;
	}

	/**
	 * @param mana the mana to set
	 */
	public void setMana(int mana) {
		this.mana = mana;
	}

	/**
	 * @return the mana_max
	 */
	public int getMana_max() {
		return mana_max;
	}

	/**
	 * @param mana_max the mana_max to set
	 */
	public void setMana_max(int mana_max) {
		this.mana_max = mana_max;
	}

	/**
	 * @return the hero
	 */
	public Hero getHero() {
		return hero;
	}

	/**
	 * @param hero the hero to set
	 */
	public void setHero(Hero hero) {
		this.hero = hero;
	}

	/**
	 * @return the ennemy_player
	 */
	public Player getEnnemy_player() {
		return ennemy_player;
	}

	/**
	 * @param ennemy_player the ennemy_player to set
	 */
	public void setEnnemy_player(Player ennemy_player) {
		this.ennemy_player = ennemy_player;
	}

	/**
	 * @return the used_hero_power
	 */
	public boolean isUsed_hero_power() {
		return used_hero_power;
	}


	/**
	 * @param used_hero_power the used_hero_power to set
	 */
	public void setUsed_hero_power(boolean used_hero_power) {
		this.used_hero_power = used_hero_power;
	}

	/**
	 * Display in the console all infos about the hero
	 */
	public void displayMyHero () {
		System.out.println("My Hero");
		System.out.println("Hero index | Hero name | Hero life | Hero armor");
		System.out.println((getBoard().getMinions().size() + 1)+" | "+ getHero().getName()+" | "+ getHero().getCurrentHealth()+" | "+ getHero().getArmor());
	}
	
	/**
	 * Display in the console all infos about the enemy hero
	 */
	public void displayEnemyHero () {
		System.out.println("My Hero");
		System.out.println("Hero index | Hero name | Hero life | Hero armor");
		System.out.println((getEnnemy_player().getBoard().getMinions().size() + 1)+" | "+ getHero().getName()+" | "+ getHero().getCurrentHealth()+" | "+ getHero().getArmor());
	}
	
	/**
	 * Display in the console the current mana the player have
	 */
	public void displayMyMana() {
		System.out.println("My mana : "+mana);
	}
	
	/**
	 * Display in the console the mana of the player and infos about his hero
	 */
	public void displayMyInfos() {
		displayMyMana();
		displayMyHero();
	}
	
	public void wakeUpBoard() {
		for (Minion minion : getBoard().getMinions()){
			minion.setState(new MinionReadyState(minion));
		}
	}
	
}
