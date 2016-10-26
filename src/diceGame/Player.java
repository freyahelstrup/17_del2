package diceGame;

public class Player {

	// attributes
	private int id, balance;
	
	
	// constructor
	public Player (int id, int balance)
	{
		
		this.id = id;
		this.balance = balance;
		
	}
	
	public int getBalance(){
		return balance;
	}
	
	public void setBalance(int balance){
		//player's balance should never be negative
		if (balance < 0){
			balance = 0;
		}
		this.balance = balance;
	}
	
	public int getID(){
		return id;
	}
	
	public void setID(int id){
		this.id = id;
	}
}
