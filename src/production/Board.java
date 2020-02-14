package production;

import java.util.ArrayList;

public class Board {

	public Space[] spaces = new Space[40];
	private ArrayList<String> names;

	public Board() {
		initBoard();
	}

	public void initBoard() {
		spaces[0] = new Property("", -1, ""); // Go
		spaces[1] = new Property("Mediterranean Avenue",60, "Brown" );
		spaces[2] = new Property("", -1, ""); // CC
		spaces[3] = new Property("Baltic Avenue", 60, "Brown");
		spaces[4] = new Property("", -1, ""); // income tax
		spaces[5] = new Property("", -1, ""); // Utility
		spaces[6] = new Property("Oriental Avenue", 100, "Light Blue");
		spaces[7] = new Property("", -1, ""); // Chance
		spaces[8] = new Property("Vermont Avenue", 100, "Light Blue");
		spaces[9] = new Property("Conneticut Avenue", 120, "Light Blue");
		spaces[10] = new Property("", -1, ""); // Jail
		spaces[11] = new Property("St. Charles' Place", 140, "Pink");
		spaces[12] = new Property("", -1, ""); // Electric
		spaces[13] = new Property("States Avenue", 140, "Pink");
		spaces[14] = new Property("Virginia Avenue", 160, "Pink");
		spaces[15] = new Property("", -1, ""); // Penn. RR
		spaces[16] = new Property("St. James Place", 180, "Orange");
		spaces[17] = new Property("", -1, ""); // CC
		spaces[18] = new Property("Tennessee Avenue", 180, "Orange");
		spaces[19] = new Property("New York Avenue", 200, "Orange");
		spaces[20] = new Property("", -1, ""); // free parking
		spaces[21] = new Property("Kentucky Avenue", 220, "Red");
		spaces[22] = new Property("", -1, ""); // Chance
		spaces[23] = new Property("Indiana Avenue", 220, "Red");
		spaces[24] = new Property("Illinois Avenue", 240, "Red");
		spaces[25] = new Property("", -1, ""); // B&O RR
		spaces[26] = new Property("Atlantic Avenue", 260, "Yellow");
		spaces[27] = new Property("Ventnor Avenue", 260, "Yello");
		spaces[28] = new Property("", -1, ""); // WaterWorks
		spaces[29] = new Property("Marvin Gardens", 280, "Yellow");
		spaces[30] = new Property("", -1, ""); // Go to Jail
		spaces[31] = new Property("Pacific Avenue", 300, "Green");
		spaces[32] = new Property("North Carolina Avenue", 300, "Green");
		spaces[33] = new Property("", -1, "");// CC
		spaces[34] = new Property("Pennsylvania Avenue", 320, "Green");
		spaces[35] = new Property("", -1, ""); // Shortline RR
		spaces[36] = new Property("", -1, ""); // Chance
		spaces[37] = new Property("Park Place", 350, "Dark Blue");
		spaces[38] = new Property("", -1, ""); // Luxury Tax
		spaces[39] = new Property("Boardwalk", 400, "Dark Blue");
		// while

	}

}
