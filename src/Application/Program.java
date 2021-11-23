package Application;


import chess.ChessMatch;

public class Program {

	public static void main(String[] args) throws RuntimeException{
		
		ChessMatch chessMatch = new ChessMatch();
		UI.printBoard(chessMatch.getPieces());
		
	}

}
