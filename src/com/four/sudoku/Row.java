package com.four.sudoku;

public class Row extends Group {

	protected SRow[] rows = new SRow[3];

	public Row(int pos) {
		super(pos);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getType() {
		return Group.ROW;
	}

	public SRow[] getRows() {
		return rows;
	}

	public void setRows(SRow[] rows) {
		this.rows = rows;
	}

}
