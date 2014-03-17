package com.four.sudoku;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
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

		LCell.getConts(0);

		File file = new File(args[0]);
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			UI.SetText("File Was Not Found At: " + args[0]);
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
			cell.setParent(Sudoku.puzzle.getLCells()[puzzle
					.getLCellForArrayPos(d)]);
			puzzle.setValue(cell);
		}

		UI.AutoExit(3);
	}

	public static int[] getConts(int a) {
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

		System.out.println(Arrays.toString(c0));
		System.out.println(Arrays.toString(c1));
		System.out.println(Arrays.toString(c2));
		System.out.println(Arrays.toString(c3));
		System.out.println(Arrays.toString(c4));
		System.out.println(Arrays.toString(c5));
		System.out.println(Arrays.toString(c6));
		System.out.println(Arrays.toString(c7));
		System.out.println(Arrays.toString(c8));

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
}
