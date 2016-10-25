package diceGame;

public class GameLogic {
	private Player[] players;
	private DiceCup dice;
	private final int diceAmount;
	private final int diceSides;
	
	public GameLogic(){
		diceAmount = 2;		diceSides = 6;
		dice = new DiceCup(diceSides,diceAmount);
		
		resetGame(2,1000);
		
		
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
		
	}
	
//	private Player playTurn(Player player){
//		
//	}
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
