package com.four.sudoku;

public class Column extends Group {

	protected SColumn[] cols = new SColumn[3];

	public Column(int pos) {
		super(pos);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getType() {
		return Group.COLUMN;
	}

	public SColumn[] getCols() {
		return cols;
	}

	public void setCols(SColumn[] cols) {
		this.cols = cols;
	}

}
