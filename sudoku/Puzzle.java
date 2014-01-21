package sudoku;

import java.util.Arrays;

public class Puzzle {

	protected int[] values;
	protected boolean[][] possibleValues = new boolean[81][9];

	public Puzzle() {
		values = new int[81];
		for (int a = 0; a < values.length; a++) {
			values[a] = 0;
		}
	}

	public Puzzle(int[] values) {
		this.values = values;
	}

	public int[] getValues() {
		return values;
	}

	public void setValue(int column, int row, int value) {
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
	public int getValue(int column, int row) {
		int a = getPosition(column, row);
		System.out.println("Returning Value " + a + " To A Request For Column "
				+ column + " And Row " + row);
		return values[a];
	}

	public boolean[] getPossibleValues(int column, int row) {
		int a = getPosition(column, row);
		System.out.println("Returning Value "
				+ Arrays.toString(possibleValues[a])
				+ " To A Request For Possible Values For Column " + column
				+ " And Row " + row);
		return possibleValues[a];
	}

	public void setPossibleValues(int column, int row, boolean[] posVals) {
		int a = getPosition(column, row);
		System.out.println("Setting Possible Values To "
				+ Arrays.toString(posVals) + " For Column " + column
				+ " And Row " + row);
		possibleValues[a] = posVals;
	}

	public void setPossibleValue1(int column, int row) {
		int a = getPosition(column, row);
		System.out.println("Setting 1 As A Possible Value To For Column "
				+ column + " And Row " + row);
		possibleValues[a][1] = true;
	}

	public void setPossibleValue2(int column, int row) {
		int a = getPosition(column, row);
		System.out.println("Setting 1=2 As A Possible Value To For Column "
				+ column + " And Row " + row);
		possibleValues[a][2] = true;
	}

	public void setPossibleValue3(int column, int row) {
		int a = getPosition(column, row);
		System.out.println("Setting 3 As A Possible Value To For Column "
				+ column + " And Row " + row);
		possibleValues[a][3] = true;
	}

	public void setPossibleValue4(int column, int row) {
		int a = getPosition(column, row);
		System.out.println("Setting 4 As A Possible Value To For Column "
				+ column + " And Row " + row);
		possibleValues[a][4] = true;
	}

	public void setPossibleValue5(int column, int row) {
		int a = getPosition(column, row);
		System.out.println("Setting 5 As A Possible Value To For Column "
				+ column + " And Row " + row);
		possibleValues[a][5] = true;
	}

	public void setPossibleValue6(int column, int row) {
		int a = getPosition(column, row);
		System.out.println("Setting 6 As A Possible Value To For Column "
				+ column + " And Row " + row);
		possibleValues[a][6] = true;
	}

	public void setPossibleValue7(int column, int row) {
		int a = getPosition(column, row);
		System.out.println("Setting 7 As A Possible Value To For Column "
				+ column + " And Row " + row);
		possibleValues[a][7] = true;
	}

	public void setPossibleValue8(int column, int row) {
		int a = getPosition(column, row);
		System.out.println("Setting 8 As A Possible Value To For Column "
				+ column + " And Row " + row);
		possibleValues[a][8] = true;
	}

	public void setPossibleValue9(int column, int row) {
		int a = getPosition(column, row);
		System.out.println("Setting 9 As A Possible Value To For Column "
				+ column + " And Row " + row);
		possibleValues[a][9] = true;
	}

	public void setNotPossible1(int column, int row) {
		int a = getPosition(column, row);
		System.out.println("Setting 1 As A Possible Value To For Column "
				+ column + " And Row " + row);
		possibleValues[a][1] = false;
	}

	public void setNotPossible2(int column, int row) {
		int a = getPosition(column, row);
		System.out.println("Setting 2 As A Possible Value To For Column "
				+ column + " And Row " + row);
		possibleValues[a][2] = false;
	}

	public void setNotPossible3(int column, int row) {
		int a = getPosition(column, row);
		System.out.println("Setting 3 As A Possible Value To For Column "
				+ column + " And Row " + row);
		possibleValues[a][3] = false;
	}

	public void setNotPossible4(int column, int row) {
		int a = getPosition(column, row);
		System.out.println("Setting 4 As A Possible Value To For Column "
				+ column + " And Row " + row);
		possibleValues[a][4] = false;
	}

	public void setNotPossible5(int column, int row) {
		int a = getPosition(column, row);
		System.out.println("Setting 5 As A Possible Value To For Column "
				+ column + " And Row " + row);
		possibleValues[a][5] = false;
	}

	public void setNotPossible6(int column, int row) {
		int a = getPosition(column, row);
		System.out.println("Setting 6 As A Possible Value To For Column "
				+ column + " And Row " + row);
		possibleValues[a][6] = false;
	}

	public void setNotPossible7(int column, int row) {
		int a = getPosition(column, row);
		System.out.println("Setting 7 As A Possible Value To For Column "
				+ column + " And Row " + row);
		possibleValues[a][7] = false;
	}

	public void setNotPossible8(int column, int row) {
		int a = getPosition(column, row);
		System.out.println("Setting 8 As A Possible Value To For Column "
				+ column + " And Row " + row);
		possibleValues[a][8] = false;
	}

	public void setNotPossible9(int column, int row) {
		int a = getPosition(column, row);
		System.out.println("Setting 9 As A Possible Value To For Column "
				+ column + " And Row " + row);
		possibleValues[a][9] = false;
	}

	public int[] getRow(int r) {
		int[] rv = new int[9];
		rv[0] = this.getValue(1, r);
		rv[1] = this.getValue(2, r);
		rv[2] = this.getValue(3, r);
		rv[3] = this.getValue(4, r);
		rv[4] = this.getValue(5, r);
		rv[5] = this.getValue(6, r);
		rv[6] = this.getValue(7, r);
		rv[7] = this.getValue(8, r);
		rv[8] = this.getValue(9, r);
		System.out.println("Returning " + Arrays.toString(rv) + " As Row " + r);
		return rv;
	}

	public int[] getColumn(int c) {
		int[] rv = new int[9];
		rv[0] = this.getValue(c, 1);
		rv[1] = this.getValue(c, 2);
		rv[2] = this.getValue(c, 3);
		rv[3] = this.getValue(c, 4);
		rv[4] = this.getValue(c, 5);
		rv[5] = this.getValue(c, 6);
		rv[6] = this.getValue(c, 7);
		rv[7] = this.getValue(c, 8);
		rv[8] = this.getValue(c, 9);
		System.out.println("Returning " + Arrays.toString(rv) + " As Column "
				+ c);
		return rv;
	}

	public boolean[][] getRowPVals(int r) {
		boolean[][] rv = new boolean[9][9];
		rv[0] = this.getPossibleValues(0, r);
		rv[1] = this.getPossibleValues(1, r);
		rv[2] = this.getPossibleValues(2, r);
		rv[3] = this.getPossibleValues(3, r);
		rv[4] = this.getPossibleValues(4, r);
		rv[5] = this.getPossibleValues(5, r);
		rv[6] = this.getPossibleValues(6, r);
		rv[7] = this.getPossibleValues(7, r);
		rv[8] = this.getPossibleValues(8, r);
		System.out.println("Returning " + Arrays.toString(rv) + " As Row " + r);
		return rv;
	}

	public boolean[][] getColumnPVals(int c) {
		boolean[][] rv = new boolean[9][9];
		rv[0] = this.getPossibleValues(c, 0);
		rv[1] = this.getPossibleValues(c, 1);
		rv[2] = this.getPossibleValues(c, 2);
		rv[3] = this.getPossibleValues(c, 3);
		rv[4] = this.getPossibleValues(c, 4);
		rv[5] = this.getPossibleValues(c, 5);
		rv[6] = this.getPossibleValues(c, 6);
		rv[7] = this.getPossibleValues(c, 7);
		rv[8] = this.getPossibleValues(c, 8);
		System.out.println("Returning " + Arrays.toString(rv) + " As Column "
				+ c);
		return rv;
	}

	public int[] getSquare(int column, int row) {
		int c = 0;
		int r = 0;
		int[] rv = new int[9];

		switch (column) {
		case 1:
			c = 1;
			break;
		case 2:
			c = 1;
			break;
		case 3:
			c = 1;
			break;
		case 4:
			c = 2;
			break;
		case 5:
			c = 2;
			break;
		case 6:
			c = 2;
			break;
		case 7:
			c = 3;
			break;
		case 8:
			c = 3;
			break;
		case 9:
			c = 3;
			break;
		}

		switch (row) {
		case 1:
			r = 1;
			break;
		case 2:
			r = 1;
			break;
		case 3:
			r = 1;
			break;
		case 4:
			r = 2;
			break;
		case 5:
			r = 2;
			break;
		case 6:
			r = 2;
			break;
		case 7:
			r = 3;
			break;
		case 8:
			r = 3;
			break;
		case 9:
			r = 3;
			break;
		}

		if (r == 1 && c == 1) {
			rv[1] = this.getValue(1, 1);
			rv[1] = this.getValue(2, 1);
			rv[1] = this.getValue(3, 1);
			rv[1] = this.getValue(1, 2);
			rv[1] = this.getValue(2, 2);
			rv[1] = this.getValue(3, 2);
			rv[1] = this.getValue(1, 3);
			rv[1] = this.getValue(2, 3);
			rv[1] = this.getValue(3, 3);
		}

		if (r == 2 && c == 1) {
			rv[1] = this.getValue(1, 4);
			rv[1] = this.getValue(2, 4);
			rv[1] = this.getValue(3, 4);
			rv[1] = this.getValue(1, 5);
			rv[1] = this.getValue(2, 5);
			rv[1] = this.getValue(3, 5);
			rv[1] = this.getValue(1, 6);
			rv[1] = this.getValue(2, 6);
			rv[1] = this.getValue(3, 6);
		}

		if (r == 3 && c == 1) {
			rv[1] = this.getValue(1, 7);
			rv[1] = this.getValue(2, 7);
			rv[1] = this.getValue(3, 7);
			rv[1] = this.getValue(1, 8);
			rv[1] = this.getValue(2, 8);
			rv[1] = this.getValue(3, 8);
			rv[1] = this.getValue(1, 9);
			rv[1] = this.getValue(2, 9);
			rv[1] = this.getValue(3, 9);
		}

		if (r == 1 && c == 2) {
			rv[1] = this.getValue(4, 1);
			rv[1] = this.getValue(5, 1);
			rv[1] = this.getValue(6, 1);
			rv[1] = this.getValue(4, 2);
			rv[1] = this.getValue(5, 2);
			rv[1] = this.getValue(6, 2);
			rv[1] = this.getValue(4, 3);
			rv[1] = this.getValue(5, 3);
			rv[1] = this.getValue(6, 3);
		}

		if (r == 2 && c == 2) {
			rv[1] = this.getValue(4, 4);
			rv[1] = this.getValue(5, 4);
			rv[1] = this.getValue(6, 4);
			rv[1] = this.getValue(4, 5);
			rv[1] = this.getValue(5, 5);
			rv[1] = this.getValue(6, 5);
			rv[1] = this.getValue(4, 6);
			rv[1] = this.getValue(5, 6);
			rv[1] = this.getValue(6, 6);
		}

		if (r == 3 && c == 2) {
			rv[1] = this.getValue(4, 7);
			rv[1] = this.getValue(5, 7);
			rv[1] = this.getValue(6, 7);
			rv[1] = this.getValue(4, 8);
			rv[1] = this.getValue(5, 8);
			rv[1] = this.getValue(6, 8);
			rv[1] = this.getValue(4, 9);
			rv[1] = this.getValue(5, 9);
			rv[1] = this.getValue(6, 9);
		}

		if (r == 1 && c == 3) {
			rv[1] = this.getValue(7, 1);
			rv[1] = this.getValue(8, 1);
			rv[1] = this.getValue(9, 1);
			rv[1] = this.getValue(7, 2);
			rv[1] = this.getValue(8, 2);
			rv[1] = this.getValue(9, 2);
			rv[1] = this.getValue(7, 3);
			rv[1] = this.getValue(8, 3);
			rv[1] = this.getValue(9, 3);
		}

		if (r == 2 && c == 3) {
			rv[1] = this.getValue(7, 4);
			rv[1] = this.getValue(8, 4);
			rv[1] = this.getValue(9, 4);
			rv[1] = this.getValue(7, 5);
			rv[1] = this.getValue(8, 5);
			rv[1] = this.getValue(9, 5);
			rv[1] = this.getValue(7, 6);
			rv[1] = this.getValue(8, 6);
			rv[1] = this.getValue(9, 6);
		}

		if (r == 3 && c == 3) {
			rv[1] = this.getValue(7, 7);
			rv[1] = this.getValue(8, 7);
			rv[1] = this.getValue(9, 7);
			rv[1] = this.getValue(7, 8);
			rv[1] = this.getValue(8, 8);
			rv[1] = this.getValue(9, 8);
			rv[1] = this.getValue(7, 9);
			rv[1] = this.getValue(8, 9);
			rv[1] = this.getValue(9, 9);
		}
		System.out.println("Returning " + Arrays.toString(rv) + " As Square "
				+ r + ", " + c);

		return rv;
	}

	public boolean[][] getSquarePVals(int column, int row) {
		int c = 0;
		int r = 0;
		boolean[][] rv = new boolean[9][9];

		switch (column) {
		case 1:
			c = 1;
			break;
		case 2:
			c = 1;
			break;
		case 3:
			c = 1;
			break;
		case 4:
			c = 2;
			break;
		case 5:
			c = 2;
			break;
		case 6:
			c = 2;
			break;
		case 7:
			c = 3;
			break;
		case 8:
			c = 3;
			break;
		case 9:
			c = 3;
			break;
		}

		switch (row) {
		case 1:
			r = 1;
			break;
		case 2:
			r = 1;
			break;
		case 3:
			r = 1;
			break;
		case 4:
			r = 2;
			break;
		case 5:
			r = 2;
			break;
		case 6:
			r = 2;
			break;
		case 7:
			r = 3;
			break;
		case 8:
			r = 3;
			break;
		case 9:
			r = 3;
			break;
		}

		if (r == 1 && c == 1) {
			rv[1] = this.getPossibleValues(0, 0);
			rv[1] = this.getPossibleValues(1, 0);
			rv[1] = this.getPossibleValues(2, 0);
			rv[1] = this.getPossibleValues(0, 1);
			rv[1] = this.getPossibleValues(1, 1);
			rv[1] = this.getPossibleValues(2, 1);
			rv[1] = this.getPossibleValues(0, 2);
			rv[1] = this.getPossibleValues(1, 2);
			rv[1] = this.getPossibleValues(2, 2);
		}

		if (r == 2 && c == 1) {
			rv[1] = this.getPossibleValues(0, 3);
			rv[1] = this.getPossibleValues(1, 3);
			rv[1] = this.getPossibleValues(2, 3);
			rv[1] = this.getPossibleValues(0, 4);
			rv[1] = this.getPossibleValues(1, 4);
			rv[1] = this.getPossibleValues(2, 4);
			rv[1] = this.getPossibleValues(0, 5);
			rv[1] = this.getPossibleValues(1, 5);
			rv[1] = this.getPossibleValues(2, 5);

			if (r == 3 && c == 1) {
				rv[1] = this.getPossibleValues(0, 6);
				rv[1] = this.getPossibleValues(1, 6);
				rv[1] = this.getPossibleValues(2, 6);
				rv[1] = this.getPossibleValues(0, 7);
				rv[1] = this.getPossibleValues(1, 7);
				rv[1] = this.getPossibleValues(2, 7);
				rv[1] = this.getPossibleValues(0, 8);
				rv[1] = this.getPossibleValues(1, 8);
				rv[1] = this.getPossibleValues(2, 8);
			}

			if (r == 1 && c == 2) {
				rv[1] = this.getPossibleValues(4, 1);
				rv[1] = this.getPossibleValues(5, 1);
				rv[1] = this.getPossibleValues(6, 1);
				rv[1] = this.getPossibleValues(4, 2);
				rv[1] = this.getPossibleValues(5, 2);
				rv[1] = this.getPossibleValues(6, 2);
				rv[1] = this.getPossibleValues(4, 3);
				rv[1] = this.getPossibleValues(5, 3);
				rv[1] = this.getPossibleValues(6, 3);
			}

			if (r == 2 && c == 2) {
				rv[1] = this.getPossibleValues(4, 4);
				rv[1] = this.getPossibleValues(5, 4);
				rv[1] = this.getPossibleValues(6, 4);
				rv[1] = this.getPossibleValues(4, 5);
				rv[1] = this.getPossibleValues(5, 5);
				rv[1] = this.getPossibleValues(6, 5);
				rv[1] = this.getPossibleValues(4, 6);
				rv[1] = this.getPossibleValues(5, 6);
				rv[1] = this.getPossibleValues(6, 6);
			}

			if (r == 3 && c == 2) {
				rv[1] = this.getPossibleValues(4, 7);
				rv[1] = this.getPossibleValues(5, 7);
				rv[1] = this.getPossibleValues(6, 7);
				rv[1] = this.getPossibleValues(4, 8);
				rv[1] = this.getPossibleValues(5, 8);
				rv[1] = this.getPossibleValues(6, 8);
				rv[1] = this.getPossibleValues(4, 9);
				rv[1] = this.getPossibleValues(5, 9);
				rv[1] = this.getPossibleValues(6, 9);
			}

			if (r == 1 && c == 3) {
				rv[1] = this.getPossibleValues(7, 1);
				rv[1] = this.getPossibleValues(8, 1);
				rv[1] = this.getPossibleValues(9, 1);
				rv[1] = this.getPossibleValues(7, 2);
				rv[1] = this.getPossibleValues(8, 2);
				rv[1] = this.getPossibleValues(9, 2);
				rv[1] = this.getPossibleValues(7, 3);
				rv[1] = this.getPossibleValues(8, 3);
				rv[1] = this.getPossibleValues(9, 3);
			}

			if (r == 2 && c == 3) {
				rv[1] = this.getPossibleValues(7, 4);
				rv[1] = this.getPossibleValues(8, 4);
				rv[1] = this.getPossibleValues(9, 4);
				rv[1] = this.getPossibleValues(7, 5);
				rv[1] = this.getPossibleValues(8, 5);
				rv[1] = this.getPossibleValues(9, 5);
				rv[1] = this.getPossibleValues(7, 6);
				rv[1] = this.getPossibleValues(8, 6);
				rv[1] = this.getPossibleValues(9, 6);
			}

			if (r == 3 && c == 3) {
				rv[1] = this.getPossibleValues(7, 7);
				rv[1] = this.getPossibleValues(8, 7);
				rv[1] = this.getPossibleValues(9, 7);
				rv[1] = this.getPossibleValues(7, 8);
				rv[1] = this.getPossibleValues(8, 8);
				rv[1] = this.getPossibleValues(9, 8);
				rv[1] = this.getPossibleValues(7, 9);
				rv[1] = this.getPossibleValues(8, 9);
				rv[1] = this.getPossibleValues(9, 9);
			}
			System.out.println("Returning " + Arrays.toString(rv)
					+ " As Square " + r + ", " + c);
		}
		return rv;
	}

	public void update(int column, int row, int update) {
		System.out
				.println("Updating Puzzle For " + column + ", " + row + "...");
		Sudoku.UIMgr.SetText("Updating Puzzle For " + column + ", " + row
				+ "...");
		boolean[][] c = this.getColumnPVals(column);
		boolean[][] r = this.getRowPVals(row);
		boolean[][] sq = this.getSquarePVals(column, row);
		for (int d = 0; d < sq.length; d++) {
			sq[d][update] = false;
			System.out.println("Updating Square For " + column + ", " + row
					+ "...");
			Sudoku.UIMgr.SetText("Updating Square For " + column + ", " + row
					+ "...");
		}

		for (int d = 0; d < r.length; d++) {
			r[d][update] = false;
			System.out.println("Updating Row" + row + "...");
			Sudoku.UIMgr.SetText("Updating Row " + row + "...");
		}

		for (int d = 0; d < c.length; d++) {
			c[d][update] = false;
			System.out.println("Updating Column " + column + "...");
			Sudoku.UIMgr.SetText("Updating Column " + column + "...");
		}

	}

	public int getPosition(int column, int row) {
		int rv = (((row) * 9) + column);
		return rv;
	}
}
