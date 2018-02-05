package game;

import java.util.ArrayList;

import card.Card;
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
	
	public void draw(){
		//draw a card
	}
	
	public void summon(Minion m) {
		ArrayList<Minion> actual_minions = board.getMinions();
		actual_minions.add(m);
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

	public void remove(Minion m) {
		ArrayList<Minion> actual_minions = board.getMinions();
		actual_minions.remove(m);
	}

	public Hero getHero() {
		return hero;
	}

	public void setHero(Hero hero) {
		this.hero = hero;
	}
	
}
