package diceGameTest;

import diceGame.Player;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestPlayer {

	@Test //TC11
	public void testConstructor() {
//		int id = 1, balance = 1000;
//		int id = 2, balance = -1000;
		int id = 3, balance = 0;
		
		Player player = new Player(id,balance);
		
		if (balance < 0){
			balance = 0;
		}
		
		assertEquals(player.getID(),id);
		assertEquals(player.getBalance(),balance);
	}

	@Test //TC12
	public void testBalanceMethods() {
		int id = 2, balance = 0;
//		int newBalance = 1000;
		int newBalance = -1000;
//		int newBalance = 0;

		Player player = new Player(id,balance);
		
		player.setBalance(newBalance);
		
		if (newBalance < 0){
			newBalance = 0;
		}
		
		assertEquals(player.getBalance(),newBalance);
	}

	@Test //TC13
	public void testIdMethods() {
		int id = 3, balance = 0;
//		int newId = 10;
//		int newId = -10;
		int newId = 0;

		Player player = new Player(id,balance);
		
		player.setID(newId);
		
		assertEquals(player.getID(),newId);
	}

}
