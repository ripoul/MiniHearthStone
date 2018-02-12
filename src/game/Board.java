package game;

import java.util.ArrayList;

import card.minion.Minion;
import hero.Hero;

public class Board {
	
	private Hero hero;
	ArrayList<Minion> minions;
	
	public Board(Hero hero) {
		super();
		this.hero = hero;
		this.minions = new ArrayList<Minion>();
	}

	public Hero getHero() {
		return hero;
	}

	public void setHero(Hero hero) {
		this.hero = hero;
	}

	public ArrayList<Minion> getMinions() {
		return minions;
	}

	public void setMinions(ArrayList<Minion> minions) {
		this.minions = minions;
	}
	
	public void displayMinionAsList() {
		System.out.println("My Board");
		System.out.println("minion index | minion name | minion attack | minion life");
		for (int i = 0; i<= minions.size(); i++) {
			Minion minion = minions.get(i);
			System.out.println(i+" | "+minion.getName()+" | "+minion.getDamage()+" | "+minion.getHealth());
		}
	}
	
	
	
}
