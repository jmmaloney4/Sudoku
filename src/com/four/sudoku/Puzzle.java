package com.four.sudoku;

import java.util.Arrays;

public class Puzzle {

	protected int[] actual = new int[81];
	protected boolean[][] poss = new boolean[81][10];
	protected int needed;

	public Puzzle() {
		for (int a = 0; a < poss.length; a++) {
			for (int b = 0; b < poss[a].length; b++) {
				poss[a][b] = true;
			}
		}

		for (int b = 0; b < actual.length; b++) {
			actual[b] = -1;
		}
	}

	protected int getArrayPosFor(int row, int col) {
		int a = col * 9 + row;
		return a;
	}

	protected int[] getRowColFor(int x) {
		int[] rv = new int[2];
		int row = x % 9;
		int col = (x - row) / 9;
		rv[0] = row;
		rv[1] = col;
		return rv;
	}

	public int getNeeded() {
		return needed;
	}

	public int setValue(int pos, int x) {
		actual[pos] = x;
		if (x != 0) {
			for (int c = 0; c < poss[pos].length; c++) {
				poss[pos][c] = false;
			}
			poss[pos][x] = true;
		} else {
			for (int c = 0; c < poss[pos].length; c++) {
				poss[pos][c] = true;
			}
		}
		return x;
	}

	public void debug_printArray() {
		System.out.println(Arrays.toString(actual));
	}

	public int Solve() {
		Sudoku.UI.SetText("Solving...");
		for (int a = 0; a < this.poss.length; a++) {
			int c = 0;
			for (int b = 0; b < this.poss[a].length; b++) {
				if (poss[a][b] = true) {
					System.out.println("Found " + b
							+ " as a possible value at " + a);
					c = c + 1;
				}
			}

			if (c == 1) {
				for (int b = 0; b < this.poss[a].length; b++) {
					if (poss[a][b] = true) {
						this.setValue(a, b);
						Sudoku.UI.SetText("Found " + b + "at" + a);
					}
				}
			}
		}

		return 0;
	}
}
