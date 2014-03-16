package com.four.sudoku;

public class Cell {
	int value = 0;
	Cell[] row = new Cell[9];
	Cell[] col = new Cell[9];
	Cell[] cube = new Cell[9];
	int[] cords = new int[2];
	Puzzle parent;
	int pos;
	boolean ided = !(this.value == 0);
	LCell[] bigrow = new LCell[3];
	LCell[] bigcol = new LCell[3];
	LCell lcell;
	boolean[] poss = new boolean[9];

	public Cell(Puzzle parent, int pos, int val) {
		this.parent = parent;
		this.pos = pos;
		this.value = val;
	}

	public boolean isUnidentified() {
		return !ided;
	}

	public int getRow() {
		return this.cords[0];
	}

	public int getCol() {
		return this.cords[1];
	}

	public Cell setValue(int x) {
		this.value = x;
		return this;
	}

	public Puzzle setParent(Puzzle puzzle) {
		this.parent = puzzle;
		return puzzle;
	}

	public int getPos() {
		return this.pos;
	}

	public int setPos(int x) {
		this.pos = x;
		return x;
	}

	public LCell[] getBigRow() {
		return this.bigrow;
	}

	public LCell[] getBigCol() {
		return this.bigcol;
	}

	public void update() {
	}

	public void setNotPossible(int num) {
		this.poss[num] = false;
	}

	public void setAllNotPoss() {
		for (int a = 0; a < this.poss.length; a++) {
			this.poss[a] = false;
		}
	}
}
