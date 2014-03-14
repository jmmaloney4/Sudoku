package com.four.sudoku;

public class Puzzle {

	protected int[] actual = new int[81];
	protected boolean[][] possable = new boolean[81][9];
	
	public Puzzle() {
		System.out.println(possable.length);
		System.out.println(possable[0].length);
	}
	
	public int getArrayPosFor(int row, int col) {
		a = col * 9
	}
}
