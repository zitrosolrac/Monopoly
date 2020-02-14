package test;

import static org.junit.Assert.*;
import production.Player;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PlayerTest {

	Player player;
	String selectedToken;

	int moneyValue;

	@Before
	public void setUp() {
		player = new Player();
	}

	@After
	public void cleanUp() {
		player = null;
	}

	@Test
	public void testPlayerCreation() {
		assertNotNull(player);
	}

	@Test
	public void testAvailableTokenSelection() {
		selectedToken = "top hat";

		assertTrue(player.checkIfTokenSelectionIsValid(selectedToken));
	}

	@Test
	public void testNotAvailableTokenSelection() {
		selectedToken = "apple";

		assertFalse(player.checkIfTokenSelectionIsValid(selectedToken));
	}
	
	@Test
	public void testNormalization(){
		selectedToken = "Top HAt";
		String expectedValue = "Top hat";
		
		assertEquals(expectedValue, player.normalizeSelection(selectedToken));
		
	}
	
	@Test
	public void testNormalizationWithEmptyString(){
		selectedToken = "";
		String expectedValue = "";
		
		assertEquals(expectedValue, player.normalizeSelection(selectedToken));
		
	}
	
	
}
