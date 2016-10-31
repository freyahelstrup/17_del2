package diceGame;

public class SquareData {

	private static String[] names = Messages.getSquareNames(); 
	//To make translation easier, the names must come from the Messages class
	
	private static char[] effects = {
	//Array for tiles which gives an extra turn - ' ' for no extra turn ; t for extra turn
			
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
	

	private static int[] scoreChanges = {
	//Array for Balance change values for when a player steps on a tile
			
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
	
	
	//Names are stores in Messages class
	public static String getName(int place){
	
		return names[place];
		
	}
	
	//Method to check if tile gives an extra turn
	public static char getEffect(int place){
		
		return effects[place];
		
	}
	
	//Method to get balance change values
	public static int getScoreChange(int place){
		
		return scoreChanges[place];
		
	}

	
}

	
