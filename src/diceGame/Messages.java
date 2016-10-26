package diceGame;

public class Messages {

	//"names" is an array containing the names of each square on the board
	private static String[] squareNames = {"Tårn","Krater","Palads","Kold ørken","Bymur","Kloster","Grotte","Hytte i bjergene","Varulvemur","Hullet","Guldmine"};
	
	//"squareMessages" is an array containing the sentences correlating to each square on the board
	private static String[] squareMessages = {"Du møder en gal troldmand i et højt tårn. Han tryller dine bukser om til guld. Du sælger dem for 250."
			,"Du falder ned i et krater og kan ikke komme op. Åh nej! De lokale hjælper dig op, og du betaler dem 100 ud af taknemmelighed."
			,"Du kommer forbi indgangen til et stort palads. Det er Kejserens fødselsdag, og alle forbipasserende får gaver. Du sælger gaven for 100."
			,"Du skal igennem en gold og forfrossen ørken. Du køber de nødvendige resurser for at overleve. Betal 20."
			,"Du kommer til en by med høje mure. Indbyggerne kan ikke komme ud. De betaler dig 180 som tak, da du foreslår dem at lave en port i muren."
			,"Du ankommer til et kloster. Her har penge ingen betydning. Du filosoferer over hvorfor verden mon er så pengefikseret."
			,"Du skal gennem en mørk grotte. Du betaler en guide 70 for at vise dig vej."
			,"Du ankommer til en hytte i bjergene. Her møder du nogle venlige nisser. De giver dig 60."
			,"Du ankommer til en mur. En varulvemur! Du løber væk i frygt og kaster 80 over skulderen som distraktion. Du får en ekstra tur, fordi du skynder dig så meget!"
			,"Du taber 50 ned i et hul. Øv. Pas bedre på dine penge næste gang."
			,"Du har fundet guld i bjergene og sælger det for 650, du er rig!"};
	
	//"generelMessages" is an array containing all other sentences that are written on the user interface
	private static String[] generalMessages = {};
	
	//takes an integer into the array "names", and returns the name of the square for the given index
	public static String[] getSquareNames(){
		return squareNames;
	}
	//takes an integer into the array "squareMesseges", and returns the sentence correlating to the square for the given index
	public static String[] getSquareMessages(){
		return squareMessages;
	}
	//takes an integer into the array "generelMessages", and returns the sentence correlating to the given index
	public static String[] getGeneralMessages(){
		return generalMessages;
	}
	
	public static String printNextPlayer(Player nextPlayer){
		return "Det er spiller " + nextPlayer.getID() + "'s tur.";
	}
	
	public static String printWinners(Player[] winners){
		String returnValue = "";
		
		if (winners.length == 1){
			returnValue += "Vinderen er ";
		}
		else {
			returnValue += "Vinderne er ";
		}
		
		for (int i = 0; i<winners.length; i++){
			returnValue += "spiller " + winners[i].getID() + " og ";
		}
		
		returnValue = returnValue.substring(0, returnValue.length()-4) + ".";
		
		return returnValue;
	}
	
}
