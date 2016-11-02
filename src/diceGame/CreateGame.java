package diceGame;

import desktop_resources.GUI;

public class CreateGame {

	public static void main(String[] args) {

		GameLogic game = new GameLogic();

		while (GUI.getUserButtonPressed(Messages.getGMessage(11), Messages.getGMessage(12), Messages.getGMessage(13)) == Messages.getGMessage(12)) {
			game.resetGame(2, 1000);
			game.playGame();
		}
		
		GUI.close();

	}
}