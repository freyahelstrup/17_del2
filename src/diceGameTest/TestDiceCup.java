package diceGameTest;

import static org.junit.Assert.*;

import org.junit.Test;

import diceGame.DiceCup;

public class TestDiceCup {

	@Test
	//TC01
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
	
	/***************************************
 	TC02
 	Test to see if dice returns the 6 values
 	randomly, so none is more frequent.
 	We test 60,000 rolls, and therefore 
 	expect 10,000 of each value - with an 
 	acceptable difference of 400.
 	This means that we accept between 9,600
 	and 10,400 of each value.
	**************************************/
	@Test
	public void testRandomness() 
	{
		boolean resultApproved;
		int n = 60000;
		DiceCup dice = new DiceCup(6,1);
		int[] results = new int[6];
		
		//Loop running n times
		for (int i=1;i<=n;i++)
		{
			dice.setAllValuesRandom(); //Roll the dice
			
			results[dice.getValues()[0]-1]++;
		}

		int resultSum = 0;
		for (int i=1;i<=6;i++){
			System.out.println("Antal " + i + "'ere ud af " + n + " kast: " + results[i-1]);
			resultSum+= results[i-1];
		}
		System.out.println("Sum af counters: " + resultSum);
		
		final double EXPECTED, MAX, MIN, ACCEPTABLEDIFFERENCE;
		EXPECTED = n*(1.0/6.0); //We expect 1/6 of the rolls to be each value
		ACCEPTABLEDIFFERENCE = EXPECTED * 0.04; //We accept a difference of 4%
		MIN = EXPECTED-ACCEPTABLEDIFFERENCE;
		MAX = EXPECTED+ACCEPTABLEDIFFERENCE;
		
		if (results[0] >= MIN && results[0] <= MAX
			&& results[1] >= MIN && results[1] <= MAX
			&& results[2] >= MIN && results[2] <= MAX
			&& results[3] >= MIN && results[3] <= MAX
			&& results[4] >= MIN && results[4] <= MAX
			&& results[5] >= MIN && results[5] <= MAX)
		{
			resultApproved = true; //If number of each value meets our expectation
		}
		else
		{
			resultApproved = false; //If number of each value does NOT meet our expectation
		}
		
		assertEquals(true,resultApproved);
	}

}


