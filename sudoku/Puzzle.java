package sudoku;

public class Puzzle {

	protected int[] values;
	protected boolean[][] possibleValues = new boolean[81][9];
	protected int[] possibleCount = new int[81];

	public Puzzle() {
		values = new int[81];
		for (int a = 0; a < values.length; a++) {
			values[a] = 0;
		}

		for (int a = 0; a < possibleValues.length; a++) {
			possibleValues[a][0] = true;
			possibleValues[a][1] = true;
			possibleValues[a][2] = true;
			possibleValues[a][3] = true;
			possibleValues[a][4] = true;
			possibleValues[a][5] = true;
			possibleValues[a][6] = true;
			possibleValues[a][7] = true;
			possibleValues[a][8] = true;
			possibleCount[a] = 9;
		}
	}

	public void setValue(int row, int column, int value) {
		int a = getPosition(column, row);
		values[a] = value;
		System.out.println("Setting " + value + " For The Cell At " + column
				+ ", " + row);
	}

	/**
	 * returns the value at the specified location in the puzzle, where the
	 * first row is 1 and the first column is 1
	 * 
	 * @param coulumn
	 * @param row
	 * @return
	 */
	public int getValue(int row, int column) {
		int a = getPosition(column, row);
		System.out.println("Returning Value " + a + " To A Request For Column "
				+ column + " And Row " + row);
		return values[a];
	}

	public int[] getSquareValues(int row, int column) {
		int[] rv = new int[9];

		return rv;
	}

	public void update(int row, int column, int update) {
		System.out.println("Updating Puzzle Because We Added " + update
				+ " At " + row + ", " + column + "...");
		Sudoku.UIMgr.SetText("Updating Puzzle Because We Added " + update
				+ " At " + row + ", " + column + "...");

	}

	public int getPosition(int row, int column) {
		int rv = (((row) * 9) + column);
		return rv;
	}

	public int[] getPosCount() {
		return this.possibleCount;
	}

	public int getSquare(int row, int column) {
		int sqnum = 0;

		if (row < 3 && column < 3) {
			sqnum = 0;
		} else if (row < 3 && column < 6) {
			sqnum = 1;
		} else if (row < 3 && column < 9) {
			sqnum = 2;
		} else if (row < 6 && column < 3) {
			sqnum = 3;
		} else if (row < 6 && column < 6) {
			sqnum = 4;
		} else if (row < 6 && column < 9) {
			sqnum = 5;
		} else if (row < 9 && column < 3) {
			sqnum = 6;
		} else if (row < 9 && column < 6) {
			sqnum = 7;
		} else if (row < 9 && column < 9) {
			sqnum = 8;
		}
		System.out.println("Returning " + sqnum + " As The Square Number For "
				+ row + ", " + column);
		return sqnum;
	}
}
