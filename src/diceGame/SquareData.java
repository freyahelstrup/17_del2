package diceGame;

public class SquareData {

	private String[] names = {
			
			"Tower",
			"Crater",
			"Palace gates",
			"Cold Desert",
			"Walled city",
			"Monastery",
			"Black cave",
			"Huts in the mountain",
			"The Werewall",
			"The pit",
			"Goldmine"
			
	};
	
	
	private char[] effects = {
			
			0,
			0,
			0,
			0,
			0,
			0,
			0,
			0,
			1,
			0,
			0
			
	};
	

	private int[] ScoreChanges = {
			
			250,
			-100,
			100,
			-20,
			180,
			0,
			-70,
			60,
			-80,
			-50,
			650,
			
	};
	
	public String getName(int x){
	
		return names[x];
		
	}
	
	public char getEffect(int x){
		
		return effects[x];
		
	}
	
	public int getScoreChange(int x){
		
		return ScoreChanges[x];
		
	}

}

	
