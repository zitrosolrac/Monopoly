package production;

import java.util.Random;

public class Dice {

	public int RollDice() {
		Random rand = new Random();

		int dieOne = rand.nextInt(5) + 1;
		int dieTwo = rand.nextInt(5) + 1;

		System.out.println("Die One: " + dieOne);
		System.out.println("Die Two: " + dieTwo);

		int diceValue = dieOne + dieTwo;

		System.out.println("Dice Total: " + diceValue);

		return diceValue;
	}

}