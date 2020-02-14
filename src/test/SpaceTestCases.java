package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.awt.Color;

import org.junit.After;
import org.junit.Test;

import production.Electric;
import production.Go;
import production.IncomeTax;
import production.Player;
import production.Property;
import production.RailRoad;

public class SpaceTestCases {
	
	Property propertyTile;
	IncomeTax incomeTaxTile;
	RailRoad railroadTile;
	Electric electricTile;
	Go goTile;
	Player player;
	
	@After
	public void tearDown(){
		propertyTile = null;
		incomeTaxTile = null;
		railroadTile = null;
		electricTile = null;
		player = null;
	}

	@Test
	public void testNotNullPropety() {
		propertyTile = new Property();
		assertNotNull(propertyTile);
	}
	@Test
	public void testCreateProperty1(){
		propertyTile = new Property();
		propertyTile.setColor("Grey");
		propertyTile.setCost(60);
		propertyTile.setName("Mediteranian Avenue");	
		
		assertEquals("Grey", propertyTile.getColor());
		assertEquals(60,propertyTile.getCost());
		assertEquals("Mediteranian Avenue", propertyTile.getName());
	}
	@Test
	public void testLandOnIncomeTaxTile200(){
		incomeTaxTile = new IncomeTax();
		player = new Player();
		
		player.setMoney(600);
		incomeTaxTile.collectTheMonies(player);
		
		int expectedMoney = 400;
		int actualMoney = player.getMoney();
		
		assertEquals(expectedMoney, actualMoney);
	}
	
	@Test
	public void testLandOnIncomeTaxTile10(){
		incomeTaxTile = new IncomeTax();
		player = new Player();
		
		player.setMoney(600);
		incomeTaxTile.collectTheMonies(player);
		
		int expectedMoney = 540;
		int actualMoney = player.getMoney();
		
		assertEquals(expectedMoney, actualMoney);
	}
	
	@Test
	public void testGoTile(){
		goTile = new Go();
		player = new Player();
		
		player.setMoney(1000);
		goTile.giveBasicIncome(player);
		
		int expectedMoney = 1200;
		int actualMoney = player.getMoney();
		
		assertEquals(expectedMoney, actualMoney);
	}
	
	@Test
	public void testRailRoad(){
		railroadTile = new RailRoad();
		player = new Player();
		
		player.setMoney(8000);
		railroadTile.collectRailroadFee(player);
		
		int expectedMoney = 7800;
		int actualMoney = player.getMoney();
		
		assertEquals(expectedMoney, actualMoney);
	}
	@Test
	public void testElectric(){
		electricTile = new Electric();
		player = new Player();
		
		player.setMoney(7000);
		electricTile.collectElectricFee(player);
		
		int expectedMoney = 6800;
		int actualMoney = player.getMoney();
		
		assertEquals(expectedMoney, actualMoney);
	}
}
