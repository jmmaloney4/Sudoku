package com.four.sudoku;

public class Column extends Group {

	public Column(int pos) {
		super(pos);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getType() {
		return Group.COLUMN;
	}

}
