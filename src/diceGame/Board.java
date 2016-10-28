package diceGame;

public class Board {
	private Square[] squares;
	
	public Board(){
		squares = new Square[11];

		for(int i = 0; i < getSquaresLength(); i++){
			squares[i] = new Square(SquareData.getName(i), SquareData.getEffect(i), SquareData.getScoreChange(i));
		}
		
		/*
		squares[0] = new Square("Tower",'0',250);
		squares[1] = new Square("Crater",'0',-100);
		squares[2] = new Square("Palace Gates",'0',100);
		squares[3] = new Square("Cold Desert",'0',-20);
		squares[4] = new Square("Walled City",'0',180);
		squares[5] = new Square("Monastery",'0',0);
		squares[6] = new Square("Black Cave",'0',-70);
		squares[7] = new Square("Huts in the mountain",'0',60);
		squares[8] = new Square("The Werewall (werewolf-wall)",'t',-80);
		squares[9] = new Square("The pit",'0',-50);
		squares[10] = new Square("Goldmine",'0',650);
		*/
		
	}

	public Square[] getSquares(){
		return squares;
	}
	
	public Square getSquare(int place){
		return squares[place];
	}
	
	private int getSquaresLength(){
		return squares.length;
	}
}
