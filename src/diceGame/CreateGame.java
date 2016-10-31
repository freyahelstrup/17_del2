package diceGame;

import desktop_resources.GUI;

public class CreateGame {

	public static void main(String[] args) {

		GameLogic game = new GameLogic();

		while (GUI.getUserButtonPressed("Dette er et terningespil for to spillere. Spillet vindes ved at opnå en balance på 3000 først.\n\nVil du starte et nyt spil?", "Ja", "Nej") == "Ja") {
			game.resetGame(2, 1000);
			game.playGame();
		}
		
		GUI.close();

	}
}