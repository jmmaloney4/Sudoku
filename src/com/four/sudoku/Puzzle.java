package com.four.sudoku;

import java.util.Arrays;

public class Puzzle {

	protected LCell[] cells = new LCell[9];
	protected int needed;

	public Puzzle() {
		for (int b = 0; b < cells.length; b++) {
			cells[b].setParent(this);
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

	public Cell setValue(Cell cell) {
		this.update(cell);
		return cell;
	}

	public void debug_printArray() {
		System.out.println(Arrays.toString(cells));
	}

	public void update(Cell u) {
		u.ided = true;
		u.setAllNotPoss();
		for (int a = 0; a < u.cube.length; a++) {
			u.cube[a].setNotPossible(u.value);
		}

		for (int a = 0; a < u.row.length; a++) {
			u.row[a].setNotPossible(u.value);
		}

		for (int a = 0; a < u.col.length; a++) {
			u.col[a].setNotPossible(u.value);
		}

		for (int a = 0; a < u.getBigCol().length; a++) {
			u.getBigCol()[a].setAllNotPoss();
		}

		for (int a = 0; a < u.getBigRow().length; a++) {
			u.getBigRow()[a].setAllNotPoss();
		}
	}

	public int Solve() {
		Sudoku.UI.SetText("Solving...");

		return 0;
	}
}
