package diceGameTest;

import static org.junit.Assert.*;
import diceGame.*;

import org.junit.Test;

public class TestGameLogic {

	@Test
	public void testCase21() {
		int [] results = {12, 3};
		GameLogic game = new GameLogic(true, results);
		
		game.resetGame(2, 2900);
		game.playGame();
		
		Player[] players = game.getPlayers();
		
		assertEquals(players[0].getBalance(), 3550);
		assertEquals(players[1].getBalance(), 2800);
		
	}
	
	public void testCase22(){
		fail("not yet implemented");
	}
	
	public void testCase23(){
		fail("not yet implemented");
	}
	
	public void testCase24(){
		fail("not yet implemented");
	}

}
