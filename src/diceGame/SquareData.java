package diceGame;

public class SquareData {

	private String[] names = Messages.getSquareNames(); 
	//To make translation easier, the names must come from the Messages class
	
	private char[] effects = {
			
			' ',	//0
			' ',	//1
			' ',	//2
			' ',	//3
			' ',	//4
			' ',	//5
			' ',	//6
			' ',	//7
			't',	//8
			' ',	//9
			' '		//10
			
	};
	

	private int[] ScoreChanges = {
			
			250,	//0
			-100,	//1
			100,	//2
			-20,	//3
			180,	//4
			0,		//5
			-70,	//6
			60,		//7
			-80,	//8
			-50,	//9
			650,	//10
			
	};
	
	public String getName(int place){
	
		return names[place];
		
	}
	
	public char getEffect(int place){
		
		return effects[place];
		
	}
	
	public int getScoreChange(int place){
		
		return ScoreChanges[place];
		
	}

	
}

	
