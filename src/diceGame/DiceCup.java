package diceGame;

public class DiceCup {
	private int[] values;
	private int diceSides;
	
	public DiceCup(int diceSides, int diceAmount){
		values = new int[diceAmount];
		this.diceSides = diceSides;	
		this.setAllValuesRandom();
	}
	
	public int[] getValues(){
		return values;
	}
	
	public void setSingleValue(int place, int newValue){
		values[place] = newValue;
	}
	
	public void setAllValues(int[] values){
		this.values = values;
	}

	public int getDiceSum(){
		int sum = 0;
		for (int i = 0; i<values.length;i++){
			sum += values[i];
		}
		return sum;
	}
	
	public void setAllValuesRandom(){
		for (int i = 0; i < values.length; i++){
			values[i] = ( (int) (Math.random()*diceSides)+1);
		}
	}
}
