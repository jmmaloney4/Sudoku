package com.four.sudoku;

public class Puzzle {
	protected LCell[] contents = new LCell[9];
	protected Row[] rows = new Row[9];
	protected Column[] cols = new Column[9];
	protected int needed;

	public Puzzle() {

	}

	public int getNeeded() {
		return this.needed;
	}

	public Cell setValue(LCell lcell, Cell updated) {
		return updated;
	}

	public LCell[] getContents() {
		return this.contents;
	}

	public Row[] getRows() {
		return this.rows;
	}

	public Column[] getCols() {
		return this.cols;
	}
}
