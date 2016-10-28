package diceGame;

public class Square {
	//private int id; 
	private String name;
	private char effect; //'t' for extra turn, '0' for no effect
	private int scoreChange;
	
	public Square(/*int id,*/ String name, char effect, int scoreChange){
		//this.id = id;
		this.name = name;
		this.effect = effect;
		this.scoreChange = scoreChange;
	}
	
	/*
	public int getId(){
		return id;
	}*/
	
	public String getName(){
		return name;
	}
	
	public char getEffect(){
		return effect;
	}
	
	public int getScoreChange(){
		return scoreChange;
	}
	
}
