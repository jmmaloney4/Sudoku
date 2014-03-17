package com.four.sudoku;

public abstract class Group {
	protected Cell[] contents = new Cell[9];
	public static final int ROW = 0;
	public static final int COLUMN = 1;
	public static final int LCELL = 2;
	protected int position;

	public Cell[] getContents() {
		return this.contents;
	}

	public Group(int pos) {
		this.position = pos;
	}

	public abstract int getType();

	public int getPosition() {
		return this.position;
	}

}
