package com.four.sudoku;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Pattern;

import javax.swing.UnsupportedLookAndFeelException;

public class Sudoku {

	protected static Scanner scanner;
	protected static Puzzle puzzle = new Puzzle();
	protected static UIMgr UI = new UIMgr();
	public static final Pattern COMMA_PATTERN = Pattern.compile("\\s*,*\\s*");
	protected static int[] readfile = new int[81];

	public static void main(String[] args) throws InterruptedException,
			FileNotFoundException {

		long start = System.currentTimeMillis();

		try {
			UI.Start();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedLookAndFeelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		if (args.length < 1) {
			System.out.println("Not Enough Args");
			UI.AutoExit(3);
		}

		File file = new File(args[0]);
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			UI.SetText("File Was Not Found At: " + args[0]);
			Thread.sleep(2000);
			UI.AutoExit();
		}
		scanner = new Scanner(fis);
		scanner.useDelimiter(COMMA_PATTERN);
		UI.StartBar(readfile.length - 1, 0);
		for (int f = 0; f < readfile.length; f++) {
			int r;
			r = scanner.nextInt();
			if (r == 0) {
				puzzle.addNeeded();
			}
			UI.SetValue(f);
			readfile[f] = r;
			UI.SetText("Reading " + r);

		}

		UI.pbar.setMaximum(readfile.length);
		UI.pbar.setIndeterminate(true);
		UI.pbar.setValue(0);
		UI.SetText("Done Reading File");
		UI.SetText("Loading Values Into Puzzle Object...");
		UI.pbar.setIndeterminate(false);

		for (int d = 0; d < readfile.length; d++) {
			UI.SetText("Loading " + readfile[d]);
			UI.SetValue(d);
			Cell cell = new Cell();
			cell.setValue(readfile[d]);
			cell.setPosition(d);
			cell.setPuzzle(Sudoku.puzzle);
			cell.setParent(Sudoku.puzzle.getLCells()[Sudoku.getLCellFor(cell
					.getPosition())]);
			System.out.println(cell.getPosition());
			cell.setRow(Sudoku.puzzle.getRows()[Sudoku.getRow(cell
					.getPosition())]);
			puzzle.setValue(cell);
		}
		long end = System.currentTimeMillis();
		System.out.println("It took " + (end - start)
				+ " Miliseconds to solve your sudoku problem");

		UI.AutoExit();
	}

	public static int getLCellFor(int a) {
		for (int x = 0; x < Sudoku.getLCellValues(0).length; x++) {
			if (a == Sudoku.getLCellValues(0)[x]) {
				return 0;
			}
		}
		for (int x = 0; x < Sudoku.getLCellValues(1).length; x++) {
			if (a == Sudoku.getLCellValues(1)[x]) {
				return 1;
			}
		}
		for (int x = 0; x < Sudoku.getLCellValues(2).length; x++) {
			if (a == Sudoku.getLCellValues(2)[x]) {
				return 2;
			}
		}
		for (int x = 0; x < Sudoku.getLCellValues(3).length; x++) {
			if (a == Sudoku.getLCellValues(3)[x]) {
				return 3;
			}
		}
		for (int x = 0; x < Sudoku.getLCellValues(4).length; x++) {
			if (a == Sudoku.getLCellValues(4)[x]) {
				return 4;
			}
		}
		for (int x = 0; x < Sudoku.getLCellValues(5).length; x++) {
			if (a == Sudoku.getLCellValues(5)[x]) {
				return 5;
			}
		}
		for (int x = 0; x < Sudoku.getLCellValues(6).length; x++) {
			if (a == Sudoku.getLCellValues(6)[x]) {
				return 6;
			}
		}
		for (int x = 0; x < Sudoku.getLCellValues(7).length; x++) {
			if (a == Sudoku.getLCellValues(7)[x]) {
				return 7;
			}
		}
		for (int x = 0; x < Sudoku.getLCellValues(8).length; x++) {
			if (a == Sudoku.getLCellValues(8)[x]) {
				return 8;
			}
		}
		return -1;
	}

