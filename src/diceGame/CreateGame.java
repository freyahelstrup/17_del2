package diceGame;

import desktop_resources.GUI;

public class CreateGame {

	public static void main(String[] args) {

		GameLogic game = new GameLogic();

		while (GUI.getUserButtonPressed("Vil du starte et nyt spil?", "Ja", "Nej") == "Ja") {
			game.resetGame(6, 2999);
			game.playGame();
		}
		
		GUI.close();

	}
}