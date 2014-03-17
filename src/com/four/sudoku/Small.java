package com.four.sudoku;

public abstract class Small {
	protected Cell[] contents = new Cell[3];
	protected int pos;
	protected Group parent;
	protected LCell lcell;
	protected int Type;
	protected Puzzle puzzle;
	public static final int SROW = 0;
	public static final int SCOLUMN = 1;

	public int getType() {
		return this.Type;
	}

	public Small(int Type) {
		this.Type = Type;
	}

	public LCell setLCell(LCell lcell) {
		this.lcell = lcell;
		return this.lcell;
	}

	public LCell getLCell() {
		return this.lcell;
	}

	public Puzzle setPuzzle(Puzzle puzzle) {
		this.puzzle = puzzle;
		return this.puzzle;
	}

	public Puzzle getPuzzle() {
		return this.puzzle;
	}
}
