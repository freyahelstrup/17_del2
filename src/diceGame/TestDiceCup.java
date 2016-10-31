package diceGame;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestDiceCup {

	@Test
	public void test() {
		
		int[] Runs = new int[30000];
		
		Boolean FailOnce = false;
		int DiceSides = 6;
		
		DiceCup Cup = new DiceCup(DiceSides,1);
		
			for (int i = 0; i <= 30000; i++){
			
			Runs[i] = Cup.getDiceSum();
			
			}
			
				for (int n = 0; n <= 30000; n++){
					
					if (Runs[n] <= 0 || Runs[n] > DiceSides ){
						
						FailOnce = true;
						
				} 
					
			}
		
		assertEquals(FailOnce, false);
				
	}
		
}


