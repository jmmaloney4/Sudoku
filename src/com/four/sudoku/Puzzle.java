package com.four.sudoku;

public class Puzzle {

	protected int[] actual = new int[81];
	protected boolean[][] poss = new boolean[81][9];
	protected int needed;

	public Puzzle() {
		for (int a = 0; a < poss.length; a++) {
			for (int b = 0; b < poss[a].length; b++) {
				poss[a][b] = true;
			}
		}

		for (int b = 0; b < actual.length; b++) {
			actual[b] = 0;
		}
	}

	protected int getArrayPosFor(int row, int col) {
		int a = col * 9 + row;
		return a;
	}

	public int getNeeded() {
		return needed;
	}

	public int setValue(int row, int col, int x) {
		int pos = getArrayPosFor(row, col);
		actual[pos] = x;
		if (x != 0) {
			for (int c = 0; c < poss[pos].length; c++) {
				poss[pos][c] = false;
			}
			poss[pos][x] = true;
		}
		return x;
	}
}
