package production;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;



public class Game {

	public Board gameBoard;
	public ArrayList<Player> players;
	public Dice dice;
	
	
	public Game(){
		
		gameBoard = new Board();
		players = new ArrayList<Player>();
		dice = new Dice();
		
	}
	
	public int getNumberOfPlayers(Scanner sc){
		
		System.out.print("Enter how many players: ");
		int numOfPlayers = sc.nextInt();
		
		while(numOfPlayers < 2 || numOfPlayers > 4){
			System.out.print("Invalid number of players, enter again: ");
			numOfPlayers = sc.nextInt();
		}

		return numOfPlayers;
	}
	
	public void initializePlayerArray(){
		
		Scanner sc = new Scanner(System.in);
		int numberOfPlayers = getNumberOfPlayers(sc);
		sc.nextLine();
		while(numberOfPlayers > 0){
			Player tempPlayer = new Player();
			tempPlayer.chooseToken(sc);
			this.players.add(tempPlayer);
			numberOfPlayers--;
		}
		
	}
	
	public ArrayList<Player> getPlayers(){
		return players;
	}
	
	public void shufflePlayers(){
		Collections.shuffle(players);
	}
	
	public void takeTurn(){
		
		for(Player p : players){
			System.out.println("Current Player: " + p.getToken() + "Current Position: " + p.getCurrentSpace());
			int roll = dice.RollDice();
			p.setCurrentSpace((p.getCurrentSpace() + roll) % 40);
			int payment = gameBoard.spaces[p.getCurrentSpace()].doAction();
			if(payment != 0){
				p.setMoney(p.getMoney() - payment);
				p.addToOwnedProperties(gameBoard.spaces[p.getCurrentSpace()]);
				System.out.println(p.getMoney());
			}
		}
		
	}
	
	public void playGame(){
		
		this.initializePlayerArray();
		this.shufflePlayers();
		
		while(true){
			takeTurn();
		}
		
	}
	public static void main(String[] args){
		
		Game monopoly = new Game();
		monopoly.playGame();
	}
	
}
