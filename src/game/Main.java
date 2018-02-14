package game;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import hero.Hero;
import hero.Mage;
import hero.Paladin;
import hero.Warrior;

public class Main {

	public static void main(String[] args) {
		
		Player first_player;
		Player second_player;
		
		ArrayList<Player> players = beginGame();
		
		first_player = players.get(0);
		second_player = players.get(1);
		
		while ((first_player.getHero().getCurrentHealth() > 0) || (second_player.getHero().getCurrentHealth() > 0)){
			firstPlayerTurn(first_player);
			secondPlayerTurn(second_player);
		}
		
	}

	private static void secondPlayerTurn(Player second_player) {
		System.out.println("It's your turn Player 2");
		turn(second_player);
	}

	private static void firstPlayerTurn(Player first_player) {
		System.out.println("It's your turn Player 1");
		turn(first_player);
		
	}

	private static void turn(Player player) {
		player.gainMana();
		player.draw();
		System.out.println("1 - Display your infos\n2 - Play a card\n3 - Use hero power\n4 - End your turn\n-1 - Return back to this choice list");
		int n;
		boolean end_turn = false;
		while (end_turn == false){
			Scanner reader = new Scanner(System.in);
			n = reader.nextInt();
			reader.close();
			switch(n){
			case 1:
				player.getBoard().displayMinionAsList();
				player.displayMyHero();
				break;
			case 2:
				player.displayHand();
				try {
					Scanner reader1 = new Scanner(System.in);
					n = reader1.nextInt();
					reader1.close();
					// TO DO
				}catch(IndexOutOfBoundsException e){
					//TO DO
				}
				break;
			case 3:
				break;
			case 4:
				end_turn = true;
				break;
			}
		}
	}

	private static ArrayList<Player> beginGame() {
		
		System.out.println("The game begin");
		System.out.println("Player 1 please select a hero in the list bellow :");
		System.out.println("Type 1 for Mage, type 2 for Paladin & type 3 for Warrior");
		Hero player_1_hero = null;
		int n = 0;
		Scanner reader = new Scanner(System.in);
		while (n != 1 && n!= 2 && n != 3){
			n = reader.nextInt();
		}
		switch(n){
		case 1:
			player_1_hero = new Mage();
			break;
		case 2:
			player_1_hero = new Paladin();
			break;
		case 3:
			player_1_hero = new Warrior();
			break;
		}
		System.out.println("Player 2 please select a hero in the list bellow :");
		System.out.println("Type 1 for Mage, type 2 for Paladin & type 3 for Warrior");

		Hero player_2_hero = null;
		n = 0;
		while (n != 1 && n!= 2 && n != 3){
			n = reader.nextInt();
		}
		reader.close();
		switch(n){
		case 1:
			player_2_hero = new Mage();
			break;
		case 2:
			player_2_hero = new Paladin();
			break;
		case 3:
			player_2_hero = new Warrior();
			break;
		}
		
		Player player1 = new Player("Player 1", player_1_hero);
		Player player2 = new Player("Player 2", player_2_hero);
		
		ArrayList<Player> players = new ArrayList<Player>();

		Random rn = new Random();
		int rand = rn.nextInt() % 2;
		
		if (rand == 1){
			System.out.println("Player 2 commence !");
			player2.generateHand();
			player1.generateHand();
			player1.draw();
			players.add(player2);
			players.add(player1);
		}else if (rand == 0){
			System.out.println("Player 1 commence !");
			player1.generateHand();
			player2.generateHand();
			player2.draw();
			players.add(player1);
			players.add(player2);
		}
		
		return players;
	}

}
