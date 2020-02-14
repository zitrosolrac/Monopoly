package test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import production.Game;

public class GameTest {

	Game monopoly;
	int boardSize = 40;
	int twoPlayers = 2;
	int threePlayers = 3;
	int fourPlayers = 4;

	@Before
	public void setUp() {
		
		monopoly = new Game();
	}
	
	@After
	public void cleanUp() {
		
		monopoly = null;
	}
	
	@Test
	public void gameCreation(){
		
		assertNotNull(monopoly);
		
	}

	@Test
	public void playerInitializationTest(){
		
		assertNotNull(monopoly.players);
		
	}
	
	@Test
	public void boardInitializationTest(){
		assertNotNull(monopoly.gameBoard);
	}
	
	@Test
	public void checkNumberOfSpacesTest(){
		int actualBoardSize = monopoly.gameBoard.spaces.length;
		assertEquals(boardSize, actualBoardSize);
	}
	
	@Test
	public void checkDiceCreation(){
		assertNotNull(monopoly.dice);
	}
	
	@Test
	public void testTwoPlayers(){
		monopoly.initializePlayerArray();
		int numberOfPlayers = monopoly.players.size();
		assertEquals(twoPlayers, numberOfPlayers);
	}
}
