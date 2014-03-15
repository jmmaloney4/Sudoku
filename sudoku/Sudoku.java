package sudoku;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Pattern;

import javax.swing.UnsupportedLookAndFeelException;

public class Sudoku {

	public static final String USAGE_STATMENT = "Usage: java sudoku.Sudoku path/to/sudoku/file";
	public static UIMgr UIMgr = new UIMgr();
	public static int[] infile = new int[81];
	protected static Puzzle puzzle = new Puzzle();
	public static final Pattern COMMA_PATTERN = Pattern.compile("\\s*,*\\s*");

	public static void main(String[] args) throws InterruptedException {
		// Starts the UI view
		try {
			UIMgr.Start();
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

		System.out.println("Welcome to the Sudoku Puzzle Solving Program");
		int needed = 0;
        
		// Check if user has submitted arguments
		if (args.length == 0) {
			System.err.println("E: Not enough arguments");
			System.err.println(Sudoku.USAGE_STATMENT);
			UIMgr.EnableExit();
			UIMgr.SetText("There Were No Arguments To The Program, Exiting...");
			Thread.sleep(2000);
			UIMgr.AutoExit(3, 1);
		}

		// Sleep Thread to allow UI time to load
		Thread.sleep(350);

		File file = new File(args[0]);
		Scanner scan;
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			UIMgr.SetText("File Was Not Found At: " + args[0]);
		}
		scan = new Scanner(fis);
		scan.useDelimiter(COMMA_PATTERN);

		for (int f = 0; f < infile.length; f++) {
			int r;
			r = scan.nextInt();
			if (r == 0) {
				r = 9;
				needed++;
			} else {
				r = r - 1;
			}

			// Sleep to allow UI time to display text
			Thread.sleep(5);
			infile[f] = r;
			System.out.println("Reading " + r);
			UIMgr.SetText("Reading " + r);
		}
		System.out.println("Done Reading File");
		UIMgr.SetText("Done Reading File");
		UIMgr.StartBar(needed, 0);

		for (int a = 0; a < puzzle.values.length; a++) {
			puzzle.setValue(puzzle.getRow(a), puzzle.getColumn(a), infile[a]);
			System.out.println("Adding " + infile[a] + " To The Puzzle At "
					+ puzzle.getRow(a) + ", " + puzzle.getColumn(a));
			Sudoku.UIMgr.SetText("Adding " + infile[a] + " To The Puzzle At "
					+ puzzle.getRow(a) + ", " + puzzle.getColumn(a));
			puzzle.update(puzzle.getRow(a), puzzle.getColumn(a), infile[a]);
		}

		System.out.println("Done.");
		UIMgr.SetText("Done");
		UIMgr.AutoExit(3);
	}
}
