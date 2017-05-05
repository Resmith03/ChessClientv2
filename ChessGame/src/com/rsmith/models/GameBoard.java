package com.rsmith.models;
import java.util.HashMap;
import com.rsmith.models.Game;

public class GameBoard {
	private String[][] boardState;
	private HashMap<String, GamePiece> pieceLocations;
	
	public GameBoard(String[][] boardState){
		this.boardState = boardState;
		this.pieceLocations = new HashMap<String, GamePiece>();
	}
	
	private String[][] getBoardState(){
		return boardState;
	}
	
	private void setBoardState(String[][] boardState){
		this.boardState = boardState;
	}
	
	private void printBoardState(){
		for(String[] row : boardState){
			
		}
	}
	
	public HashMap<String, GamePiece> getPieceLocations(){
		return pieceLocations;
	}
	
	public void setInitialPieceLocations(){
		pieceLocations.put("A2", new Pawn("white", "A2"));
		pieceLocations.put("B2", new Pawn("white", "B2"));
		pieceLocations.put("C2", new Pawn("white", "C2"));
		pieceLocations.put("D2", new Pawn("white", "D2"));
		pieceLocations.put("E2", new Pawn("white", "E2"));
		pieceLocations.put("F2", new Pawn("white", "F2"));
		pieceLocations.put("G2", new Pawn("white", "G2"));
		pieceLocations.put("H2", new Pawn("white", "H2"));
		
		pieceLocations.put("A1", new Rook("white", "A1"));
		pieceLocations.put("B1", new Knight("white", "B1"));
		pieceLocations.put("C1", new Bishop("white", "C1"));
		pieceLocations.put("D1", new Queen("white", "D1"));
		pieceLocations.put("E1", new King("white", "E1"));
		pieceLocations.put("F1", new Bishop("white", "F1"));
		pieceLocations.put("G1", new Knight("white", "G1"));
		pieceLocations.put("H1", new Rook("white", "H1"));
		
		pieceLocations.put("A7", new Pawn("black", "A7"));
		pieceLocations.put("B7", new Pawn("black", "B7"));
		pieceLocations.put("C7", new Pawn("black", "C7"));
		pieceLocations.put("D7", new Pawn("black", "D7"));
		pieceLocations.put("E7", new Pawn("black", "E7"));
		pieceLocations.put("F7", new Pawn("black", "F7"));
		pieceLocations.put("G7", new Pawn("black", "G7"));
		pieceLocations.put("H7", new Pawn("black", "H7"));
		
		pieceLocations.put("A8", new Rook("black", "A8"));
		pieceLocations.put("B8", new Knight("black", "B8"));
		pieceLocations.put("C8", new Bishop("black", "C8"));
		pieceLocations.put("D8", new Queen("black", "D8"));
		pieceLocations.put("E8", new King("black", "E8"));
		pieceLocations.put("F8", new Bishop("black", "F8"));
		pieceLocations.put("G8", new Knight("black", "G8"));
		pieceLocations.put("H8", new Rook("black", "H8"));
	}
	
	public void setPiece(String coord, GamePiece piece){
		pieceLocations.put(coord, piece);
	}
	
	public void removePiece(String coord){
		pieceLocations.remove(coord);
	}
	
	public void movePiece(String from, String to){
		GamePiece piece = pieceLocations.get(from);
		removePiece(from);
		setPiece(to, piece);
	}
}
