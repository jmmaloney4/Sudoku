package com.four.sudoku;

public class Cell {
	protected boolean[] poss = new boolean[9];
	protected LCell parent;
	protected Row row;
	protected Column col;
	protected Puzzle puzzle;
	protected int value;
	protected boolean solved;
	protected int pos;

	public Cell() {
		this.pos = -1;
	}

	public LCell setParent(LCell parent) {
		this.parent = parent;
		return this.parent;
	}

	public LCell getParent() {
		return parent;
	}

	public Puzzle setPuzzle(Puzzle puzzle) {
		this.puzzle = puzzle;
		return this.puzzle;
	}

	public Puzzle getPuzzle() {
		return this.puzzle;
	}

	public void setAllNotPoss() {
		for (int a = 0; a < this.poss.length; a++) {
			this.poss[a] = false;
		}
	}

	public void setNotPoss(int num) {
		this.poss[num] = false;
	}

	public void setValue(int a) {
		if (a == 0) {
			this.setSolved();
		}
		this.value = a;
	}

	public int getValue() {
		return this.value;
	}

	public int setSolved() {
		this.setAllNotPoss();
		this.solved = true;
		return this.getValue();
	}

	public boolean isSolved() {
		return this.solved;
	}

	public void setPosition(int x) {
		this.pos = x;
	}

	public int getPosition() {
		return this.pos;
	}

	public Row getRow() {
		return row;
	}

	public void setRow(Row row) {
		this.row = row;
	}

	public Column getCol() {
		return col;
	}

	public void setCol(Column col) {
		this.col = col;
	}
}
