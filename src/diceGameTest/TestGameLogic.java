package diceGameTest;

import static org.junit.Assert.*;
import diceGame.*;

import org.junit.Test;

import desktop_resources.GUI;

public class TestGameLogic {

	@Test
	public void testCase21() {
		int [] results = {12, 3};
		GameLogic game = new GameLogic(true, results);
		
		GUI.getUserButtonPressed("","TC21");
		
		game.resetGame(2, 2900);
		game.playGame();
		
		Player[] players = game.getPlayers();
		
		assertEquals(players[0].getBalance(), 3550);
		assertEquals(players[1].getBalance(), 2800);
		
	}
	
	@Test
	public void testCase22(){
		int [] results = {12, 12};
		GameLogic game = new GameLogic(true, results);
		
		GUI.getUserButtonPressed("","TC22");
		
		game.resetGame(2, 2900);
		game.playGame();
		
		Player[] players = game.getPlayers();
		
		assertEquals(players[0].getBalance(), 3550);
		assertEquals(players[1].getBalance(), 3550);
	}
	
	@Test
	public void testCase23(){
		int [] results = {12, 2};
		GameLogic game = new GameLogic(true, results);
		
		GUI.getUserButtonPressed("","TC23");
		
		game.resetGame(2, 2900);
		game.playGame();
		
		Player[] players = game.getPlayers();
		
		assertEquals(players[0].getBalance(), 3550);
		assertEquals(players[1].getBalance(), 3150);
	}
	
	@Test
	public void testCase24(){
		int [] results = {10, 12, 5};
		GameLogic game = new GameLogic(true, results);
		
		GUI.getUserButtonPressed("","TC24");
		
		game.resetGame(2, 2900);
		game.playGame();
		
		Player[] players = game.getPlayers();
		
		assertEquals(players[0].getBalance(), 3470);
		assertEquals(players[1].getBalance(), 2880);
	}

	@Test
	public void testCase25(){
		int [] results = {2, 12};
		GameLogic game = new GameLogic(true, results);
		
		GUI.getUserButtonPressed("","TC25");
		
		game.resetGame(2, 2900);
		game.playGame();
		
		Player[] players = game.getPlayers();
		
		assertEquals(players[0].getBalance(), 3150);
		assertEquals(players[1].getBalance(), 3550);
	}
	
	@Test
	public void testCase26(){
		GameLogic game = new GameLogic();
		
		game.resetGame(2, 1000);

		Player[] players = game.getPlayers();
		
		assertEquals(players[0].getBalance(), 1000);
		assertEquals(players[1].getBalance(), 1000);
		assertEquals(players.length,2);
	}
}
