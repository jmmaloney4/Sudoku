package com.four.sudoku;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;

import javax.swing.UnsupportedLookAndFeelException;

public class Sudoku {

	static Scanner scanner;
	static Puzzle puzzle = new Puzzle();
	static UIMgr UI = new UIMgr();
	public static final Pattern COMMA_PATTERN = Pattern.compile("\\s*,*\\s*");
	static int[] readfile = new int[81];
	static int needed = puzzle.getNeeded();

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

		File file = new File(args[0]);
		Scanner scan;
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
				needed++;
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
			puzzle.setValue(new Cell(Sudoku.puzzle, d, readfile[d]));
		}
		System.out.println(Arrays.toString(readfile));
		puzzle.debug_printArray();

		puzzle.Solve();

		UI.AutoExit(3);
	}
}
