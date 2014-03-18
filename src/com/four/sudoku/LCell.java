package com.four.sudoku;

public class LCell extends Group {

	public LCell(int pos) {
		super(pos);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getType() {
		return Group.LCELL;
	}

	public void update(Cell u) {
		for (int a = 0; a < this.getContents().length; a++) {
			this.getContents()[a].setNotPoss(u.getValue());
		}
	}
}
