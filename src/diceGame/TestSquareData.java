package diceGame;

import static org.junit.Assert.*;
import org.junit.Test;

public class TestSquareData {

	@Test //TC41
	public void test() {
		
	char[] testEffects = {
			' ',	
			' ',	
			' ',	
		    ' ',
			' ',
			' ',		
			' ',	
			' ',	
			't',	
			' ',	
			' '	
			};
	boolean effectTestPassed = true;
	for(int i=0; i<testEffects.length;i++){
		if(SquareData.getEffect(i) != testEffects [i]){
			effectTestPassed = false;
		}
	}
	
	
	
	String[] testNames = {
			"Tårn",					
			"Krater",				
			"Palads",				
			"Kold ørken",			
			"Bymur",				
			"Kloster",				
			"Grotte",				
			"Hytte i bjergene",		
			"Varulvemur",			
			"Hullet",				
			"Guldmine"
			};
	
	boolean namesTestPassed = true;
	for(int i=0; i<testNames.length;i++){
		if(SquareData.getName(i) != testNames[i]){
			namesTestPassed = false;
		}
	}
	
	

		int[] testScoreChanges = {
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
		boolean scoreChangesTestPassed = true;
		for(int i=0; i<testScoreChanges.length;i++){
			if(SquareData.getScoreChange(i) != testScoreChanges [i]){
				scoreChangesTestPassed = false;
			}
		}
		
		assertTrue("Error in effectTest",effectTestPassed);
		assertTrue("Error in namesTest",namesTestPassed);
		assertTrue("Error in scoreChangesTest",scoreChangesTestPassed);
		}
	}


