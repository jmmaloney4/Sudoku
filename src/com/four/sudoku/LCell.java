package com.four.sudoku;


public class LCell extends Group {

	protected SRow[] rows = new SRow[3];
	protected SColumn[] cols = new SColumn[3];

	// public static final int[] conts0 = {0, 1, 2, 9, 10, 11, 18, 19, 20};
	// public static final int[] conts1 = {3, 4, 5, 12, 13, 14, 21, 22, 23};
	// public static final int[] conts2 = {6, 7, 8, 15, 16, 17, 24, 25, 26};
	// public static final int[] conts3 = {27, 28, 29, 36, 37, 38, };
	// public static final int[] conts4 = ;
	// public static final int[] conts5 = ;
	// public static final int[] conts6 = ;
	// public static final int[] conts7 = ;
	// public static final int[] conts8 = ;

	public LCell(int pos) {
		super(pos);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getType() {
		return Group.LCELL;
	}
}
