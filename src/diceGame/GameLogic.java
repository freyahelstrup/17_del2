package diceGame;

public class GameLogic {
	private Player[] players;
	private final int diceAmount;
	private final int diceSides;
	
	public GameLogic(){
		resetGame(2,1000);
		
	}
	
	public void resetGame(int playerAmount, int startBalance){
		players = new Player[playerAmount];
		for (Player i : players){
			i.setBalance(startBalance);
		}
	}
	
	public Player getPlayer(int place){
		
	}
	
	public void setPlayer(int place, Player player){
		
	}
	
	public void playGame(){
		
	}
	
	private Player playTurn(Player player){
		
	}
	
	private void doScoreChange(Square square){
		
	}
	
	private boolean doExtraTurn(Square square){
		
	}
	
	private int[] declareWinner(){
		
	}
	
}
