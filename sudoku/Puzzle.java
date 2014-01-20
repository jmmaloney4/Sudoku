package sudoku;

import java.util.Arrays;

public class Puzzle {

	protected int[] values;
	protected boolean[][] possibleValues = new boolean[81][9];

	public Puzzle(int[] values) {
		this.values = values;
	}

	public int[] getValues() {
		return values;
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
		int a = (((row - 1) * 9) + column) - 1;
		System.out.println("Returning Value " + a + " To A Request For Column "
				+ column + " And Row " + row);
		return values[a];
	}

	public boolean[] getPossibleValues(int column, int row) {
		int a = (((row - 1) * 9) + column) - 1;
		System.out.println("Returning Value "
				+ Arrays.toString(possibleValues[a])
				+ " To A Request For Possible Values For Column " + column
				+ " And Row " + row);
		return possibleValues[a];
	}

	public void setPossibleValues(int column, int row, boolean[] posVals) {
		int a = (((row - 1) * 9) + column) - 1;
		System.out.println("Setting Possible Values To "
				+ Arrays.toString(posVals) + " For Column " + column
				+ " And Row " + row);
		possibleValues[a] = posVals;
	}

	public void setPossibleValue1(int column, int row) {
		int a = (((row - 1) * 9) + column) - 1;
		System.out.println("Setting 1 As A Possible Value To For Column "
				+ column + " And Row " + row);
		possibleValues[a][1] = true;
	}

	public void setPossibleValue2(int column, int row) {
		int a = (((row - 1) * 9) + column) - 1;
		System.out.println("Setting 1=2 As A Possible Value To For Column "
				+ column + " And Row " + row);
		possibleValues[a][2] = true;
	}

	public void setPossibleValue3(int column, int row) {
		int a = (((row - 1) * 9) + column) - 1;
		System.out.println("Setting 3 As A Possible Value To For Column "
				+ column + " And Row " + row);
		possibleValues[a][3] = true;
	}

	public void setPossibleValue4(int column, int row) {
		int a = (((row - 1) * 9) + column) - 1;
		System.out.println("Setting 4 As A Possible Value To For Column "
				+ column + " And Row " + row);
		possibleValues[a][4] = true;
	}

	public void setPossibleValue5(int column, int row) {
		int a = (((row - 1) * 9) + column) - 1;
		System.out.println("Setting 5 As A Possible Value To For Column "
				+ column + " And Row " + row);
		possibleValues[a][5] = true;
	}

	public void setPossibleValue6(int column, int row) {
		int a = (((row - 1) * 9) + column) - 1;
		System.out.println("Setting 6 As A Possible Value To For Column "
				+ column + " And Row " + row);
		possibleValues[a][6] = true;
	}

	public void setPossibleValue7(int column, int row) {
		int a = (((row - 1) * 9) + column) - 1;
		System.out.println("Setting 7 As A Possible Value To For Column "
				+ column + " And Row " + row);
		possibleValues[a][7] = true;
	}

	public void setPossibleValue8(int column, int row) {
		int a = (((row - 1) * 9) + column) - 1;
		System.out.println("Setting 8 As A Possible Value To For Column "
				+ column + " And Row " + row);
		possibleValues[a][8] = true;
	}

	public void setPossibleValue9(int column, int row) {
		int a = (((row - 1) * 9) + column) - 1;
		System.out.println("Setting 9 As A Possible Value To For Column "
				+ column + " And Row " + row);
		possibleValues[a][9] = true;
	}

	public void setNotPossible1(int column, int row) {
		int a = (((row - 1) * 9) + column) - 1;
		System.out.println("Setting 1 As A Possible Value To For Column "
				+ column + " And Row " + row);
		possibleValues[a][1] = false;
	}

	public void setNotPossible2(int column, int row) {
		int a = (((row - 1) * 9) + column) - 1;
		System.out.println("Setting 2 As A Possible Value To For Column "
				+ column + " And Row " + row);
		possibleValues[a][2] = false;
	}

	public void setNotPossible3(int column, int row) {
		int a = (((row - 1) * 9) + column) - 1;
		System.out.println("Setting 3 As A Possible Value To For Column "
				+ column + " And Row " + row);
		possibleValues[a][3] = false;
	}

	public void setNotPossible4(int column, int row) {
		int a = (((row - 1) * 9) + column) - 1;
		System.out.println("Setting 4 As A Possible Value To For Column "
				+ column + " And Row " + row);
		possibleValues[a][4] = false;
	}

	public void setNotPossible5(int column, int row) {
		int a = (((row - 1) * 9) + column) - 1;
		System.out.println("Setting 5 As A Possible Value To For Column "
				+ column + " And Row " + row);
		possibleValues[a][5] = false;
	}

	public void setNotPossible6(int column, int row) {
		int a = (((row - 1) * 9) + column) - 1;
		System.out.println("Setting 6 As A Possible Value To For Column "
				+ column + " And Row " + row);
		possibleValues[a][6] = false;
	}

	public void setNotPossible7(int column, int row) {
		int a = (((row - 1) * 9) + column) - 1;
		System.out.println("Setting 7 As A Possible Value To For Column "
				+ column + " And Row " + row);
		possibleValues[a][7] = false;
	}

	public void setNotPossible8(int column, int row) {
		int a = (((row - 1) * 9) + column) - 1;
		System.out.println("Setting 8 As A Possible Value To For Column "
				+ column + " And Row " + row);
		possibleValues[a][8] = false;
	}

	public void setNotPossible9(int column, int row) {
		int a = (((row - 1) * 9) + column) - 1;
		System.out.println("Setting 9 As A Possible Value To For Column "
				+ column + " And Row " + row);
		possibleValues[a][9] = false;
	}
}
