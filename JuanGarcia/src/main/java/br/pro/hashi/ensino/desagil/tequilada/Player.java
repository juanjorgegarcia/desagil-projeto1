package br.pro.hashi.ensino.desagil.tequilada;

public class Player {
	private int row; 
	private int col;
	
	  public Player(int row, int col) {
		    this.row = row;
		    this.col = col;
		  }
	
	void move (int rowShift, int colShift){
		this.row += rowShift;
		this.col += colShift;
	}
	
	public int getRow(){
		return this.row;
	}

	public int getCol(){
		return this.col;
	}
}
