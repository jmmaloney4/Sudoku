package sudoku;

import java.util.Arrays;

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
		System.out.println("Setting " + value + " For The Cell At " + row
				+ ", " + column);
		Sudoku.UIMgr.SetText("Setting " + value + " For The Cell At " + row
				+ ", " + column);
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
		int[] sqvals = this.getSquareNums(row, column);

		for (int a = 0; a < rv.length; a++) {
			rv[a] = this.values[sqvals[a]];
		}

		return rv;
	}

	public boolean[][] getSquarePValues(int row, int column) {
		boolean[][] rv = new boolean[9][9];
		int[] sqvals = this.getSquareNums(row, column);

		for (int a = 0; a < rv.length; a++) {
			rv[a] = this.possibleValues[sqvals[a]];
		}

		return rv;
	}

	public void update(int row, int column, int update) {
		System.out.println("Updating Puzzle Because " + update
				+ " Was Added To The Puzzle At " + row + ", " + column + "...");
		Sudoku.UIMgr.SetText("Updating Puzzle Because " + update
				+ " Was Added To The Puzzle At " + row + ", " + column + "...");
		if (update != 9) {
			for (int a = 0; a < this.possibleValues.length; a++) {
				if (this.possibleValues[a][update] = true) {
					this.possibleCount[a]--;
					System.out
							.println("Subtracting one from the possible count for "
									+ row
									+ ", "
									+ column
									+ " to remove the possibility of " + update);
				}
				System.out.println("Removing A Possible Value Of " + update
						+ " For " + row + ", " + column);
				this.possibleValues[a][update] = false;
			}
		} else {
			System.out
					.println("Update was not completed, as the value was 0 and the puzzle does not need to be updated");
			Sudoku.UIMgr
					.SetText("Update was not completed, as the value was 0 and the puzzle does not need to be updated");
		}
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

	protected int[] getSquareNums(int row, int column) {
		int[] rv = new int[] { 0, 1, 2, 9, 10, 11, 18, 19, 20 };
		int sqnum = this.getSquare(row, column);
		switch (sqnum) {
		case 0:
			for (int a = 0; a < rv.length; a++) {
				rv[a] = rv[a] + 0;
			}
		case 1:
			for (int a = 0; a < rv.length; a++) {
				rv[a] = rv[a] + 3;
			}
		case 2:
			for (int a = 0; a < rv.length; a++) {
				rv[a] = rv[a] + 6;
			}
		case 3:
			for (int a = 0; a < rv.length; a++) {
				rv[a] = rv[a] + 27;
			}
		case 4:
			for (int a = 0; a < rv.length; a++) {
				rv[a] = rv[a] + 30;
			}
		case 5:
			for (int a = 0; a < rv.length; a++) {
				rv[a] = rv[a] + 33;
			}
		case 6:
			for (int a = 0; a < rv.length; a++) {
				rv[a] = rv[a] + 54;
			}
		case 7:
			for (int a = 0; a < rv.length; a++) {
				rv[a] = rv[a] + 57;
			}
		case 8:
			for (int a = 0; a < rv.length; a++) {
				rv[a] = rv[a] + 60;
			}
		}
		System.out.println("Returning " + Arrays.toString(rv)
				+ " As the Array Digits For Square "
				+ this.getSquare(row, column));
		return rv;
	}

	public int getColumn(int position) {
		int rv = position % 9;
		return rv;
	}

	public int getRow(int position) {
		int rv = position / 9;
		return rv;
	}

}
