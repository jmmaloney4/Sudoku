package com.four.sudoku;

public class Puzzle {

	protected int[] actual = new int[81];
	protected boolean[][] poss = new boolean[81][9];
	
	public Puzzle() {
		for (int a = 0; a < poss.length; a++) {
			for (int b = 0; b < poss[a].length; b++) {
				poss[a][b] = true;
			}
		}
	}
	
	public int getArrayPosFor(int row, int col) {
		int a = col * 9 + row;
		return a;
	}
}
