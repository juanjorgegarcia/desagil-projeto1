package br.pro.hashi.ensino.desagil.tequilada;
import java.io.*;  

import java.io.BufferedReader;

public class Reader {
	public static void main (String[] args) throws IOException {
		try{
			

			FileReader fr = new FileReader("maze.txt");
			BufferedReader br = new BufferedReader(fr);
			
			int line;
			int[] maze;
			
			while ((line = br.read()) != -1 ) {
				if ((line ==  '#')){
					line = 'X';
				}
	
				System.out.print((char) line);
				}
			}
		
		catch (IOException ex) {
			System.out.println("There was an error "
					+ "on reading the file");
			System.out.println("Verify if the file maze.txt "
					+ "is in the right path"
					+ " (inside the dir JuanGarcia)");
		}
	}

}
