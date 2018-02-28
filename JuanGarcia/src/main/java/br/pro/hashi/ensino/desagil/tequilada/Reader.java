package br.pro.hashi.ensino.desagil.tequilada;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
public class Reader {
	public boolean[][] createMaze(String path) {
		BufferedReader reader = null;

		boolean readingHeader = true;
		String[] rowAndColSplit;

		int row = 0;
		int col = 0;
		boolean[][] isWall = new boolean[0][0];
		int rowCounter = 0;


		try {
			File file = new File(path);

			reader = new BufferedReader (new FileReader(file));

			String line;
			while ((line = reader.readLine()) != null) {

				if (readingHeader) {
					rowAndColSplit = line.split(" ");

					row = Integer.parseInt(rowAndColSplit[0]);
					col = Integer.parseInt(rowAndColSplit[1]);

					isWall = new boolean[row][col];

					readingHeader = false;
				}

				else {	
					for (int i = 0; i < col; i++) {
						if (line.charAt(i) == ' ') {
							isWall[rowCounter][i] = false;
						}
						else {
							isWall[rowCounter][i] = true;
						}
					}

					rowCounter++;
				}
			}
		}
		catch (IOException ex) {
			System.out.println("There was an error "
					+ "on reading the file");
			System.out.println("Verify if the file maze.txt "
					+ "is in the right path"
					+ " (inside the dir JuanGarcia)");
		}

		return isWall;
	}
}
