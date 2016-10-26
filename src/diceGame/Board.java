package diceGame;

public class Board {
	private Square[] squares;
	
	public Board(){
		squares = new Square[11];
		
		squares[0] = new Square(2,"Tower",'0',250);
		squares[1] = new Square(3,"Crater",'0',-100);
		squares[2] = new Square(4,"Palace Gates",'0',100);
		squares[3] = new Square(5,"Cold Desert",'0',-20);
		squares[4] = new Square(6,"Walled City",'0',180);
		squares[5] = new Square(7,"Monastery",'0',0);
		squares[6] = new Square(8,"Black Cave",'0',-70);
		squares[7] = new Square(9,"Huts in the mountain",'0',60);
		squares[8] = new Square(10,"The Werewall (werewolf-wall)",'t',-80);
		squares[9] = new Square(11,"The pit",'0',-50);
		squares[10] = new Square(12,"Goldmine",'0',650);
		
	}

	public Square[] getSquares(){
		return squares;
	}
}
