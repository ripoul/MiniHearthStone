package game;

import java.util.ArrayList;

import card.minion.Minion;
import hero.Hero;

/**
 * 
 * @author gguillet lbrisjules
 * 
 * Class Board
 *
 */

public class Board {
	
	private Hero hero;
	ArrayList<Minion> minions;
	
	/**
	 * @param hero Hero object which correspond to hero owning the board
	 */
	public Board(Hero hero) {
		super();
		this.hero = hero;
		this.minions = new ArrayList<Minion>(); //List of minion currently on the board
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
	 * @return the minions
	 */
	public ArrayList<Minion> getMinions() {
		return minions;
	}

	/**
	 * @param minions the minions to set
	 */
	public void setMinions(ArrayList<Minion> minions) {
		this.minions = minions;
	}

	/**
	 * Display in the console the list of minion presents on the board
	 */
	public void displayMinionAsList() {
		System.out.println("My Board");
		System.out.println("minion index | minion name | minion attack | minion life");
		if (minions.size() != 0){
			for (int i = 0; i< minions.size(); i++) {
				Minion minion = minions.get(i);
				System.out.println(i+" | "+minion.getName()+" | "+minion.getDamage()+" | "+minion.getHealth());
			}			
		}else{
			System.out.println("No minions on your board for the moment");
		}
	}
	
	
	
}
