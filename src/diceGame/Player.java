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
		this.balance = balance;
	}
	
	public int getID(){
		return id;
	}
	
	public void setID(int id){
		this.id = id;
	}
}
