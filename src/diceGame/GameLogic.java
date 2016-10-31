package diceGame;

import desktop_resources.GUI;

public class GameLogic {
	private Board board; //An instance of the Board class
	private Player[] players; //An array of Players
	private DiceCup dice; //An instance of the DiceCup class
	private final int diceAmount; //The amount of dice used by the game
	private final int diceSides; //The number of sides the dice can have
	private final int winBalance; //The balance needed for the player to win the game
	
	//TESTVARIABLE
	private final boolean testMode;
	private int [] results = {}; 
	
	public GameLogic(){
		diceAmount = 2;		diceSides = 6;
		dice = new DiceCup(diceSides,diceAmount);
		board = new Board();
		
		winBalance = 3000;
		
		//TESTVARIABLES
		testMode = false;
	}
	
	public GameLogic(boolean testMode, int[] results){
		diceAmount = 2;		diceSides = 6;
		dice = new DiceCup(diceSides,diceAmount);
		board = new Board();
		
		winBalance = 3000;
		
		//TESTVARIABLES
		this.testMode = testMode;
		this.results = results;
	}
	
	public void resetGame(int playerAmount, int startBalance){
		players = new Player[playerAmount];
		for (int i = 0; i < players.length; i++){
			players[i] = new Player(i+1,startBalance);
		}
	}
//	
//	public Player getPlayer(int place){
//		return players[place];
//	}
//	
//	public void setPlayer(int place, Player player){
//		players[place] = player;
//	}
	
	public void playGame(){
		boolean lastTurn = false;
		int maxBalance = 0;
		int winnerAmount = 0;
		Player currentPlayer, nextPlayer;
		
		//TESTVARIABLES
		int resultCounter = 0;
		
		//first player is player 1
		currentPlayer = players[0];
		
		while (lastTurn == false || (lastTurn == true && currentPlayer != players[0])){
			GUI.getUserButtonPressed(Messages.getPlayers(players) + "\n\n" + Messages.printNextPlayer(currentPlayer), Messages.getGeneralMessages()[8]);
//			System.out.println(Messages.printNextPlayer(currentPlayer));
			nextPlayer = playTurn(currentPlayer, testMode, resultCounter);
			resultCounter++;
			
			System.out.println("Spiller\tBalance");
			for (int i = 0; i < players.length; i++){
				System.out.println(players[i].getID() + "\t" + players[i].getBalance());
			}
			
			System.out.println();

			if (currentPlayer.getBalance() >= winBalance){
				lastTurn = true;
				
				if (currentPlayer.getBalance() > maxBalance){
					maxBalance = currentPlayer.getBalance();
					winnerAmount = 1;
				}	
				else if (currentPlayer.getBalance() == maxBalance){
					winnerAmount++;
				}	
			}
			
			currentPlayer = nextPlayer;
		}
		
		Player[] winners = new Player[winnerAmount];
		
		int winnerArrayIndex = 0;
		for (int i = 0; i<players.length;i++){
			if (players[i].getBalance() == maxBalance){
				winners[winnerArrayIndex] = players[i];
				winnerArrayIndex++;
			}
		}
		
		GUI.showMessage(Messages.getPlayers(players) + "\n\n" + Messages.printWinners(winners));
//		System.out.println(Messages.printWinners(winners));

	}
	
	private Player playTurn(Player currentPlayer, boolean testMode, int resultCounter){
		Square currentSquare;
		dice.setAllValuesRandom();
//		System.out.println("\nSpiller " + currentPlayer.getID() + " slog: " + dice.getDiceSum());

		GUI.setDice(dice.getValues()[0], dice.getValues()[1]);
		
		//If the mode is not 0 and the result counter is within the bounds of the array, then make the square equal the result on the resultcounter's place
		if(testMode == true && resultCounter < results.length){
			currentSquare = board.getSquares()[results[resultCounter]];
		}
		//If the mode is 0 or the resultCounter has gone outside of the length of the array, then the result is random
		else{
			currentSquare = board.getSquares()[dice.getDiceSum()-2];
		}
		
		
		GUI.displayChanceCard(Messages.getSquareName(dice.getDiceSum()-2) + "<br><br>" + Messages.getSMessage(dice.getDiceSum()-2));
		
//		System.out.println(Messages.getSquareMessages()[dice.getDiceSum()-2]);
		
		currentPlayer.setBalance(currentPlayer.getBalance() + currentSquare.getScoreChange());

//		GUI.showMessage(Messages.getSMessage(dice.getDiceSum()-2) + "\n\n" + Messages.getBalance(currentPlayer));
		
		Player nextPlayer;
		
		if (currentSquare.getEffect() == 't'){
			nextPlayer = currentPlayer;
		}
		else{
			if (currentPlayer.getID() == players.length){
				nextPlayer = players[0];
			}
			else{
				nextPlayer = players[currentPlayer.getID()-1+1];
			}
		}
		
		return nextPlayer;
	}
//	
//	private void doScoreChange(Square square){
//		
//	}
//	
//	private boolean doExtraTurn(Square square){
//		
//	}
//	
//	private int[] declareWinner(){
//		
//	}
	
}