	public static int[] getLCellValues(int a) {
		int[] c0 = new int[9];
		int[] c1 = new int[9];
		int[] c2 = new int[9];
		int[] c3 = new int[9];
		int[] c4 = new int[9];
		int[] c5 = new int[9];
		int[] c6 = new int[9];
		int[] c7 = new int[9];
		int[] c8 = new int[9];
		int[] rv = { 0 };

		int r = 0;
		int c = 0;
		int c0n = 0;
		int c1n = 0;
		int c2n = 0;
		int c3n = 0;
		int c4n = 0;
		int c5n = 0;
		int c6n = 0;
		int c7n = 0;
		int c8n = 0;

		for (int b = 0; b < Sudoku.puzzle.getContents().length; b++) {
			if (r == 9) {
				c++;
				r = 0;
			}

			if (r < 3 && c < 3) {
				c0[c0n] = b;
				c0n++;
			} else if (r < 6 && r > 2 && c < 3) {
				c1[c1n] = b;
				c1n++;
			} else if (r < 9 && r > 5 && c < 3) {
				c2[c2n] = b;
				c2n++;
			} else if (r < 3 && c < 6 && c > 2) {
				c3[c3n] = b;
				c3n++;
			} else if (r < 6 && r > 2 && c < 6 && c > 2) {
				c4[c4n] = b;
				c4n++;
			} else if (r < 9 && r > 5 && c < 6 && c > 2) {
				c5[c5n] = b;
				c5n++;
			} else if (r < 3 && c < 9 && c > 5) {
				c6[c6n] = b;
				c6n++;
			} else if (r < 6 && r > 2 && c < 9 && c > 5) {
				c7[c7n] = b;
				c7n++;
			} else if (r < 9 && r > 5 && c < 9 && c > 5) {
				c8[c8n] = b;
				c8n++;
			}
			r++;
		}

		switch (a) {
		case 0:
			rv = c0;
			break;
		case 1:
			rv = c1;
			break;
		case 2:
			rv = c2;
			break;
		case 3:
			rv = c3;
			break;
		case 4:
			rv = c4;
			break;
		case 5:
			rv = c5;
			break;
		case 6:
			rv = c6;
			break;
		case 7:
			rv = c7;
			break;
		case 8:
			rv = c8;
			break;
		}

		return rv;
	}

	public static int getRow(int a) {
		for (int x = 0; x < Sudoku.getRowValues(0).length; x++) {
			if (a == Sudoku.getRowValues(0)[x]) {
				return 0;
			}
		}
		for (int x = 0; x < Sudoku.getRowValues(1).length; x++) {
			if (a == Sudoku.getRowValues(1)[x]) {
				return 1;
			}
		}
		for (int x = 0; x < Sudoku.getRowValues(2).length; x++) {
			if (a == Sudoku.getRowValues(2)[x]) {
				return 2;
			}
		}
		for (int x = 0; x < Sudoku.getRowValues(3).length; x++) {
			if (a == Sudoku.getRowValues(3)[x]) {
				return 3;
			}
		}
		for (int x = 0; x < Sudoku.getRowValues(4).length; x++) {
			if (a == Sudoku.getRowValues(4)[x]) {
				return 4;
			}
		}
		for (int x = 0; x < Sudoku.getRowValues(5).length; x++) {
			if (a == Sudoku.getRowValues(5)[x]) {
				return 5;
			}
		}
		for (int x = 0; x < Sudoku.getRowValues(6).length; x++) {
			if (a == Sudoku.getRowValues(6)[x]) {
				return 6;
			}
		}
		for (int x = 0; x < Sudoku.getRowValues(7).length; x++) {
			if (a == Sudoku.getRowValues(7)[x]) {
				return 7;
			}
		}
		for (int x = 0; x < Sudoku.getRowValues(8).length; x++) {
			if (a == Sudoku.getRowValues(8)[x]) {
				return 8;
			}
		}
		return -1;
	}

