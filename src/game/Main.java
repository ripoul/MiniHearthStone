package game;

import card.Card;
import card.minion.Minion;
import game.Observer.HeroLifeObserver;
import hero.Hero;
import hero.Mage;
import hero.Paladin;
import hero.Warrior;

import java.util.ArrayList;
import java.util.Random;

public class Main {
	public static void main(String[] args) {

		Player first_player;
		Player second_player;

		ArrayList<Player> players = beginGame();

		first_player = players.get(0);
		second_player = players.get(1);

		while (true){
			firstPlayerTurn(first_player);
			secondPlayerTurn(second_player);
		}

	}

	private static void secondPlayerTurn(Player second_player) {
		System.out.println("It's your turn Player 2");
		turn(second_player);
		second_player.wakeUpBoard();
	}

	private static void firstPlayerTurn(Player first_player) {
		System.out.println("It's your turn Player 1");
		turn(first_player);
		first_player.wakeUpBoard();

	}

	//méthode pour le déroulement d'un tour d'un joueur
	private static void turn(Player player) {
		player.gainMana();
		player.setMana(player.getMana_max());
		player.draw();
		int n;


		boolean end_turn = false;
		while (!end_turn){
			
			System.out.println("1 - Display your infos\n2 - Play a card\n3 - Use hero power\n4 - End your turn\n5 - use a card");

			n = Affichage.lireInt();
			switch(n){
				case 1:
					//affichage board + minions
					player.getBoard().displayMinionAsList();
					player.displayMyInfos();
					break;
				case 2:
					//joue une carte
					player.displayHand();
					try {
						n = Affichage.lireInt();
						ArrayList<Minion> board = player.getBoard().getMinions();
						Card minion = player.getHand().get(n);
						player.playCard(minion);

					}catch(IndexOutOfBoundsException e){}
					break;
				case 3:
					//utilise le pouvoir du hero
					player.getHero().setPlayer(player);
					player.useHeroPower();
					break;
				case 4:
					end_turn = true;
					player.wakeUpBoard();
					break;
				case 5:
					/* utilise une carte presente sur le board*/
					player.displayBoard();
					try{
						n = Affichage.lireInt();
						Minion minion = null;
						try {
							minion = player.getBoard().getMinions().get(n);
						}catch (IndexOutOfBoundsException e){
							System.out.println("Invalid option");
						}
						Player adv = player.getEnnemy_player();
						ArrayList<Minion> advMinion = adv.getBoard().getMinions();
						ArrayList<Minion> advMinionToDisplay = new ArrayList<>();

						for (Minion minion1 : advMinion) {
							if (minion1.isShould_be_attacked()){
								advMinionToDisplay.add(minion1);
							}
						}
						if (minion != null){
							if (advMinionToDisplay.isEmpty()){
								System.out.println("1: attaque hero\n2: attaque minion");
								n = Affichage.lireInt();
								if(n==1){
									minion.attack(player.getEnnemy_player().getHero());
								}else{
									adv.displayBoard();
									n = Affichage.lireInt();
									try{
										minion.attack(adv.getBoard().minions.get(n));
									}catch (IndexOutOfBoundsException e){
										System.out.println("Invalid option");
									}
								}
							}else{
								for (Minion minion1 : advMinionToDisplay) {
									System.out.println(minion1.toString());
								}
								n=Affichage.lireInt();
								try{
									minion.attack(advMinionToDisplay.get(n));
								}catch (IndexOutOfBoundsException e){
									System.out.println("Invalid option");
								}
							}
						}

					}catch (Exception e){
						e.printStackTrace();
					}
			}
		}

	}

	/*
	* methode pour permettre à l'utilisateur de choisir son hero
	*/
	private static ArrayList<Player> beginGame() {

		System.out.println("The game begin");
		System.out.println("Player 1 please select a hero in the list bellow :");
		System.out.println("Type 1 for Mage, type 2 for Paladin & type 3 for Warrior");
		Hero player_1_hero = null;
		int n = 0;
		while (n != 1 && n!= 2 && n != 3){
			n = Affichage.lireInt();
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
			n = Affichage.lireInt();
		}
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
		
		player1.setEnnemy_player(player2);
		player2.setEnnemy_player(player1);

		//enregistrement de l'observeur pour la vie du hero
		HeroLifeObserver obs1 = new HeroLifeObserver(player_1_hero);
		HeroLifeObserver obs2 = new HeroLifeObserver(player_2_hero);

		player1.getHero().enregistrerObs(obs1);
		player2.getHero().enregistrerObs(obs2);

		ArrayList<Player> players = new ArrayList<Player>();

		Random rn = new Random();
		int rand = rn.nextInt(2);
		
		if (rand == 1){
			System.out.println("Player 2 begin !");
			player2.generateHand();
			player1.generateHand();
			player1.draw();
			players.add(player2);
			players.add(player1);
		}else if (rand == 0){
			System.out.println("Player 1 begin !");
			player1.generateHand();
			player2.generateHand();
			player2.draw();
			players.add(player1);
			players.add(player2);
		}

		return players;
	}

	public static void debug(String s){
		System.out.println("-----------------------------DEBUG---------------------------------\n"+ s);
		System.out.println("---------------------------FIN DEBUG-------------------------------");
	}
}
