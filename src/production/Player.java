package production;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Player {

	private Integer money;
	private String currentToken;
	private Integer currentSpace;
	private ArrayList<Space> propertiesOwned = new ArrayList<Space>();
	private static String[] ALLTOKENS = { "Battleship", "Boot", "Cannon",
			"Horse and rider", "Iron", "Racecar", "Dog", "Thimble", "Top hat",
			"Wheelbarrow" };
	private static ArrayList<String> availableTokens = new ArrayList<String>(Arrays.asList(ALLTOKENS));

	public Player() {
		money = 1500;
		currentSpace = 0;
	}

	public Player(String token) {
		money = 1500;
		currentToken = token;
	}
	
	public void addToOwnedProperties(Space s){
		this.propertiesOwned.add(s);
	}

	public Integer getMoney() {
		return money;
	}

	public void setMoney(Integer money) {
		this.money = money;
	}

	public String getToken() {
		return currentToken;
	}

	public void setToken(String token) {
		this.currentToken = token;
	}

	public Integer getCurrentSpace() {
		return currentSpace;
	}

	public void setCurrentSpace(Integer currentSpace) {
		this.currentSpace = currentSpace;
	}
	
	public void chooseToken(Scanner userInputScanner) {
//		Scanner userInputScanner = new Scanner(System.in);
		String selection = "";

		while (!checkIfTokenSelectionIsValid(selection)) {

			System.out.println("Available Token List:");
			System.out.println(availableTokens);

			System.out.print("\nSelection: ");
			selection = userInputScanner.nextLine().trim();

			selection = normalizeSelection(selection);
		}

//		System.out.println(selection);
		
		availableTokens.remove(selection);
//		System.out.println(availableTokens);
		
		setToken(selection);
		
//		userInputScanner.next();
//		userInputScanner.close();
	}

	public String normalizeSelection(String selection) {
		if(selection.length() == 0 || selection.length() == 1){
			return selection;
		}
		
		String firstCharOfSelection = selection.substring(0, 1);
		firstCharOfSelection = firstCharOfSelection.toUpperCase();

		String restOfSelection = selection.substring(1);
		restOfSelection = restOfSelection.toLowerCase();

		return firstCharOfSelection + restOfSelection;
	}

	public boolean checkIfTokenSelectionIsValid(String tokenSelection) {
		for (String s : availableTokens) {
			if (s.equalsIgnoreCase(tokenSelection)) {
				return true;
			}
		}

		return false;
	}

//	public static void main(String[] args) {
//		Player player = new Player();
//
//		player.chooseToken();
//		System.out.println(player.getAvailableTokens());
//	}

}