	public static int[] getRowValues(int a) {
		int[] rv = new int[9];
		int k = 0;
		switch (a) {
		case 0:
			for (int c = 0; c < rv.length; c++) {
				rv[c] = c;
			}
			break;
		case 1:
			k = 0;
			for (int c = 9; c < rv.length + 9; c++) {
				rv[k] = c;
				k++;
			}
			break;
		case 2:
			k = 0;
			for (int c = 18; c < rv.length + 18; c++) {
				rv[k] = c;
				k++;
			}
			break;
		case 3:
			k = 0;
			for (int c = 27; c < rv.length + 27; c++) {
				rv[k] = c;
				k++;
			}
			break;
		case 4:
			k = 0;
			for (int c = 36; c < rv.length + 36; c++) {
				rv[k] = c;
				k++;
			}
			break;
		case 5:
			k = 0;
			for (int c = 45; c < rv.length + 45; c++) {
				rv[k] = c;
				k++;
			}
			break;
		case 6:
			k = 0;
			for (int c = 54; c < rv.length + 54; c++) {
				rv[k] = c;
				k++;
			}
			break;
		case 7:
			k = 0;
			for (int c = 63; c < rv.length + 63; c++) {
				rv[k] = c;
				k++;
			}
			break;
		case 8:
			k = 0;
			for (int c = 72; c < rv.length + 72; c++) {
				rv[k] = c;
				k++;
			}
			break;
		}

		return rv;
	}

	public static int[] getColumnValues(int a) {
		int[] rv = new int[9];
		int k = 0;
		switch (a) {
		case 0:
			for (int c = 0; c < rv.length; c++) {
				rv[c] = c * 9;
			}
			break;
		case 1:
			k = 1;
			for (int c = 0; c < rv.length; c++) {
				rv[c] = (c * 9) + k;
			}
			break;
		case 2:
			k = 2;
			for (int c = 0; c < rv.length; c++) {
				rv[c] = (c * 9) + k;
			}
			break;
		case 3:
			k = 3;
			for (int c = 0; c < rv.length; c++) {
				rv[c] = (c * 9) + k;
			}
			break;
		case 4:
			k = 4;
			for (int c = 0; c < rv.length; c++) {
				rv[c] = (c * 9) + k;
			}
			break;
		case 5:
			k = 5;
			for (int c = 0; c < rv.length; c++) {
				rv[c] = (c * 9) + k;
			}
			break;
		case 6:
			k = 6;
			for (int c = 0; c < rv.length; c++) {
				rv[c] = (c * 9) + k;
			}
			break;
		case 7:
			k = 7;
			for (int c = 0; c < rv.length; c++) {
				rv[c] = (c * 9) + k;
			}
			break;
		case 8:
			k = 8;
			for (int c = 0; c < rv.length; c++) {
				rv[c] = (c * 9) + k;
			}
			break;
		}

		return rv;
	}

	public static int getColumn(int a) {
		for (int x = 0; x < Sudoku.getColumnValues(0).length; x++) {
			if (a == Sudoku.getColumnValues(0)[x]) {
				return 0;
			}
		}
		for (int x = 0; x < Sudoku.getColumnValues(1).length; x++) {
			if (a == Sudoku.getColumnValues(1)[x]) {
				return 1;
			}
		}
		for (int x = 0; x < Sudoku.getColumnValues(2).length; x++) {
			if (a == Sudoku.getColumnValues(2)[x]) {
				return 2;
			}
		}
		for (int x = 0; x < Sudoku.getColumnValues(3).length; x++) {
			if (a == Sudoku.getColumnValues(3)[x]) {
				return 3;
			}
		}
		for (int x = 0; x < Sudoku.getColumnValues(4).length; x++) {
			if (a == Sudoku.getColumnValues(4)[x]) {
				return 4;
			}
		}
		for (int x = 0; x < Sudoku.getColumnValues(5).length; x++) {
			if (a == Sudoku.getColumnValues(5)[x]) {
				return 5;
			}
		}
		for (int x = 0; x < Sudoku.getColumnValues(6).length; x++) {
			if (a == Sudoku.getColumnValues(6)[x]) {
				return 6;
			}
		}
		for (int x = 0; x < Sudoku.getColumnValues(7).length; x++) {
			if (a == Sudoku.getColumnValues(7)[x]) {
				return 7;
			}
		}
		for (int x = 0; x < Sudoku.getColumnValues(8).length; x++) {
			if (a == Sudoku.getColumnValues(8)[x]) {
				return 8;
			}
		}
		return -1;
	}
}
