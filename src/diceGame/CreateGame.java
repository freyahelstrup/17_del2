package diceGame;

import desktop_resources.GUI;

public class CreateGame {

	public static void main(String[] args) {

		GameLogic game = new GameLogic();

		while (GUI.getUserButtonPressed("Vil du starte et nyt spil?", "Ja", "Nej") == "Ja") {
			game.playGame();
		}
		
		GUI.close();

	}
}