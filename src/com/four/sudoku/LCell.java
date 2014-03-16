package com.four.sudoku;

public class LCell {

	Cell[] contents = new Cell[9];
	Puzzle parent;
	int pos;

	public LCell(int pos, Puzzle puzzle) {

	}

	public Puzzle setParent(Puzzle puzzle) {
		this.parent = puzzle;
		return puzzle;
	}

	public Cell[] getContents() {
		return this.contents;
	}

	public Cell setValue(int pos, Cell cell) {
		this.contents[pos] = cell;
		return cell;
	}

	public void setAllNotPoss() {

	}

}
