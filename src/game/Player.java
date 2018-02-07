package game;

import java.util.ArrayList;
import java.util.Random;

import card.Card;
import card.CardFactory;
import card.minion.Minion;
import hero.Hero;

public class Player {

	private ArrayList<Card> hand;
	private Board board;
	private String name;
	private int mana;
	private Hero hero;
	
	public Player(String name, Hero hero) {
		super();
		this.hand = new ArrayList<Card>();
		this.board = new Board(hero);
		this.name = name;
		this.mana = 1;
	}
	
	public void generateHand(){
		for (int i=0; i<3; i++){
			draw();
		}
	}
	
	public void playCard(Card card){
		if (mana > card.getManaCost()){
			card.use();
			hand.remove(card);
		}
	}
	
	public void draw(){
		Random rand = new Random();
		String str_card = hero.getPlayable_cards().get(rand.nextInt(hero.getPlayable_cards().size()));
		hand.add(CardFactory.getCard(str_card));
	}
	
	public ArrayList<Card> getHand() {
		return hand;
	}

	public void setHand(ArrayList<Card> hand) {
		this.hand = hand;
	}

	public Board getBoard() {
		return board;
	}

	public void setBoard(Board board) {
		this.board = board;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMana() {
		return mana;
	}

	public void setMana(int mana) {
		this.mana = mana;
	}

	public Hero getHero() {
		return hero;
	}

	public void setHero(Hero hero) {
		this.hero = hero;
	}
	
}
