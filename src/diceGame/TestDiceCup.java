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

		for (int i = 0; i < 30000; i++){

			Cup.setAllValuesRandom();
			Runs[i] = Cup.getDiceSum();
			
			if (Runs[i] <= 0 || Runs[i] > DiceSides ){
				
				FailOnce = true;
			
			}
		}

		assertEquals(FailOnce, false);

	}

}


