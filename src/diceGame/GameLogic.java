package diceGame;

public class GameLogic {
	private Board board;
	private Player[] players;
	private DiceCup dice;
	private final int diceAmount;
	private final int diceSides;
	
	public GameLogic(){
		diceAmount = 2;		diceSides = 6;
		dice = new DiceCup(diceSides,diceAmount);
		board = new Board();
		
		resetGame(3,1000);
		
		playGame();
	}
	
	public void resetGame(int playerAmount, int startBalance){
		players = new Player[playerAmount];
		for (int i = 0; i < players.length; i++){
			players[i] = new Player(i+1,startBalance);
		}
	}
	
	public Player getPlayer(int place){
		return players[place];
	}
	
	public void setPlayer(int place, Player player){
		players[place] = player;
	}
	
	public void playGame(){
		boolean winnerFound = false;
		Player currentPlayer, nextPlayer;
		
		//first player is player 1
		currentPlayer = players[0];
		
		while (winnerFound == false){
			nextPlayer = playTurn(currentPlayer);
			System.out.println("Spiller\tBalance");
			for (int i = 0; i < players.length; i++){
				System.out.println(players[i].getID() + "\t" + players[i].getBalance());
			}
			
			if (currentPlayer.getBalance() >= 3000){
				winnerFound = true;
			}
			
			currentPlayer = nextPlayer;
		}
	}
	
	private Player playTurn(Player currentPlayer){
		Square currentSquare;
		dice.setAllValuesRandom();
		System.out.println("\nTerningerne slog: " + dice.getDiceSum());
		
		currentSquare = board.getSquares()[dice.getDiceSum()-2];
		
		System.out.println("Spiller " + currentPlayer.getID() + " er landet på " + currentSquare.getName());
		
		currentPlayer.setBalance(currentPlayer.getBalance() + currentSquare.getScoreChange());
		
		if (currentSquare.getEffect() == 't'){
			System.out.println("Spiller " + currentPlayer.getID() + " har fået en ekstra tur!");
			return currentPlayer;
		}
		else{
			if (currentPlayer.getID() == players.length){
				return players[0];
			}
			else{
				return players[currentPlayer.getID()-1+1];
			}
		}	
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
