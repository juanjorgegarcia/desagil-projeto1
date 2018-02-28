package br.pro.hashi.ensino.desagil.tequilada;

public class Board {
	boolean[][] isWall;
	
	public void loadFromFile (String path){
		Reader reader = new Reader();
		isWall = reader.createMaze(path);
	}
	
}
