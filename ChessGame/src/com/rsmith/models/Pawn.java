package com.rsmith.models;
import java.util.ArrayList;

public class Pawn implements GamePiece{
	private static final String TYPE = "Pawn";
	private String color;
	private String currentPosition;
	private ArrayList<String> validMoves;
	private int moveNumber;
	
	public Pawn(String color, String position){
		moveNumber = 1;
		this.color = color;
		currentPosition = position;
	}
	
	public String getType(){
		return TYPE;
	}
	
	public String getColor(){
		return color;
	}
	
	public ArrayList<String> getValidMoves(){
		return validMoves;
	}
	
	public String getCurrentPosition(){
		return currentPosition;
	}
	
	public ArrayList<String> findValidMoves(String currentPosition){
		char xCoord = currentPosition.charAt(0);
		int yCoord = Integer.valueOf(currentPosition.substring(1));
		ArrayList<String> validMoves = new ArrayList<String>();
		if(color.equals("white")){
			if (moveNumber == 1){
				validMoves.add(String.valueOf(xCoord)+String.valueOf(yCoord+2));
			}
			validMoves.add(String.valueOf(xCoord)+String.valueOf(yCoord+1));
		}
		else if(color.equals("black")){
			if (moveNumber == 1){
				validMoves.add(String.valueOf(xCoord)+String.valueOf(yCoord-2));
			}
			validMoves.add(String.valueOf(xCoord)+String.valueOf(yCoord-1));
		}
		this.validMoves = validMoves;
		return validMoves;
	}
	
	public void move(){
		moveNumber++;
	}
}
