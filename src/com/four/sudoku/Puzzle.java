package com.four.sudoku;

public class Puzzle {
	protected Cell[] contents = new Cell[81];
	protected Row[] rows = new Row[9];
	protected Column[] cols = new Column[9];
	protected LCell[] lcells = new LCell[9];
	protected int needed;

	public Puzzle() {

	}

	public int getNeeded() {
		return this.needed;
	}

	public Cell setValue(Cell u) {
		int pos = u.getPosition();
		this.contents[pos] = u;
		for (int a = 0;; a++) {
			if (a == pos) {

			}
		}
		// return u;
	}

	public Cell[] getContents() {
		return this.contents;
	}

	public Row[] getRows() {
		return this.rows;
	}

	public Column[] getCols() {
		return this.cols;
	}

	public int addNeeded() {
		this.needed++;
		return this.needed;
	}

	public boolean Solve() {

		return true;
	}

	public LCell[] getLCells() {
		return lcells;
	}

	public void setLCells(LCell[] lcells) {
		this.lcells = lcells;
	}

	public int getLCellForArrayPos(int a) {
		int r = 0;
		return r;
	}
}
